def init():
    with open("input.txt","r") as f:
        program = [int(c) for c in f.read().split(',')]
    program[1] = 12
    program[2] = 2
    return program

def compute(prog):
    for i in range(0,len(prog),4):
        instr,op1,op2,dest = prog[i:i+4]
        if instr == 1:
            prog[dest] = prog[op1] + prog[op2]
        elif instr == 2:
            prog[dest] = prog[op1] * prog[op2]
        elif instr == 99:
            return
        

def main():
    prog = init()
    compute(prog)
    print(prog[0])

if __name__ == '__main__':
    main()
