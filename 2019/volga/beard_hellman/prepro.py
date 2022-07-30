from sage.all import *
from cryptools.env import *

from vw import *

import ast

def encrypt(x, k):
    for r in range(10):
        x = xorlists(x, k[r])
        for i in range(8):
            x[i] = S[i % 4][x[i]]
        x = [x[0], x[5], x[2], x[7], x[4], x[1], x[6], x[3]]
        x = mulM(x[0:4]) + mulM(x[4:])
    x = xorlists(x, k[10])
    for i in range(8):
        x[i] = S[i % 4][x[i]]
    x = [x[0], x[5], x[2], x[7], x[4], x[1], x[6], x[3]]
    x = xorlists(x, k[11])
    return x

def _decrypt(self, c):
    k = self._expand_key()
    x = np.array(c)
    x = x ^ k[11]
    x = np.array([x[0], x[5], x[2], x[7], x[4], x[1], x[6], x[3]])
    for i in range(8):
        x[i] = S[i].index(x[i])
    x = x ^ k[10]
    for r in range(9, -1, -1):
        x = np.concatenate((invm(x[0:4]), invm(x[4:])))
        x = np.array([x[0], x[5], x[2], x[7], x[4], x[1], x[6], x[3]])
        for i in range(8):
            x[i] = S[i].index(x[i])
        x = x ^ k[r]
    return x

for fname in "data_local".split():
    print "FILE", fname
    F = open(fname)
    Fo = open(fname + ".new", "w")
    for line in F:
        if not line.strip(): break

        pt, ct = ast.literal_eval(line.strip())
        ctids = tuple(Wi[i&3](y) >> 5 for i, y in enumerate(ct))
        Fo.write(" ".join(map(str, pt+ct+list(ctids))) + "\n")
    break
