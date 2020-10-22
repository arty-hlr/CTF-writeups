from pwn import *
import re
import numbthy
import binascii

host = 'docker.hackthebox.eu'
port = 41138


def get_values():
    s = remote(host,port)
    s.recvuntil('Enter the option: ')
    s.sendline(b'4')
    response = s.recv(4096).decode()
    pub_key = int(re.findall('PUBLIC KEY: ([0-9]+)', response)[0])
    ct = int(re.findall('ENCRYPTED PASSWORD: ([0-9]+)', response)[0])
    return (pub_key, ct, s)

pubkey1 = get_values()[0]
pubkey2 = get_values()[0]
p = numbthy.gcd(pubkey1,pubkey2)

pubkey,ct,s = get_values()
q = pubkey // p

e = 65537
phi = (p-1)*(q-1)
privkey = numbthy.inverse_mod(e,phi)
pt = pow(ct,privkey,pubkey)
password = binascii.unhexlify(hex(pt)[2:])

s.sendline(password)
print(s.recv(1024))

