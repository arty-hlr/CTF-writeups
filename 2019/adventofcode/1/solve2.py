
def compute(n):
    total = 0
    partial = n
    while True:
        temp = fuel(partial)
        if temp <= 0:
            return total
        total += temp
        partial = temp

def fuel(n):
    return (n//3)-2

def main():
    total_fuel = 0
    inp = open("input.txt", "r")
    for line in inp:
        n = int(line)
        total_fuel += compute(n)
    print(total_fuel)

if __name__ == '__main__':
    main()
