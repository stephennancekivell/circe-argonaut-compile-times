#!/bin/sh

for i in {1..2}
do
	cd jsoniter-scala
	sbt -batch clean +compile >> ../jsoniter-scala.log
	cd ..

	cd circe
	sbt -batch clean +compile >> ../circe.log
	cd ..

	cd circe-semiauto
	sbt -batch clean +compile >> ../circe-semiauto.log
	cd ..

	cd circe-derivation
	sbt -batch clean +compile >> ../circe-derivation.log
	cd ..

	cd play-json
	sbt -batch clean +compile >> ../play-json.log
	cd ..

	cd argonaut
	sbt -batch clean +compile >> ../argonaut.log
	cd ..
done