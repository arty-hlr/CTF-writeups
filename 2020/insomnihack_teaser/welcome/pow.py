import hashX
from pwn import *

s = remote('welcome.insomnihack.ch',1337)

s.recvuntil('with "')
h = s.recv(6).decode()
found = hashX.main(h,'md5')
log.info(f"found string: {found}")
s.sendline(found)
log.info(s.recvall().decode())
