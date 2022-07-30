heaps = []
for i in range(15):
    print("Enter heap {}: ".format(i))
    heaps.append(int(input()))

while(True):
    xored = 0
    for i in range(15):
        xored ^= heaps[i]
    print(heaps)
    print(xored)

    min = 15
    for i in range(15):
        newXored = xored^heaps[i]
        if (newXored < heaps[i]):
            min = i
            toSub = heaps[i] - newXored
    print("You should take {} stones from heap {}".format(toSub, min))
    heaps[min] -= toSub

    xored = 0
    for i in range(15):
        xored ^= heaps[i]
    print(heaps)
    print(xored)

    print("Input heap to change: ")
    toChange = int(input())
    print("Input substracted value: ")
    heaps[toChange] -= int(input())
