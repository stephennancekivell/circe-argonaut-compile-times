#!/bin/bash

declare -a folder=("play-json" 
                "circe"
                "circe-semiauto"
                "circe-derivation"
                "argonaut"
                )

declare -a scalaversion=("2.12" "2.11")
for folder in "${folder[@]}"
do
	for scalav in "${scalaversion[@]}"
	do
		echo $folder $scalav
		cat  "$folder.log" | grep -A 1 "Compiling 3 Scala sources" | grep -A 1 "$scalav" | grep success | cut -d ' ' -f 4
	done
done