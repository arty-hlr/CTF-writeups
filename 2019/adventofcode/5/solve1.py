def init():
    with open("input.txt","r") as f:
        program = [int(c) for c in f.read().split(',')]
    return program

def compute(prog):
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
            elif opcode <= 2:
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
        elif opcode <= 2:
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
            prog[prog[i+1]] = 1
            i += 2
        elif opcode == 4:
            print(src)
            i += 2
        elif opcode == 99:
            return
        

def main():
    prog = init()
    compute(prog)

if __name__ == '__main__':
    main()
