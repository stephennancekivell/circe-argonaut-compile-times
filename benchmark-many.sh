#!/bin/sh

for i in {1..5}
do
	cd circe
	sbt -no-colors +clean +compile >> ../circe.log
	cd ..

	cd circe-semiauto
	sbt -no-colors +clean +compile >> ../circe-semiauto.log
	cd ..

	cd argonaut
	sbt -no-colors +clean +compile >> ../argonaut.log
	cd ..
done