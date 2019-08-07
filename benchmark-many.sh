#!/bin/sh

for i in {1..2}
do
	# cd jsoniter-scala
	# sbt -no-colors clean compile >> ../jsoniter-scala.log
	# cd ..

	cd circe
	sbt -no-colors +clean +compile >> ../circe.log
	cd ..

	# cd circe-generic-simple
	# sbt -no-colors clean compile >> ../circe-generic-simple.log
	# cd ..

	# cd circe-derivation
	# sbt -no-colors clean compile >> ../circe-derivation.log
	# cd ..

	# cd play-json
	# sbt -no-colors +clean +compile >> ../play-json.log
	# cd ..

	# cd argonaut
	# sbt -no-colors +clean +compile >> ../argonaut.log
	# cd ..
done