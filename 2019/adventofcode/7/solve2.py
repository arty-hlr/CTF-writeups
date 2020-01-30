from itertools import permutations
from collections import deque

def init():
    with open("input.txt","r") as f:
        program = [int(c) for c in f.read().split(',')]
    return program

def compute(prog,io):
    i = 0
    op = [0 for n in range(2)]
    while i < len(prog):
        instr = prog[i]
        # print('Processing instr {} with arguments {} at position {}'.format(instr,prog[i+1:i+4],i))
        if len(str(instr)) > 2:
            opcode = int(str(instr)[-2:])
            parameters = list(reversed([int(i) for i in str(instr)[:-2]]))
        else:
            opcode = instr
        if len(str(instr)) > 2:
            if opcode == 4:
                src = prog[i+1]
            elif opcode in [1,2,5,6,7,8]:
                if len(parameters) == 1:
                    op[1] = prog[prog[i+2]]
                    if parameters[0] == 0:
                        op[0] = prog[prog[i+1]]
                    elif parameters[0] == 1:
                        op[0] = prog[i+1]
                else:
                    for j in range(len(parameters)):
                        if parameters[j] == 0:
                            op[j] = prog[prog[i+j+1]]
                        elif parameters[j] == 1:
                            op[j] = prog[i+j+1]
                dest = prog[i+3]
        elif opcode in [1,2,5,6,7,8]:
            op[0] = prog[prog[i+1]]
            op[1] = prog[prog[i+2]]
            dest = prog[i+3]
        elif opcode == 4:
            src = prog[prog[i+1]]
        if opcode == 1:
            prog[dest] = op[0] + op[1]
            i += 4
        elif opcode == 2:
            prog[dest] = op[0] * op[1]
            i += 4
        elif opcode == 3:
            prog[prog[i+1]] = io.popleft()
            i += 2
        elif opcode == 4:
            yield src
            i += 2
        elif opcode == 5:
            if op[0] != 0:
                i = op[1]
            else:
                i += 3
        elif opcode == 6:
            if op[0] == 0:
                i = op[1]
            else:
                i += 3
        elif opcode == 7:
            if op[0] < op[1]:
                prog[dest] = 1
            else:
                prog[dest] = 0
            i += 4
        elif opcode == 8:
            if op[0] == op[1]:
                prog[dest] = 1
            else:
                prog[dest] = 0
            i += 4
        elif opcode == 99:
            yield
        

def main():
    M = 0
    for perm in permutations(range(5)):
    # for perm in [[4,2,3,0,1]]:
    # for perm in [[4,3,2,1,0]]:
        progs  = [init() for i in range(5)]
        # print(perm)
        output = 0
        saved = 0
        io = [deque() for i in range(5)]
        functions = [compute(progs[i],io[i]) for i in range(5)]
        BREAK = False
        FIRST = True
        while not BREAK:
            for i in perm:
                saved = output
                if FIRST:
                    io[i].append(i+5)
                io[i].append(output)
                output = functions[i].__next__()
                if not output:
                    BREAK = True
                    output = saved
            FIRST = False
            # print(output)
        if saved > M:
            M = saved
    print(M)

if __name__ == '__main__':
    main()