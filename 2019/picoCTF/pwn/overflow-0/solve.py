from pwn import *

p = process(["./vuln",cyclic(200)])

print(p.recvall())
