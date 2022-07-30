from pwn import *
import hashcash
from time import strftime, localtime, time
import sys

run = sys.argv[1]

if run == 'r':
    s = remote('ipppc.pwni.ng',9669)
    magic = ''
else:
    s = remote('172.17.0.2',9669)
    magic = '1a399f0b340273bd'

challenge = s.recvline().strip()
if magic:
    s.sendline(magic)
else:
    stamp = '0:{}:{}:'.format(strftime("%y%m%d%H%M%S",localtime(time())),challenge)
    suffix = hashcash._mint('0:{}:{}:'.format(strftime("%y%m%d%H%M%S",localtime(time())),challenge),28)
    stamp += suffix
    print(stamp)
    s.sendline(stamp)
s.sendline('https://en.wikipedia.org/wiki/Main_Page')
s.sendline('Bacon')
s.interactive()

