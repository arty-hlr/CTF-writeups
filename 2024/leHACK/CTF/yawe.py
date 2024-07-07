import binascii

with open('README.txt', 'rb') as f:
    t = f.read()

b = t[12:-13]

h = binascii.hexlify(t[12:-13])
for i in range(len(h)//6):
    print(h[i*6:(i*6)+6].decode())

