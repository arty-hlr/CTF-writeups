#!/usr/bin/python -Btt

import sys


def _write(msg):
    sys.stdout.write(str(msg) + "\n")
    sys.stdout.flush()


def _read():
    data = sys.stdin.readline().strip()
    return data
