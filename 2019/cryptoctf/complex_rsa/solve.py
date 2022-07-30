from pwn import *
from Crypto.Util.number import *
import hashX
import subprocess

def square(a,b,n):
    return ((a**2 - b**2)%n, (a*b+b*a)%n)

def multiply(a,b,a1,b1,n):
    return ((a*a1 - b*b1)%n, (a*b1+b*a1)%n)

def complex_pow(a,b,e,n):
    a1,b1 = a,b
    e_b = bin(e)[3:]
    for i in e_b:
        if i == '1':
            a,b = square(a,b,n)
            a,b = multiply(a,b,a1,b1,n)
        elif i == '0':
            a,b = square(a,b,n)
    return (a,b)

ip = "167.71.62.250"
port = 14559

def crack(s):
    s.recvuntil("that ")
    q = s.recvline().decode()
    func, toCrack = re.search("([a-z]+[0-9]+).* = (.{6})", q).groups()
    print("[*] Cracking POW...")
    cracked = hashX.main(toCrack, func)
    s.sendline(cracked) 

def get_n(s):
    while True:
        print("[*] Retrieving n...")
        s.send("t\n(-1,0)\n".encode())
        s.recvuntil("mod n) = ")
        res = s.recv().decode()
        a,_ = list(map(int, re.findall("([0-9]+)L", res)))
        return a+1

def factor(n):
    print("[*] Factoring n...")
    inp = 'factor('+str(n)+')'
    factors = list(map(int, re.findall("P[0-9]+ = ([0-9]+)", subprocess.run('yafu', input=inp.encode(), capture_output=True).stdout.decode())))
    return factors

def get_e(s,n):
    print("[*] Retrieving e...")
    s.send("t\n(2,0)\n".encode())
    s.recvuntil("mod n) = ")
    res = s.recv().decode()
    a,_ = list(map(int, re.findall("([0-9]+)L", res)))
    
    e = 0
    while True:
        e += 1
        a_ = pow(2,e,n)
        if a_ == a:
            return e

def decrypt(s,e,d,n):
    print("[*] Decrypting message...")
    s.send("e\n")
    s.recvuntil("enc = ")
    res = s.recv().decode()
    a,b = list(map(int, re.findall("([0-9]+)L", res)))
    c,d = complex_pow(a,b,d,n)
    a_,b_ = complex_pow(c,d,e,n)
    toSend = "s\n("+str(c)+", "+str(d)+")\n"
    s.send(toSend.encode())
    s.recvline()

def main():
    s = remote(ip,port)
    crack(s)
    s.recvuntil("Options:\n")
    n = get_n(s)
    p,q = factor(n)
    phi_n = (p*p-1)*(q*q-1)
    e = get_e(s,n)
    d = inverse(e,phi_n)
    decrypt(s,e,d,n)
    print(s.recvline().decode())

if __name__ == '__main__':
    main()
