def init(v1,v2):
    with open("input.txt","r") as f:
        program = [int(c) for c in f.read().split(',')]
    program[1] = v1
    program[2] = v2
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
    for v1 in range(100):
        for v2 in range(100):
            prog = init(v1,v2)
            compute(prog)
            if prog[0] == 19690720:
                print(v1,v2)
                return

if __name__ == '__main__':
    main()
