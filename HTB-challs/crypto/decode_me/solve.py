import base64
from Crypto.Cipher import AES
from Crypto.Util import Counter

with open('Decode.txt','r') as f:
    ct_b64 = f.read().split('\n\n')

ct = []
for w in ct_b64:
    ct.append(base64.b64decode(w))

key,ct = ct

ctr = Counter.new(AES.block_size * 8, initial_value=0)
aes = AES.new(key, AES.MODE_CTR, counter=ctr)
print(aes.decrypt(ct[:256]))
