with open('you_can_do_it.txt','r') as f:
    ct = f.read().strip()[:-1]

pt = ''
i = 0
while True:
    if len(pt) == len(ct):
        pt = 'HTB{'+pt+'!}'
        break
    pt += ct[i]
    i = (i+3)%len(ct)

print(pt)
