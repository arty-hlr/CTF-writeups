#!/bin/sh

for ((i=0;i<16;i++)) do
    ./start_maze.sh > /dev/null
    for j in $(pidof maze); do ls -l /proc/$j/fd >> test.txt; done
    echo >> test.txt
    # ./list_fd.sh >> test.txt
    sleep 1
    pkill maze
done

