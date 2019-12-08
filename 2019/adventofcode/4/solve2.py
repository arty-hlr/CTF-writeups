start = 152085
end = 670283

def not_decreasing(digits):
    for i in range(len(digits)-1):
        if digits[i+1] < digits[i]:
            return False
    return True

def two_adjacent(digits):
    digits.append(0)
    i = 0
    while True:
        for j in range(i+1,len(digits)):
            # print("Digits:")
            # print(digits[i],digits[j])
            # print("Positions:")
            # print(i,j)
            if digits[i] != digits[j]:
                if j-i == 2:
                    return True
                i = j
                break
        if i == len(digits)-1:
            break
    return False

def meet_rules(n):
    digits = [int(i) for i in str(n)]
    return not_decreasing(digits) and two_adjacent(digits)
        

# print(meet_rules(111122))
total = 0
for i in range(start,end+1):
    if meet_rules(i):
        total += 1

print(total)
    
