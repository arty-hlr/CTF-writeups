import pickle

size = 16000
# size = 1000
def init():
    # with open('input.txt','r') as f:
    with open('input.txt','r') as f:
        w1,w2 = f.readlines()
    wires = []
    for w in (w1,w2):
        new_w = []
        for d in w.split(','):
            new_d = d[0],int(d[1:])
            new_w.append(new_d)
        wires.append(new_w)
    return wires

def find_steps(i):
    total = 0
    y,x = i
    for wire in wires:
        BREAK = False
        current_x = size//2
        current_y = size//2
        for command in wire:
            d,l = command
            for i in range(l):
                if current_x == x and current_y == y:
                    BREAK = True
                    total += i+1
                    break
                if d == 'R':
                    current_x += 1
                elif d == 'L':
                    current_x -= 1
                elif d == 'U':
                    current_y += 1
                elif d == 'D':
                    current_y -= 1
            if BREAK:
                break
            total += l
    return total-2

with open('intersections.pickle','rb') as f:
    intersections = pickle.load(f)
wires = init()

m = size**2
for i in intersections:
    new_m = find_steps(i)
    if new_m < m:
        m = new_m

print(m)
