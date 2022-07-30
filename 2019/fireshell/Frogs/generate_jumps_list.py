jumps_list = []

with open("jumps.txt", "w") as f:
    for i in range(100000):
        if i == 1 or i == 0:
            jumps_list.append(1)
        elif i == 2:
            jumps_list.append(2)
        else:
            jumps_list.append((jumps_list[i-1] + jumps_list[i-2] + jumps_list[i-3])%13371337)
    for j in range(1, 100000):
        f.write(str(jumps_list[j])+"\n")
