from pwn import *
import hashX

ip = "167.71.62.250"
port = 20029

def crack(s):
    s.recvuntil("that ")
    q = s.recvline().decode()
    func, toCrack = re.search("([a-z]+[0-9]+).* = (.{6})", q).groups()
    print("Cracking POW...")
    cracked = hashX.main(toCrack, func)
    s.sendline(cracked) 

def main():
    s = remote(ip,port)
    crack(s)
    s.interactive()


if __name__ == "__main__":
    main()
