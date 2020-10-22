import hashlib
import itertools as it

flag = ""
compressed_data = "100001000100110000000100"

def tobin(a):
	binary=""
	for i in range(len(a)):
		binary+=bin(ord(a[i]))[2:].zfill(8)
	return binary

def insertc(b, c, m):
	return(b[:m]+c+b[m:])

def dropc(b,m):  #remove the #m character of string b
	return(b[:m]+b[(m+1):])

def shiftr(b, i):
	return(b[-i:] + b[:-i])

def shiftl(b, i):
	return(b[i:] + b[:i])

def compress(a):
	b = tobin(a)
	l = len(b)
	i = 1
	while(i<l):
		m = l%i
		b = dropc(b,m)
		b = shiftl(b,i)
		l = len(b)
		i+=1
	return b

def decompress(a):
	b = a
	i = len(b)
	l = len(b)+1
	while i > 0:
		m = l%i
		b = shiftr(b,i)
		b = insertc(b, 'x', m)
		l = len(b)+1
		i -= 1
	return b

def found_possible_char(a):
	minchar = '!'
	maxchar = '~'
	dic = {}
	lettres = []
	for i in range(len(a)/8):
		char = flag[i*8:i*8+8]
		dic[char] = []
		lettres.append(char)
		for j in range(ord(minchar), ord(maxchar)+1):
			test = True
			for k in range(8):
				if char[k] != bin(j)[2:].zfill(8)[k] and char[k] != 'x':
					test = False
			if test == True:
				dic[char].append(chr(j))
				#print(char + " & " + chr(j))
	return dic, lettres

flag = decompress(compressed_data)
dic, lettres = found_possible_char(flag)
print dic
print lettres

# Attention c'est degueulasse, mais je voualis pas me casser le cul pour 6 carac ^^
for a in dic[lettres[0]]:
	for b in dic[lettres[1]]:
		for c in dic[lettres[2]]:
			for d in dic[lettres[3]]:
				for e in dic[lettres[4]]:
					for f in dic[lettres[5]]:
						ash = a+b+c+d+e+f
						if hashlib.sha256("evlz{"+ash+"}ctf").hexdigest() == 'e67753ef818688790288702b0592a46c390b695a732e1b9fec47a14e2f6f25ae':
							print "evlz{"+ash+"}ctf"


