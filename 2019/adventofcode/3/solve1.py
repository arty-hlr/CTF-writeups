size = 20000

def init():
    with open('input.txt','r') as f:
    # with open('test2.txt','r') as f:
        w1,w2 = f.readlines()
    wires = []
    for w in (w1,w2):
        new_w = []
        for d in w.split(','):
            new_d = d[0],int(d[1:])
            new_w.append(new_d)
        wires.append(new_w)
    return wires

def do_direct(board,x,y):
    try:
        # print('Marking [{},{}] as visited'.format(x,y))
        board[y][x] = True
    except:
        print('Error, x is {} and y is {}'.format(x,y))
        exit()

def direct(board,coordinates,command):
    x,y = coordinates
    d,l = command
    if d == 'R':
        for i in range(1,l+1):
            do_direct(board,x+i,y)
        return [x+l,y]
    if d == 'L':
        for i in range(1,l+1):
            do_direct(board,x-i,y)
        return [x-l,y]
    if d == 'U':
        for i in range(1,l+1):
            do_direct(board,x,y+i)
        return [x,y+l]
    if d == 'D':
        for i in range(1,l+1):
            do_direct(board,x,y-i)
        return [x,y-l]

def distance(p1,p2):
    return abs(p1[0]-p2[0])+abs(p1[1]-p2[1])

wires = init()
boards = [[[False for i in range(size)] for j in range(size)] for k in range(2)]
for i in range(2):
    coordinates = [size//2,size//2]
    board = boards[i]
    wire = wires[i]
    for command in wire:
        # print(coordinates)
        coordinates = direct(board,coordinates,command)

m = size
for i in range(size):
    for j in range(size):
        if boards[0][i][j] & boards[1][i][j]:
            new_m = distance([size//2,size//2],[i,j])
            if new_m < m:
                m = new_m
print(m)


