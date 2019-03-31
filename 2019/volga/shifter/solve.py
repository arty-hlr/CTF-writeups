import binascii
from bma import Berlekamp_Massey_algorithm

def build_flag(flag, offset, l):
    flag_bin_text = bin(int(binascii.hexlify(flag.encode()), 16))[2:]
    flag_bits = [0]*offset+[0]+[int(i) for i in flag_bin_text]+[0]*(l-offset)
    return flag_bits

def get_lfsr(ct_bits, flag_bits, offset):
    lfsr_output = []
    m = min(72+offset, len(flag_bits), len(ct_bits))
    for i in range(offset, m):
        lfsr_output.append(flag_bits[i]^ct_bits[i])

    (pol, span) = Berlekamp_Massey_algorithm(lfsr_output)
    pol.pop()
    branches = []
    for i in pol:
        branches.insert(0,span-i)
    register = list(reversed(lfsr_output[:span]))
    return (register, branches)


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

def main():
    with open('encrypted.bin', 'rb') as f:
        ct = bin(int(binascii.hexlify(f.read()), 16))[2:]
        ct_bits = [int(i) for i in ct]

    for offset in range(len(ct_bits)):
        flag = 'VolgaCTF{'
        flag_bits = build_flag(flag, offset, len(ct_bits))
        register, branches = get_lfsr(ct_bits, flag_bits, offset)
        generator = LFSR(register, branches)
        ptext = []
        for j in range(offset, len(ct_bits)):
            ptext.append(ct_bits[j] ^ generator.next_bit())
            # ptext.append(generator.next_bit())
        # print(ptext[:72])
        # print()
        plaintext = '0b' + ''.join(map(str,ptext))
        n = int(plaintext, 2)
        n = hex(n)[2:]
        try:
            s = binascii.unhexlify(n).decode()
            if '}' in s:
                print(s[:s.find('}')+1])
                exit()
        except:
            pass

if __name__ == '__main__':
    main()

