#!/bin/sh

for j in $(pidof maze); do ls /proc/$j/fd; done
