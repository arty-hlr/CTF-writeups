ct=int(open('flag.enc').read().strip()[5:])
n=int(open('pubkey.txt').read().strip()[9:])

def xgcd(b, a):
    x0, x1, y0, y1 = 1, 0, 0, 1
    while a != 0:
        q, b, a = b // a, a, b % a
        x0, x1 = x1, x0 - q * x1
        y0, y1 = y1, y0 - q * y1
    return  b, x0, y0

def factorise(n):
    lw, hi = 1, n
    while(lw <= hi):
        r = (lw + hi) / 2
        p =  3 * r**2 +  2 * r + 7331
        q = 17 * r**2 + 18 * r + 1339

        if(p * q == n):
            return p, q
        elif(p * q < n):
            lw = r + 1
        else: hi = r - 1

def decryptRabin(ct,privkey):

    p, q = privkey
    n =    p * q

    mp = pow(ct, (1 + p) / 4, p)
    mq = pow(ct, (1 + q) / 4, q)

    gcd, yp, yq = xgcd(p, q)

    r = (yp * p * mq + yq * q * mp) % n
    s = (yp * p * mq - yq * q * mp) % n
    nr = n - r
    ns = n - s

    return r,nr,s,ns

privkey = factorise(n)

pt = decryptRabin(ct,privkey)

for m in pt:
    message = hex(m)[2:].strip('L')
    if(len(message)%2==0):
        print message.decode('hex').rstrip('X')
