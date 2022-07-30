printableRange = range(48, 123)

def insertBits(binList, i):
    slice = ''.join(binList[i*8:(i+1)*8])
    num = int(slice, 2)
    while num not in printableRange:
        pass

with open("binary.txt", "r") as f:
    str = f.read()

binList = list(str)
# binList.insert(0, '0')
numList = []

for i in range(32):
    # print(binList[i:i+8])
    slice = ''.join(binList[i*8:(i+1)*8])
    num = int(slice, 2)
    numList.append(num)
    # if num not in printableRange:
    #     binList = insertBit(binList, i)
    #     slice = ''.join(binList[i*8:(i+1)*8])
    #     num = int(slice, 2)
    print("{}\t{}\t{}\t{}".format(slice, num, hex(num), chr(num)))

print(numList)
with open("bytes", "wb+") as b:
    b.write(bytes(numList))
