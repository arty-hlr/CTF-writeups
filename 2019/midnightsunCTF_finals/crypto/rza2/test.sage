#++++++++  RSA KEY GENERATION ++++++++#
size = 512 #mod size
p = random_prime(2**(size/2),lbound=2**(size/2-1)+2**(size/2-2))
q = random_prime(2*p,lbound=p+1)
#forced p<q<2p, print sizes
print "p size: {:d}".format(p.nbits())
print "q size: {:d}".format(q.nbits())
N = p*q
print "N size: {:d}".format(N.nbits())

#++++++++  SETUP KNOWN BITS ++++++++#
knownbits= 134 #the bound is 128 BUT good luck in computing LLL in reasonable time, I use 134 since it's fast

sizep=p.nbits()
#p_msb is acutally (p_msb)*2**(sizep-knownbits/2)
p_msb = (p >> (sizep-knownbits/2)) << (sizep-knownbits/2)
p_lsb = p % (2**(knownbits/2))

#print sizes
print "p_msb size: {:d}".format( (p >> (sizep-knownbits/2)).nbits() )
print "p_lsb size: {:d}".format(p_lsb.nbits())

#++++++++  COPPERSMITH ++++++++#
#we need to define an polynomial == 0 (mod p) that gives us the missing part (x)
# that is:
# f_p(x) = x*2**(knownbits/2) + p_msb + p_lsb
# it's not monic so we need to divide by 2**(knownbits/2)
# set R = 2**(knownbits/2) and invert it modulo N

R = 2**(int(knownbits/2))
invR = inverse_mod(R,N)

#Now setup coppersmith
F.<x> = PolynomialRing(Zmod(N))
#define the poly in x modulo p
f = x + (p_msb+p_lsb)*invR
#solve it
x0 = f.small_roots(X=2^(sizep-knownbits)-1, beta=0.44, epsilon=1/64)[0]
#Note: I used beta=0.44 instead of .5 because it's faster, don't know why.
#note: if you reduce epsilon up to 1/512 you will be able to reduce knownbits up to 128

print "p    : {:x}".format(p)
print "p_msb: {:x}".format(p_msb)
print "p_lsb: {:x}".format(p_lsb)
#print "R    : {:x}".format(R)
print "found small root: {:x}".format(Integer(x0))
print "reconstructed p: {:x}".format(Integer(x0*R)+p_msb+p_lsb)
print "Is it equal to p ??  %s" %(Integer(x0*R)+p_msb+p_lsb == p)
