import requests
import re
import time

def get_res(a=0,b=0,c=0,d=0,e=0,f=0,g=0,h=0,i=0,j=0, debug=False):
    r = requests.get("http://heavensdoor-01.play.midnightsunctf.se:10488/knock/{}/{}/{}/{}/{}/{}/{}/{}/{}/{}".format(a,b,c,d,e,f,g,h,i,j))
    if debug: return r.text
    nums = re.findall("\d+", r.text)
    return list(map(int,nums))[2:]

def guess_function(timestamp, a=0,b=0,c=0,d=0,e=0,f=0,g=0,h=0,i=0,j=0):
    # return abs(timestamp**2 + a**3 + (a+b)*c + ((e+f)**(4)) - (f**2 * g**3 * h**2) + (f**2 * g**3 * i))
    return abs(timestamp**2 + a**3 + (a+b)*c + ((e+f)**(4)) - (f**2 * g**3 * h**2) + (f**2 * g**3 * i))


t = int(time.time())-1
t**2 + t + 1 - t**2

a=0
b=t
c=1
d=0
e=0
f=1
g=1
h=t
i=0
j=1
print(get_res(a,b,c,d,e,f,g,h,i,j,True))

a = 2
b = 3
c = 5
d = 2
e = 3
f = 5
g = 2
h = 3
i = 0
j = 0
t, res = get_res(a,b,c,d,e,f,g,h,i,j)
guess = guess_function(t, a,b,c,d,e,f,g,h,i,j)
print(t, res, guess)
print(res - t**2)
print(res - guess)
assert guess == res
