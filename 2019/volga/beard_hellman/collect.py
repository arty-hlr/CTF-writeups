#!/usr/bin/env python
#-*- coding:utf-8 -*-
from sage.all import *

from vw import *

from sock import Sock

f = Sock("beard-party.q.2019.volgactf.ru 7777")


while True:
    f.read_until("format):")
    f.read_line()

    pts = []
    block = []
    for i in xrange(2**8):
        pt = [V[i&3](randint(0, 31)) for i in xrange(8)]
        pts.append(pt)
        msg = nums_to_str(pt)
        block.append(msg)
    block = "".join(block)
    block = "".join(block.encode("base64").split())

    f.send_line(block)

    res = f.read_until("Enter")
    res = res.decode("base64")
    assert len(res) % 10 == 0
    cts = [str_to_nums(res[i:i+10]) for i in xrange(0, len(res)-10, 10)]
    assert len(pts) == len(cts)

    with open("data", "a") as fo:
        for pt, ct in zip(pts, cts):
            fo.write(`(pt, ct)` + "\n")
    print len(pts), "encrypted"
