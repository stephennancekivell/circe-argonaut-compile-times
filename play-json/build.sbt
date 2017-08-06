name := """play-json"""

scalaVersion := "2.11.11"
crossScalaVersions := Seq("2.11.11", "2.12.3")

libraryDependencies ++= Seq(
	"com.typesafe.play" %% "play-json" % "2.6.0"
)
