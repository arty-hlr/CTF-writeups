import itertools as it

numberToLetter = {}
numberToLetter[0] = 'A'
numberToLetter[1] = 'P'
numberToLetter[2] = 'Z'
numberToLetter[3] = 'L'
numberToLetter[4] = 'G'
numberToLetter[5] = 'I'
numberToLetter[6] = 'T'
numberToLetter[7] = 'Y'
numberToLetter[8] = 'E'
numberToLetter[9] = 'O'
numberToLetter[10] = 'X'
numberToLetter[11] = 'U'
numberToLetter[12] = 'K'
numberToLetter[13] = 'S'
numberToLetter[14] = 'V'
numberToLetter[15] = 'N'

letterToNumber = {}
for i,j in numberToLetter.items():
    letterToNumber[j] = i

def translate(t):
    L1 = letterToNumber[t[0]]
    L2 = letterToNumber[t[1]]
    L3 = letterToNumber[t[2]]
    L4 = letterToNumber[t[3]]
    L5 = letterToNumber[t[4]]
    L6 = letterToNumber[t[5]]

    a = L2
    a &= 8
    a <<= 4
    d = a
    a = L3
    a &= 7
    a <<= 4
    d |= a
    a = L4
    a &= 7
    a <<= 0xc
    d |= a
    a = L4
    a &= 8
    d |= a
    a = L5
    a &= 8
    a <<= 8
    d |= a
    a = L5
    a &= 7
    d |= a
    a = L6
    a &= 7
    a <<= 8
    a |= d
    d = a
    ADDR = d

    a = L1
    a &= 7
    d = a
    a = L1
    a &= 8
    a <<= 4
    d |= a
    a = L2
    a &= 7
    a <<= 4
    d |= a
    a = L6
    a &= 8
    a |= d
    d = a
    BYTE = d

    return str(hex(ADDR)) + ',' + str(hex(BYTE))

def main():
    with open('table', 'w') as f:
        for t in list(it.product('APZLGITYEOXUKSVN', repeat=6)):
            code = translate(t)
            f.write(''.join(t)+' '+code+'\n')

if __name__ == '__main__':
    main()
