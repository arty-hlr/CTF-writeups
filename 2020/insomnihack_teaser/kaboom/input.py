from pwn import *
s = 0x42
b = b''
b += p32(0x4ce1b463)
b += p32(0xd7831bba)
b += p32(0x0046f113)

out = []
for c in b:
    if c == b'\x00':
        break
    n = (c-s)%256
    s = c
    out.append(p8(n))

print(out)
print(len(out))
