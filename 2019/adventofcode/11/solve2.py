import numpy as np
from collections import deque,defaultdict
from PIL import Image

SIZE = 100

def init():
    with open("input.txt","r") as f:
        program = [int(c) for c in f.read().split(',')] + [0 for _ in range(10000)]
    return program

def update_position(robot, command):
    y,x,dy,dx = robot
    dx, dy = (dy, -dx) if command else (-dy, dx)
    x += dx
    y += dy
    return [y,x,dy,dx]

def update_grid(grid, coordinates, color):
    if color == 0:
        grid[tuple(coordinates)] = 255
    else:
        grid[tuple(coordinates)] = 0

def compute(prog,io): 
    relative = 0
    i = 0
    op = [0 for n in range(3)]
    while i < len(prog):
        instr = str(prog[i])
        instr = '0'*(5-len(instr)) + instr
        opcode = int(str(instr)[-2:])
        parameters = list(reversed([int(i) for i in str(instr)[:-2]]))
        for j in range(len(parameters)):
            if parameters[j] == 0:
                op[j] = prog[i+j+1]
            elif parameters[j] == 1:
                op[j] = i+j+1
            elif parameters[j] == 2:
                op[j] = prog[i+j+1]+relative
        if opcode == 1:
            prog[op[2]] = prog[op[0]] + prog[op[1]]
            i += 4
        elif opcode == 2:
            prog[op[2]] = prog[op[0]] * prog[op[1]]
            i += 4
        elif opcode == 3:
            prog[op[0]] = io.popleft()
            i += 2
        elif opcode == 4:
            yield prog[op[0]]
            i += 2
        elif opcode == 5:
            if prog[op[0]] != 0:
                i = prog[op[1]]
            else:
                i += 3
        elif opcode == 6:
            if prog[op[0]] == 0:
                i = prog[op[1]]
            else:
                i += 3
        elif opcode == 7:
            if prog[op[0]] < prog[op[1]]:
                prog[op[2]] = 1
            else:
                prog[op[2]] = 0
            i += 4
        elif opcode == 8:
            if prog[op[0]] == prog[op[1]]:
                prog[op[2]] = 1
            else:
                prog[op[2]] = 0
            i += 4
        elif opcode == 9:
            relative += prog[op[0]]
            i += 2
        elif opcode == 99:
            yield
        

def main():
    prog = init()
    grid = defaultdict(int)
    robot = [SIZE//2,SIZE//2,1,0]
    io = deque()
    io.append(1)
    function = compute(prog,io)
    while True:
        color = function.__next__()
        if color == None:
            break
        update_grid(grid,robot[:2],color)
        command = function.__next__()
        robot = update_position(robot,command)
        io.append(grid[(robot[0],robot[1])])
    grid_np = np.full((SIZE,SIZE),255,dtype=np.int8)
    for point,value in grid.items():
        grid_np[point] = value
    img = Image.fromarray(grid_np,'L')
    img = img.resize((SIZE*10,SIZE*10))
    img = img.transpose(Image.FLIP_TOP_BOTTOM)
    img.show()


if __name__ == '__main__':
    main()
