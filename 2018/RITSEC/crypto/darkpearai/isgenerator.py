def isprimitive(g,n):
        """isprimitive(g,n) - Test whether g is primitive - generates the group of units mod n."""
        if gcd(g,n) != 1: return False  # Not in the group of units
        order = eulerphi(n)
        if carmichaellambda(n) != order: return False # Group of units isn't cyclic
        orderfacts = factors(order)
        oldfact = 1
        for fact in orderfacts:
                if fact!=oldfact:
                        if pow(g,order/fact,n) == 1: return False
                        oldfact = fact
        return True

import sys

print(isprimitive(sys.argv[1], sys.argv[2])
