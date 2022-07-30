from bma import Berlekamp_Massey_algorithm
import binascii

m = "This cipher is military grade LFSR with random padding, key and mask! Good luck & have fun! Inputs were generated to be solvable"
ct = binascii.unhexlify(open("flag.enc", "rb").read())

class LFSR:
    def __init__(self, register, branches):
        self.register = register
        self.branches = branches
        self.n = len(register)

    def next_bit(self):
        ret = self.register[self.n - 1]
        new = 0
        for i in self.branches:
            new ^= self.register[i - 1]
        self.register = [new] + self.register[:-1]
        return ret

def xor(s1, s2):
    return ''.join([chr(ord(a)^ord(b)) for a,b in zip(s1,s2)])

def get_lfsr(ct, m, i):
    xored = xor(ct[i+1:i+1+len(m)],m)
    lfsr_output = [int(n) for n in list(bin(int(binascii.hexlify(xored),16))[2:].zfill(8*len(m)))]
    (pol, span) = Berlekamp_Massey_algorithm(lfsr_output)
    pol.pop()
    branches = []
    for j in pol:
        branches.insert(0,span-j)
    register = list(reversed(lfsr_output[:span]))
    return (register, branches)

def main():
    for i in range(256,512):
        register,branches = get_lfsr(ct, m, i)
        if len(register) > 500:
            continue
        generator = LFSR(register, branches)
        pt = []
        ct_bits = [int(n) for n in list(bin(int(binascii.hexlify(ct[i+1:]),16))[2:].zfill(8*len(ct[i+1:])))]
        for j in range(len(ct_bits)):
            pt.append(ct_bits[j] ^ generator.next_bit())
        pt_bits = ''.join(map(str,pt))
        n = int(pt_bits, 2)
        n = hex(n)[2:].strip('L')
        pt = binascii.unhexlify(n)
        start = pt.find('p4')
        end = pt[start:].find('}')+start
        print(pt[start:end+1])
        exit()

if __name__ == '__main__':
    main()
