from sage.all import *
from Crypto.Util.number import long_to_bytes

n = 9799080661501467884467225188078342742766492539290954649052326288545249523485259554498055327101620585612049935019772095457875188392850174807669467113561703 
e = 65537
d = 357800937225887859492043729115941745631326069953205890949878950951199812467762505076908807818483545413271956081271375834809278508559178715879283048960953
Cx = 4143446088312921816758362264853048120154280049677909632349103364802575463576509561464947871773793787896063253331418475283720886100034333135184249344102365
Cy = 8384037709829308179633895299138296616530497125381624381678499818112417287445046103971322133573513084823937517071462947639275474462359445732327289575301489
k = e*d-1

ok = True
while ok:
    a = Integer(randint(2,e))
    for i in range(2,4):
        res_1 = a.powermod(k/(2^(i-1)),n)
        res = res_1.powermod(2,n)
        if res_1 != 1 and res == 1:
            print(a)
            print(i)
            ok = False
            break

p = gcd(res_1-1,n)
q = n/p
print(p)
print(q)
phi_n = (p-1)*(q-1)

b = (pow(Cy, 2, n) - pow(Cx, 3, n)) % n
E_p = EllipticCurve(GF(p), [0, b])
E_q = EllipticCurve(GF(q), [0, b])

ord_ec_n = E_p.order() * E_q.order()
d = inverse_mod(e,ord_ec_n)
print(d)
EC = EllipticCurve(Zmod(n), [0, b])

C = EC(Cx, Cy)
Gx, Gy = (d*C).xy()
print()
print(Gx)
print(Gy)
long_to_bytes(Gx)
long_to_bytes(Gy)
