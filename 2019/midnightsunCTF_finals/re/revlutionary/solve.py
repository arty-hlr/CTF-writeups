import binascii

f = open('revlutionary', 'rb').read()[0xe1:0x100e1]
zeros = []
for i,v in enumerate(f):
    if v == 0x00:
        zeros.append(i)
for z in zeros:
    print(hex(z))

def regress(a,v):
    if v == 0x2a:
        print(hex(a),hex(v))
        return True
    if f[a] == v:
        a1 = a >> 8
        v1 = a & 0x00ff
        for i in range(0x100):
            a_c = i*256 + a1
            if regress(a_c,v1):
                print(hex(a),hex(v))
                return True
                
for z in zeros:
    regress(z,0x00)
