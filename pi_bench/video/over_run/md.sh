#!/bin/sh

dir=`dirname "$0"`

if [ $# -ne 1 ]; then
  echo "sd usage: [ESTIMATED_LEVEL]"
  exit
fi

export PANDA_RUNS=5
export PANDA_RECOVER=true
#export PANDA_RECOVER=false
ent -cp $dir/../build/classes video.Main 1280 720
mv mode.txt run_md_${1}.txt
