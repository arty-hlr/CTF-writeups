import base64
import binascii
import midi
import os

def midi_dec(midifile):
    pattern = midi.read_midifile(midifile)
    lines = repr(pattern).split("\n")
    lines = lines[10:-5:2]
    # print(lines)
    str_list = []
    for l in lines:
        str_list.append(chr(int(l.split("data=[")[1].split(",")[0])))
    string = ''.join(str_list)
    return string
