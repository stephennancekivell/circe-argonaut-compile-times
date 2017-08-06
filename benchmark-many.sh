#!/bin/sh

for i in {1..2}
do
	cd circe
	sbt -no-colors +clean +compile >> ../circe.log
	cd ..

	cd circe-semiauto
	sbt -no-colors +clean +compile >> ../circe-semiauto.log
	cd ..

	cd circe-derivation
	sbt -no-colors +clean +compile >> ../circe-derivation.log
	cd ..

	cd play-json
	sbt -no-colors +clean +compile >> ../play-json.log
	cd ..

	cd argonaut
	sbt -no-colors +clean +compile >> ../argonaut.log
	cd ..
done