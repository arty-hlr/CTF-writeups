import hashX
from pwn import *
import json

s = remote('outofthesbox.insomnihack.ch', 1337)

s.recvuntil('with "')
h = s.recv(6).decode()
found = hashX.main(h,'md5')
log.info(f"found string: {found}")
s.sendline(found)
s.recvuntil('...\n')
tab = str.maketrans('()','[]')
inp = s.recvuntil('\n').decode().translate(tab)
sboxes = json.loads(inp)
# log.info(len(sbox))
