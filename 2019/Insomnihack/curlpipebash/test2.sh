#!/bin/bash
cmd="curl -Ns https://curlpipebash.teaser.insomnihack.ch/print-flag.sh"
for i in {0..10}
do
  result=$($cmd)
  echo -e "The command is : $cmd\n"
  echo -e "The result is : $result\n"
  parse=$(echo $result | cut -d "|" -f 1)
  cmd=$parse
done
