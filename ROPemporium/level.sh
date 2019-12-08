#!/bin/sh

if [[ $# != 2 ]]
then
    echo "Usage ./level.sh <#> <name>"
    exit
fi

mkdir $1.$2
unzip $2.zip -d $1.$2
unzip -n $232.zip -d $1.$2
rm $2*.zip
