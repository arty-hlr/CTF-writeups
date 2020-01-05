def init():
    with open('input.txt','r') as f:
        return [int(n) for n in f.read().strip()]

def create_pattern(length,n):
    base = [0,1,0,-1]
    i = 0
    j = 0
    pattern = []
    FIRST = True
    while i < length:
        to_add = [base[j] for _ in range(n+1)]
        if FIRST:
            pattern += to_add[1:]
            i += len(to_add)-1
            FIRST = False
        else:
            pattern += to_add
            i += len(to_add)
        j = (j+1)%4
    return pattern[:length]

def step(signal,pattern):
    output = 0
    for a,b in zip(signal,pattern):
        output += a*b
    return int(str(output)[-1])

def phase(signal):
    output = []
    for i in range(len(signal)):
        pattern = create_pattern(len(signal),i)
        output.append(step(signal,pattern))
    return output
         
def main():
    signal = init()
    for i in range(100):
        signal = phase(signal)
    print(''.join([str(n) for n in signal[:8]]))

if __name__ == '__main__':
    main()
