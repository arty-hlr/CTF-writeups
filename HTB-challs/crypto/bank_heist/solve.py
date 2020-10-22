with open('bank_heist_message.txt','r') as f:
    ct = f.read()

flip_d = {'a':'2','b':'22','c':'222','d':'3','e':'33','f':'333','g':'4','h':'44','i':'444','j':'5','k':'55','l':'555','m':'6','n':'66','o':'666','p':'7','q':'77','r':'777','s':'7777','t':'8','u':'88','v':'888','w':'9','x':'99','y':'999','z':'9999'}
flip_d = {v: k for k, v in flip_d.items()}

def decode_flip(s):
    decoded = []
    b = 0
    while b < len(s):
        for i in reversed(range(1,6)):
            if s[b:b+i] in flip_d.keys():
                decoded.append(flip_d[s[b:b+i]])
                b += i
                break
    return ''.join(decoded)

messages = ct.split('\n\n')
ct_letters = []
for ct in messages:
    for c in ct.split(' '):
        if c != ':':
            ct_letters.append(c.strip(',:.!'))

pt = [decode_flip(w) for w in ct_letters]
ct2 = ' '.join(pt).split('paris ')[1]

off = (ord('g')-ord('t'))%26

pt2 = ''
for c in ct2:
    if c != ' ':
        o = ord(c)-ord('a')
        o = 25-o
        o += ord('a')
        pt2 += chr(o)
    else:
        pt2 += ' '
pt2 += '!!'

print(pt2.upper())
