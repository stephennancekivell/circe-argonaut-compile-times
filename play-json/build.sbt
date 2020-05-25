name := """play-json"""

scalaVersion := "2.12.11"
crossScalaVersions := Seq("2.12.11", "2.13.2")

libraryDependencies ++= Seq(
	"com.typesafe.play" %% "play-json" % "2.8.1"
)
