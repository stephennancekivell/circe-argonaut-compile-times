#!/bin/bash

declare -a folder=(
				"play-json"
				"play-json.topic"
                "circe"
                "circe.topic"
                # "circe-semiauto"
                # "circe-semiauto.topic"
                "circe-derivation"
                "circe-derivation.topic"
                # "argonaut"
                # "argonaut.topic"
                )

declare -a scalaversion=("2.12") # "2.11")
for folder in "${folder[@]}"
do
	for scalav in "${scalaversion[@]}"
	do
		echo $folder $scalav
		cat  "$folder.log" | grep -A 2 "Compiling 3 Scala sources" | grep -A 2 "$scalav" | grep success | cut -d ' ' -f 4
	done
done