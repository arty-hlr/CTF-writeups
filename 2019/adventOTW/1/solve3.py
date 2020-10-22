d = {
    0:" 0",
    1:".,'?!\"1-()@/:",
    2:"abc2",
    3:"def3",
    4:"ghi4",
    5:"jkl5",
    6:"mno6",
    7:"pqrs7",
    8:"tuv8",
    9:"wxyz9",
    10:"@/:_;+&%*[]{}",
    11:["","","---UP---","---DOWN---"],
    100:' ',
    101:' ',
    102:' ',
    103:' '
}

with open('sms4.csv','r') as f:
    msg = [int(l.split(',')[1].strip()) for l in f.readlines()]

l = []
temp = [msg[0],1]
for i in range(1,len(msg)):
    if msg[i] == msg[i-1]:
        temp[1] += 1
        if i == len(msg)-1:
            l.append(temp)
    else:
        l.append(temp)
        temp = [msg[i],1]
    
pt = []
for t in l:
    c,n = t
    pt.append(d[c][(n-1)%len(d[c])])
pt = ''.join(pt)
print(pt.upper())
