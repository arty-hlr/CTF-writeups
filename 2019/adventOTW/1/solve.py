with open('sms4.csv','r') as f:
    msg = [int(l.split(',')[1].strip()) for l in f.readlines()]

print(msg)
