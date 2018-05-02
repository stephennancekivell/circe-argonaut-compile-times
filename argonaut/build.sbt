name := """argonaut"""

scalaVersion := "2.12.6"
// crossScalaVersions := Seq("2.12.6", "2.12.7--bin-af4ffa87ca-SNAPSHOT")

libraryDependencies ++= Seq(
	"com.github.alexarchambault" %% "argonaut-shapeless_6.2" % "1.2.0-M8"
)
