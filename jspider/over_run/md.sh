#!/bin/sh

if [ $# -ne 1 ]; then
  echo "sd usage: [ESTIMATED_LEVEL]"
  exit
fi

export PANDA_RUNS=10

export PANDA_BATTERY_RUN=true
export PANDA_JSPIDER_INTERVAL=250
export PANDA_JSPIDER_DEPTH=4

jspider.sh http://synergyendwell.com
mv mode.txt run_md_${1}_ent.txt

#jspider.sh http://synergyendwell.com
#mv mode.txt run_md_${1}_java.txt
