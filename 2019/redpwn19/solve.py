from pwn import *
from Crypto.Util.number import *

ip = "chall.2019.redpwn.net"
port = 5001

def main():
    s = remote(ip,port)
    output = s.recv().decode()
    print(output.split())

