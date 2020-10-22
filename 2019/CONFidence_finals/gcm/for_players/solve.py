import binascii
from Crypto.Cipher import AES
from Crypto.Util import Counter
from gcm import *

def xor(s1, s2):
    return ''.join([chr(ord(a)^ord(b)) for a,b in zip(s1,s2)])

first_bytes = b"\x89\x50\x4e\x47\x0d\x0a\x1a\x0a\x00\x00\x00\x0d\x49\x48\x44\x52\x00"

ct = open("flag.png.enc", "rb").read()
keys = [long_to_bytes(k).zfill(128/8) for k in range(2^127, 2^128+1)]
print(keys)
ct_first_bytes = ct[:16]
xored = xor(first_bytes, ct_first_bytes)
for i,key in enumerate(keys):
    aes = AES.new(key)
    nonce = aes.decrypt(xored)
    ctr = Counter.new(128, initial_value=int(binascii.hexlify(nonce),16))
    aesctr = AES.new(key, AES.MODE_CTR, counter=ctr)
    pt = aesctr.decrypt(ct)
    with open("pt"+str(i)+".png", "wb") as f_out:
        f_out.write(pt)
