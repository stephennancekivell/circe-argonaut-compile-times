#!/bin/sh

for i in {1..2}
do
	# cd jsoniter-scala
	# sbt -no-colors clean compile >> ../jsoniter-scala.log
	# sbt -no-colors ++2.12.6=/Users/stephen/projects/open-source/scala/build/pack clean compile >> ../jsoniter-scala.topic.log
	# cd ..

	cd circe
	sbt -no-colors clean compile >> ../circe.log
	sbt -no-colors ++2.12.6=/Users/stephen/projects/open-source/scala/build/pack clean compile >> ../circe.topic.log
	cd ..

	# cd circe-semiauto
	# sbt -no-colors clean compile >> ../circe-semiauto.log
	# sbt -no-colors ++2.12.6=/Users/stephen/projects/open-source/scala/build/pack clean compile >> ../circe-semiauto.topic.log
	# cd ..

	cd circe-derivation
	sbt -no-colors clean compile >> ../circe-derivation.log
	sbt -no-colors ++2.12.6=/Users/stephen/projects/open-source/scala/build/pack clean compile >> ../circe-derivation.topic.log
	cd ..

	cd play-json
	sbt -no-colors clean compile >> ../play-json.log
	sbt -no-colors ++2.12.6=/Users/stephen/projects/open-source/scala/build/pack clean compile >> ../play-json.topic.log
	cd ..

	# cd argonaut
	# sbt -no-colors clean compile >> ../argonaut.log
	# sbt -no-colors ++2.12.6=/Users/stephen/projects/open-source/scala/build/pack clean compile >> ../argonaut.topic.log
	# cd ..
done