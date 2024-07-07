#!/usr/bin/python
#
# Peteris Krumins (peter@catonmat.net)
# http://www.catonmat.net  --  good coders code, great reuse
#
# Turing Machine simulator for Busy Beaver problem.
# More info at: http://www.catonmat.net/blog/busy-beaver
#
# Version 1.0
#

import sys

class Error(Exception):
    pass

class TuringMachine(object):
    def __init__(self, program, start, halt):
        self.program = program
        self.start = start
        self.halt = halt
        self.init = '0'
        self.tape = ['1','0','0','0']
        self.pos = 0
        self.state = self.start
        self.tape_changed = 1
        self.movez = 0
        self.output = []

    def run(self):
        while self.state != self.halt:
            lhs = self.get_lhs()
            rhs = self.get_rhs(lhs)

            new_state, new_symbol, move = rhs

            old_symbol = lhs[1]

            # self.output.append(new_symbol)
            self.update_tape(old_symbol, new_symbol)

            self.update_state(new_state)
            self.move_head(move)

        print(''.join(self.tape)[:4])
        # print(''.join(self.output))

    @property
    def moves(self):
        return self.movez

    def update_tape(self, old_symbol, new_symbol):
        if old_symbol != new_symbol:
            self.tape[self.pos] = new_symbol
            self.tape_changed += 1
        else:
            self.tape_changed = 0

    def update_state(self, state):
        self.state = state

    def get_lhs(self):
        under_cursor = self.tape[self.pos]
        lhs = self.state + under_cursor
        return lhs

    def get_rhs(self, lhs):
        if lhs not in self.program:
            raise Error('Could not find transition for state "%s".' % lhs)
        return self.program[lhs]

    def move_head(self, move):
        if move == 'l':
            self.pos -= 1
        elif move == 'r':
            self.pos += 1
        else:
            raise Error('Unknown move "%s". It can only be left or right.' % move)

        if self.pos < 0:
            self.tape.insert(0, self.init)
            self.pos = 0
        if self.pos >= len(self.tape):
            self.tape.append(self.init)

        self.movez += 1

beaver_program = {
     'a0': 'h1r', 'a1': 'd1r',
     'b0': 'c1l', 'b1': 'e0r',
     'c0': 'a0l', 'c1': 'e0r',
     'd0': 'c1l', 'd1': 'd1r',
     'e0': 'b0l', 'e1': 'e1r'
}

def busy_beaver():
    def tape_callback(tape, tape_changed):
        pass
        # print(''.join(tape))

    program = beaver_program

    print("Running Busy Beaver")
    for c in ['a','b','c','d','e']:
        tm = TuringMachine(program, c, 'h')
        tm.run()

if __name__ == "__main__":
    busy_beaver()


