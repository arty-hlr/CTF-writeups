import re
import itertools
import numpy as np
from functools import reduce
from math import gcd

def lcm(a, b):
    return int(a * b / gcd(a, b))

def lcms(numbers):
    return reduce(lcm, numbers)

def init():
    pattern = re.compile('[-]?\d+')
    with open('input.txt','r') as f:
        positions = f.readlines()
    moons = []
    for p in positions:
        speed = [0,0,0]
        moons.append([[int(i) for i in re.findall(pattern,p)],speed])
    return np.array(moons)

def total_energy(moons):
    total = 0
    for pos,vel in moons:
        total += np.abs(pos).sum() * np.abs(vel).sum()
    return total

def update(moons):
    apply_gravity(moons)
    apply_velocity(moons)

def apply_gravity(moons):
    d = np.zeros((4,3),dtype=np.int)
    for pair in itertools.combinations(range(4),2):
        a,b = pair
        pos_a,_ = moons[a]
        pos_b,_ = moons[b]
        for i in range(3):
            if pos_a[i] > pos_b[i]:
                d[a][i] -= 1
                d[b][i] += 1
            elif pos_b[i] > pos_a[i]:
                d[a][i] += 1
                d[b][i] -= 1
    for i in range(4):
        moons[i][1] += d[i]
    

def apply_velocity(moons):
    for moon in moons:
        pos,vel = moon
        for i in range(3):
            pos[i] += vel[i]

moons = init()
start = [hash(moons[:,:,j].tostring()) for j in range(3)]
periods = [0 for j in range(3)]
i = 0
done = [False for i in range(3)]
while True:
    update(moons)
    i += 1
    if done[0] and done[1] and done[2]:
        break
    for j in range(3):
        h = hash(moons[:,:,j].tostring())
        if done[j]: continue
        if h == start[j]:
            periods[j] = i
            done[j] = True

print(lcms(periods))
