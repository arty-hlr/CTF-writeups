from sage.all import *
from cryptools.env import *

from vw import *

K11 = None
if 0:
    F = open("data.new")
    #K11 = [805, 94, 305, 793, 1013, 288, 861, 127]
else:
    F = open("data_local.new")
    # comment this to recover K11 first
    # K11 = [181, 286, 685, 452, 69, 798, 889, 480]

print "FILE", F

pairs = []
ctbytes = [[0] * 1024 for _ in xrange(8)]

itr = 0
bestids = Counter()
for line in F:
    itr += 1
    if not line.strip(): break

    data = tuple(map(int, line.split()))
    pt = data[:8]
    ct = data[8:16]
    ctids = data[16:24]

    if K11:
        if itr == 1: print "Undoing last round..."
        ct = xorlists(ct, K11)
        ct = [ct[0], ct[5], ct[2], ct[7], ct[4], ct[1], ct[6], ct[3]]
        for i in xrange(8):
            ct[i] = Si[i](ct[i])
        ct = mulMi(ct[:4]) + mulMi(ct[4:])
        ctids = tuple(Wi[i&3](y) >> 5 for i, y in enumerate(ct))

    bestids[ctids] += 1

    pairs.append((pt, ct, ctids))
    for i, id in enumerate(ct):
        ctbytes[i][id] += 1

    if itr % (2**16) == 0:
        print hex(itr)
        sys.stdout.flush()

thebest = None
for a, b in bestids.most_common(50):
    if thebest is None:
        thebest = a
    print " ".join("%3d" % v for v in a), ":", b

by_pos = [list() for _ in xrange(8)]
for pt, ct, ctids in pairs:
    if sum(a == b for a, b in zip(ctids, thebest)) in (7,):
        for i in xrange(8):
            if ctids[i] != thebest[i]:
                by_pos[i].append((pt, ct, ctids))

klast = []
for i in xrange(8):
    ii = P[i]

    cnt = Counter()
    print len(by_pos[i]), "texts"
    for k in xrange(1024):
        bestid = thebest[i]
        subcnt = Counter()
        for x in xrange(32):
            y = (bestid << 5) | x
            y =  W[ii&3][y]
            y ^= k
            y = Si[ii&3][y]
            y = Vi[ii&3][y] >> 5
            subcnt[y] += 1
        xcoset, subcnt = subcnt.most_common()[0]
        assert subcnt >= 24

        for pt, ct, ctids in by_pos[i]:
            c = ct[i] ^ k
            c = Si[ii&3](c)
            coset = Vi[ii&3][c] >> 5
            if coset == xcoset:
                cnt[k] += 1
    klast.append(cnt.most_common(1)[0][0])
    for k, c in cnt.most_common(3):
        print k, c
    print

if K11 is None:
    print "K11", klast
    quit()

print "K11", K11
k10p = klast
print "k10p", k10p
K10 = mulM(k10p[:4]) + mulM(k10p[4:])
print "K10", K10

# revert ks
x = list(K10[4:]) + list(K11)
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

master_key = "".join(map(chr, x))
print "master key", master_key.encode("hex"), repr(master_key)

from main_cipher import Cipher

cipher = Cipher(master_key)
ct = open("encrypted").read()
print `cipher.decrypt(ct)`
