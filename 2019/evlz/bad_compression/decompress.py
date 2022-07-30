import binascii

flag = "evlz"
b = ""
for i in range(len(flag)):
    b += bin(ord(flag[i]))[2:].zfill(8)

def printable_flag(string):
    hexstring = ''
    for i in range(len(string)//8):
        hexstring += hex(int(string[i*8:i*8+8], 2))[2:]
    print(hexstring)
    flag = binascii.unhexlify(hexstring).decode()
    print(flag)
    return(flag.isprintable())

print(printable_flag(b))
