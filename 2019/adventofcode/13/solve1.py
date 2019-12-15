def init():
    with open("input.txt","r") as f:
        program = [int(c) for c in f.read().split(',')] + [0 for _ in range(10000)]
    return program

def compute(prog): 
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
            prog[op[0]] = int(input())
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
    results = []
    l = []
    i = 1
    for r in compute(prog):
        if r == None:
            break
        l.append(r)
        if not i%3:
            results.append(l)
            l = []
        i += 1
    total = 0
    for _,_,t in results:
        if t == 2:
            total += 1
    print(total)

if __name__ == '__main__':
    main()
