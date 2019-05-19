#!/usr/local/bin/sage

from sage.all import *
import problem
import binascii

def text(m):
    buf = []
    for l in m:
        for c in l:
            buf.append(chr(c))
    return(''.join(buf))

with open('result.txt', 'r') as f:
    temp = f.readlines()[1]
temp = binascii.unhexlify(temp)
mk1, mk2 = problem.kinoko(temp)
mk1 = [[ord(j) for j in i] for i in mk1] 
mk1_m = matrix(Integers(251),5,5,mk1)
mk2 = [[ord(j) for j in i] for i in mk2] 
mk2_m = matrix(Integers(251),5,5,mk2)
m2 = [[1,3,2,9,4], [0,2,7,8,4], [3,4,1,9,4], [6,5,3,-1,4], [1,4,5,3,5]]
m2_m = matrix(Integers(251),5,5,m2)
mat1_m = mk1_m*(~m2_m)
f1 = text(mat1_m)
mat2_m = mk2_m*(~m2_m)
f2 = text(mat2_m)
print('HarekazeCTF{'+f1+f2.strip('%')+'}')
