from anytree import *

def init():
    with open('input.txt','r') as f:
        t = f.readlines()
    l = [line.strip().split(')') for line in t]
    return l

def compute_length(l):
    s = set()
    for line in l:
        o1,o2 = line
        if o1 not in s:
            s.add(o1)
            exec('_{} = Node("{}")'.format(o1,o1),globals())
        if o2 not in s:
            s.add(o2)
            exec('_{} = Node("{}", parent=_{})'.format(o2,o2,o1),globals())
        else:
            exec('_{}.parent = _{}'.format(o2,o1),globals())
    w = Walker()
    up,common,down = w.walk(_YOU,_SAN)
    total = len(up)-1 + len(down)-1
    print(total)
    
def main():
    l = init()
    compute_length(l)

if __name__ == '__main__':
    main()
