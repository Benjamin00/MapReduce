#!/bin/bash

#expect first argument to be filename to process
filename=$1

cmdSplit1="java -classpath <classpath splitter> <arg1> <arg2>"
cmdStem=""
cmdMap=""
cmdSend=""

#process file by splitting into 4 parts
$(cmdSplit1) | $(cmdStem) | $(cmdMap) | $(cmdSend) &
pid1=$!

wait $pid1


