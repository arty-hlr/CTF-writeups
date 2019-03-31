Nice crypto challenge, with for one a stream cipher using an LFSR.

The base idea was to use the Berkelamp-Massey algorithm to bruteforce bit by bit where the flag could be in `flag.html`, given that at least `VolgaCTF{` had to be there. I struggled a bit with converting the strings to bits as it was a bit unusual and I had to find a BMA implementation that worked, which took a while (note to future self: implement it yourself!), but in the end after some struggling here was the flag!

`VolgaCTF{It_h45_alr3ady_b3c0m3_a_cl4ssic}`
