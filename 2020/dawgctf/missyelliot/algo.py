def Not(n):
    return 0xff-n

def fun1(word):
    return [Not(b) for b in word]

def fun2(word):
    result = []
    for b in word:
        res = 0
        for i in range(8):
            t = 1 << i
            if b & t:
                j = 7-i
                t2 = 1 << j
                res |= t2
        result.append(res)

    for i in range(0x15):
        t = result[i]
        result[i] = result[0x2a-i]
        result[0x2a-i] = t

    return result

f = open('goal.bin','rb')
word = f.read(43)
word = list(word)
word = fun1(word)
word = fun2(word)

print(bytes(word).decode())
