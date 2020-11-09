from pwn import *

io = remote("chal.cybersecurityrumble.de", 65123)

flag = 53225
# i = 1804289383
i = int(io.recvline().decode().strip())
# log.info(i)
k = 12
e = i ^ flag
io.sendline(f'{str(k)} {str(e)}')
log.info(io.recvline().decode())



# k = input()
# e = input()
# for j in range(7):
#     k = i >> (k%3)
#     k ^= e
# if k == 53225:
#     flag
