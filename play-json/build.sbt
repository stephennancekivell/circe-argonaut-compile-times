name := """play-json"""

scalaVersion := "2.12.8"
crossScalaVersions := Seq("2.12.8", "2.13.0")

libraryDependencies ++= Seq(
	"com.typesafe.play" %% "play-json" % "2.7.3"
)
