import requests
from hashlib import sha256
import binascii

table = {}
for i in range(256):
    # table[i] = binascii.hexlify(sha256(binascii.unhexlify(hex(i)[2:].zfill(2))).digest()).decode()
    table[i] = sha256("{:02x}".format(i).encode()).hexdigest()

i=2
r1 = requests.get('http://memenc.challenges.bsidestlv.com/'+hex(i)[2:]).json()
if r1["header"] == "Secure":
    s = []
    for j in range(int(r1["length"],16)):
        r2 = requests.get('http://memenc.challenges.bsidestlv.com/hash/'+hex(i)[2:]+":1:"+hex(j)[2:]).json()
        for n,h in table.items():
            if r2['data'] == h:
                s.append(chr(n))
                break
    print(''.join(s))

# print(d["header"])
# print(d["length"])
# print(d["data"])
