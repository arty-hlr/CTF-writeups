for i in range(32):
    eax = i
    eax <<= 0x16
    eax &= 0x400000
    edx = eax
    eax = 0x56556405
    eax &= 0xffc00000
    eax += 0x800000
    eax += edx
    print(hex(eax))

