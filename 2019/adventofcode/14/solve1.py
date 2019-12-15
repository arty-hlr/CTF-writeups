from collections import defaultdict
from math import ceil

def init():
    with open('input2.txt','r') as f:
        eqs = f.readlines()
    reactions = {}
    for eq in eqs:
        cs,p = eq.strip().split(' => ')
        i_p,n_p = p.split(' ')
        p = (int(i_p),n_p)
        cs = cs.split(', ')
        l_c = []
        for c in cs:
            i_c,n_c = c.split(' ')
            l_c.append((int(i_c),n_c))
        t_c = tuple(l_c)
        reactions[p] = t_c
    return reactions

def find_key(r):
    for k in reactions.keys():
        if k[1] == r:
            return k

def flatten(T):
    if len(T) == 2 and type(T[0]) == int and type(T[1]) == str: return (T,)
    elif len(T) == 0: return ()
    else: return flatten(T[0]) + flatten(T[1:])

def multiply(old,n):
    l = []
    if n <= old[0]:
        return reactions_copy[old]
    for r in reactions_copy[old]:
        l.append((ceil(n/old[0])*r[0],r[1]))
        excess[old[1]] += n%old[0]
    return tuple(l)

def chain(product):
    reactives = reactions_copy[product]
    print(reactives)
    if reactives[0][1] == 'ORE':
        return product
    l = []
    for r in reactives:
        if r[0] <= excess[r[1]]:
            excess[r[1]] -= r[0]
        else:
            if r not in reactions_copy.keys():
                old = find_key(r[1])
                reactions_copy[r] = multiply(old,r[0])
            l.append(chain(r))
    return tuple(l)

def compute(reactives):
    total = 0
    needed = defaultdict(int)
    for r in reactives:
        needed[r[1]] += r[0]
    print(needed)
    for r,n in needed.items():
        k = find_key(r)
        product_n,_ = k
        cost,_ = reactions[k][0]
        to_produce = cost*ceil(n/product_n)
        if n <= excess[r]:
            excess[r] -= n
        else:
            total += to_produce
            excess[r] += n%product_n
    print(excess)
    return total

reactions = init()
reactions_copy = reactions.copy()
excess = defaultdict(int)

def main():
    reactives = flatten(chain((1,'FUEL')))
    print(reactives)
    total = compute(reactives)
    print(total)

if __name__ == '__main__':
    main()

