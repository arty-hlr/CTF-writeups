start = 152085
end = 670283

def not_decreasing(digits):
    for i in range(len(digits)-1):
        if digits[i+1] < digits[i]:
            return False
    return True

def two_adjacent(digits):
    ok = False
    for i in range(len(digits)-1):
        if digits[i+1] == digits[i]:
            ok = True
    return ok

def meet_rules(n):
    digits = [int(i) for i in str(n)]
    return not_decreasing(digits) and two_adjacent(digits)
        

total = 0
for i in range(start,end+1):
    if meet_rules(i):
        total += 1

print(total)
    
