with open("buf", "r") as f:
    buf = f.read().strip('\n')

salt = "4L0ksa1t"
array = buf.split()
print(array)
toPrint = []
for i in range(len(array)):
    nb = int(array[i])
    xored_nb = nb ^ ord(salt[i % 8])
    toPrint.append(chr(xored_nb))
    print(array[i] + '\t' + toPrint[i])

keystring = ''.join(toPrint)
print(keystring)

with open("key", "w") as f:
    f.write(keystring)
