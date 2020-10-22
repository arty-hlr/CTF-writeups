from sage.all import *
from cryptools.env import *

from vw import *

KEY = "\x34\x23\x2b\x4a\x45\xb5\x12\xc3\x34\x45\x76\xd7"
KEY = "ABCD1234abcd"
EXPKEY = expand_key(KEY)
print EXPKEY[-1]

m10 = EXPKEY[-2]
m11 = EXPKEY[-1]

m11 = [805, 94, 305, 793, 1013, 288, 861, 127]
m10 = [208, 382, 620, 870, 312, 1015, 166, 296]

# revert ks
x = list(m10[4:] + m11)

for i in reversed(range(7)):
    a = list(x[:4])
    b = list(x[4:8])
    c = list(x[8:12])
    c = xorlists(c, b)
    b = xorlists(b, a)

    x = c
    x = mulM(x)
    x = [S[0][x[0]], S[1][x[1]], S[2][x[2]], S[3][x[3]]]
    x = [x[0] ^ pow(3, i, 2 ** 10), x[1], x[2], x[3]]
    a = xorlists(a, x)
    x = a + b + c

key = "".join(map(chr, x))
print key.encode("hex")
print KEY.encode("hex")


# quit()


def expand_key(master_key):
    k = map(ord, master_key)
    for i in range(7):
        minp = k[12 * i + 8], k[12 * i + 9], k[12 * i + 10], k[12 * i + 11]
        x = mulM(minp)
        x = [S[0][x[0]], S[1][x[1]], S[2][x[2]], S[3][x[3]]]
        x = [x[0] ^ pow(3, i, 2 ** 10), x[1], x[2], x[3]]
        k12_15 = xorlists( ([k[12 * i + 0], k[12 * i + 1], k[12 * i + 2], k[12 * i + 3]]),   x )
        k16_19 = xorlists( ([k[12 * i + 4], k[12 * i + 5], k[12 * i + 6], k[12 * i + 7]]),   k12_15 )
        k20_23 = xorlists( ([k[12 * i + 8], k[12 * i + 9], k[12 * i + 10], k[12 * i + 11]]),   k16_19 )
        k = k + k12_15 + k16_19 + k20_23

    ret_k = []
    for r in range(12):
        kr = []
        for i in range(8):
            kr = kr + [k[8 * r + i]]
        ret_k.append(kr)
    return ret_k

# quit()

def get_pair():
    pt = [V[i&3](randint(0, 31)) for i in xrange(8)]
    ct = encrypt(pt, EXPKEY)
    return pt, ct

itr = 0
with open("data_local", "a") as fo:
    while True:
        pt, ct = get_pair()
        fo.write(`(pt, ct)` + "\n")
        fo.flush()
        itr += 1
        if itr % 2**14 == 0:
            print hex(itr)
quit()



# pt = "ABCDEFGHIJ"
# pt = str_to_nums(pt)
# ct = encrypt(pt, EXPKEY)
# ct = nums_to_str(ct)
# print ct.encode("hex")
cntrs = [Counter() for _ in xrange(8)]
for itr in xrange(2**24):
    pt, ct = get_pair()
    # debug: one s-box layer
    # ct = [S[i&3](x) for i, x in enumerate(pt)]

    ctids = [Wi[i&3](y) >> 5 for i, y in enumerate(ct)]
    for i, id in enumerate(ctids):
        cntrs[i][id] += 1
    # print itr, ctids

    if itr % (2**14) == 0:
        print hex(itr)
        for i, cntr in enumerate(cntrs):
            print cntr.most_common(5)
        print

# id = 0
# s = (~W[id]) * S[id] * V[id]
# for x, y in s.graph():
#     print "x", tobin(x, 10),
#     print "y", tobin(y, 10)
