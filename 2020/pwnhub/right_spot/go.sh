#!/bin/bash
sudo docker run -v $(pwd):/home/ctf -p 4444:4444 -it right_spot:latest  $@
