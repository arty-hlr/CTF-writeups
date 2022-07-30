N = 118173998641659433141031218423093267548048945830460552160732748274571974743297930821423113390029083098858035838064885829588967199550126084897009304331836294104589302387252278933370240317467378376797843379485665856003112996215247651060003047081838833325054418881162956647931078011461049685774070539302432802113792476309961767049580409488915273417272971605423056480946448420246170538977427027687185230659802277819960185028241326766028592105200802992171
size = N.nbits()


#++++++++  RSA KEY GENERATION ++++++++#
knownbits=  240 #the bound is 128 BUT good luck in computing LLL in reasonable time, I use 134 since it's fast
p = isqrt(N)
sizep = p.nbits()
print sizep

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
x0 = f.small_roots(X=2^(sizep-knownbits)-1, beta=0.44, epsilon=1/64)
if x0:
    x0 = x0[0]
#Note: I used beta=0.44 instead of .5 because it's faster, don't know why.
#note: if you reduce epsilon up to 1/512 you will be able to reduce knownbits up to 128

print "p    : {:x}".format(p)
print "p_msb: {:x}".format(p_msb)
print "p_lsb: {:x}".format(p_lsb)
#print "R    : {:x}".format(R)
print "found small root: {:x}".format(Integer(x0))
print "reconstructed p: {:x}".format(Integer(x0*R)+p_msb+p_lsb)
print "Is it equal to p ??  %s" %(Integer(x0*R)+p_msb+p_lsb == p)
