from functools import partial
def firstalgo(a, k):
    res = [0] * 64
    for i in range(0, 64):
        res[i] = ord(a[i]) ^ k[i]
    return res

def secondalgo(arr, rcx, shift):
    res = [0] * 64
    last = arr[63]
    for i in range(0, 64):
        first = arr[i] << rcx
        if i == 0:
            second = (last << rcx) >> 8
        else:
            second = (arr[i - 1] << rcx) >> 8
        res[(i + shift) % 64] = (first | second) % 0x100
    return res



key =[0xe1, 0xa9, 0xe1, 0x2e, 0x0b, 0x15, 0x44, 0x9c, 0x08, 0xdc, 0xdc, 0xf3, 0x1a, 0x91, 0x9c, 0x6e, 0x34, 0x5c, 0xe4, 0x5e, 0xf9, 0xe2, 0x5f, 0xf1, 0xf0, 0x86, 0x05, 0xa8, 0x70, 0x6e, 0x04, 0x53, 0x9d, 0x31, 0xec, 0x10, 0xab, 0xea, 0xf6, 0x74, 0x44, 0x79, 0x0f, 0x28, 0x53, 0x40, 0x37, 0x2c, 0x17, 0x9a, 0xc3, 0x67, 0x95, 0x2f, 0x4b, 0x27, 0xd9, 0x3f, 0xf9, 0x1d, 0x2a, 0x70, 0x77, 0x5d]

blocks = []
i = 0
inp = ""
with open('abc', 'rb') as openfileobject:
   for chunk in iter(partial(openfileobject.read, 64), b''):
           blocks.append(chunk)

encrypted = []

for block in blocks:
    firstalgo_res = firstalgo(block, key)
    rcx = 5
    shift = 9
    encrypted_block = secondalgo(firstalgo_res, rcx, shift)
    encrypted_block = ', '.join('0x%02x' % b for b in encrypted_block)
    encrypted.append(encrypted_block)
    rcx = 7
    shift = 0xd
    key = secondalgo(key, rcx, shift)
    key = firstalgo(block, key)

print encrypted
