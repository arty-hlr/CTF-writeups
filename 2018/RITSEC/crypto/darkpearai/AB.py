import sys

ABstrList = [sys.argv[1], sys.argv[2]]

for strAB in ABstrList:
    ABnumList = []
    for letter in strAB:
        toAppend = ord(letter)
        if toAppend >= 100:
            ABnumList.append(str(toAppend))
        else:
            ABnumList.append('0' + str(toAppend))
    numAB = int(''.join(ABnumList))
    print(numAB)
    print(len(str(numAB)))
