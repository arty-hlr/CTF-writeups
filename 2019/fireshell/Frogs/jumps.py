import itertools as it
import sys

def numb(N):
    with open("jumps.txt", "r") as f:
        lines = f.readlines()
    return int(lines[N-1])

def numb2(N):
    t = 0
    for j in range(1,N+1):
        p = it.product([1,2,3], repeat=j)
        for l in p:
            if sum(l) == N:
                t += 1
                t %= 13371337
    return t

def numb3(N):
    if N == 0 or N == 1:
        return 1
    elif N == 2:
        return 2
    else:
        return numb2(N-1) + numb2(N-2) + numb2(N-3)
