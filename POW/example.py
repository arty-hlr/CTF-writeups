from pwn import *
import hashX

ip = ""
port = 0

def main():
    s = remote(ip,port)
    crack(s)
    s.interactive()

def crack(s):
    s.recvuntil("that ")
    q = s.recvline().decode()
    func, toCrack = re.search("([a-z]+[0-9]+).* = (.{6})", q).groups()
    print("Cracking POW...")
    cracked = hashX.main(toCrack, func)
    s.sendline(cracked) 

if __name__ == '__main__':
    main()
