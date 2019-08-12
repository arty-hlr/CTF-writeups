from pwn import *
import re
import hashX
from operator import mul
from functools import reduce

ip = "167.71.62.250"
port = 12439
# aron II
# port = 23549

def bruteforce_len_a():
    s = remote(ip,port)
    crack(s)
    for i in range(65,150):
        toSend = "n\ny\n"+str(2**i)+"\n"
        try:
            s.recvuntil("[N]ew")
        except EOFError:
            s.close()
            return i-1
        s.send(toSend.encode())

def gg(tup, a, x):
    (_, p, g), n = tup, len(a)
    assert len(bin(x)[2:]) <= n
    X = bin(x)[2:].zfill(n)
    f_ax = g
    for i in range(1, n):
        f_ax *= pow(g, a[i] * int(X[i]), p)
    return f_ax % p

def crack(s):
    q = s.recv().decode()
    func, toCrack = re.search("([a-z]+[0-9]+).* = (.{6})", q).groups()
    print("[+] Cracking POW...")
    cracked = hashX.main(toCrack, func)
    s.sendline(cracked) 

def bruteforce_a():
    s = remote(ip,port)
    crack(s)
    a = [1 for _ in range(128)]
    a_p = [1 for _ in range(128)]
    r = s.recvuntil("[Q]uit").decode()
    p,g = re.search("\(p, g\) = \((0x[a-f0-9]+), (0x[a-f0-9]+)\)", r).groups()
    p = int(p,16)
    g = int(g,16)
    n = 0
    print('[+] Computing the secret vector a...')
    for i in reversed(range(127)):
        n += 2**i
        toSend = "n\ny\n"+str(n)+"\n"
        s.send(toSend.encode())
        s.recvuntil('PRF')
        s.recvline()
        r = s.recvline().decode()
        f_an = int(re.findall("= ([0-9]+)", r)[0])
        prev = reduce(mul, a_p, 1)
        for j in range(255):
            if g*prev*pow(g,j,p)%p == f_an:
                a[127-i] = j
                a_p[127-i] = pow(g,a[127-i],p)
                break
        s.recv()

    tup = (0,p,g)
    guess = gg(tup,a,n+5)
    toSend = "g\n"+str(guess)+"\n"
    print('[+] Done, f_a(n + 5) is ' + str(guess) + '!')
    s.send(toSend.encode())
    s.recvline()
    print('[!] ' + s.recvline().decode())
    s.close()

def main():
    # len_a = bruteforce_len_a()
    # print(len_a)

    bruteforce_a()

if __name__ == "__main__":
    main()
