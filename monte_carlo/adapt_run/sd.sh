#!/bin/sh

dir=`dirname "$0"`

if [ $# -ne 1 ]; then
  echo "sd usage: [ESTIMATED_LEVEL]"
  exit
fi

ent -cp $dir/../build/classes monte_carlo.Main
mv mode.txt run_sd_${1}.txt
