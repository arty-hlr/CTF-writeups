def decipherChar(char):
    if char.isdigit():
        return char
    elif 'a' <= char <= 'z':
        num = ord(char)
        num -= 97
        num += 13
        num %= 26
        num += 97
        return chr(num)
    elif 'A' <= char <= 'Z':
        num = ord(char)
        num -= 65
        num += 13
        num %= 26
        num += 65
        return chr(num)
    else:
        return char

line = "Gur cnffjbeq vf 5Gr8L4qetPEsPk8htqjhRK8XSP6x2RHh"

for char in line:
    print(decipherChar(char), end='')
print()
