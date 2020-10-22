import angr
import claripy

p = angr.Project('re50')
simgr = p.factory.simgr()
simgr.explore(find=lambda s: b"gz!" in s.posix.dumps(1))
s = simgr.found[0]
print(s.posix.dumps(0))
