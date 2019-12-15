import re
import itertools
import numpy as np

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
    # d = [[0 for i in range(3)] for moon in moons]
    for pair in itertools.combinations(range(4),2):
        a,b = pair
        pos_a,_ = moons[a]
        pos_b,_ = moons[b]
        # print(pos_a,pos_b)
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
for i in range(1000):
    update(moons)
print(total_energy(moons))
