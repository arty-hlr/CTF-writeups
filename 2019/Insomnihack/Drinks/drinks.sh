#!/usr/bin/env bash
OPT1="recipientName"
OPT2="drink"
i=1
# for (( i = 0; i < 10; i++ )); do
  curl -Ns -H "Accept: application/json" -H "Content-Type: application/json" -d "{\"$OPT1\":\"$1\",\"$OPT2\":\"$2\"}" http://drinks.teaser.insomnihack.ch/generateEncryptedVoucher > tests/$1_$2_output$i
  python strip_header.py tests/$1_$2_output$i tests/stripped_$1_$2_output$i
  # rm tests/$1_$2_output$i
  base64 -d tests/stripped_$1_$2_output$i > tests/$1_$2_binary$i
  # rm tests/stripped_$1_$2_output$i
# done

# python redeem.py output
