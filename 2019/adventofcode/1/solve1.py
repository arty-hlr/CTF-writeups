fuel = 0

def compute(n):
    return (n//3)-2

inp = open("input.txt", "r")
for line in inp:
    n = int(line)
    fuel += compute(n)

print(fuel)
