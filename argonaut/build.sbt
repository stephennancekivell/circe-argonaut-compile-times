name := """argonaut"""

scalaVersion := "2.11.11"
crossScalaVersions := Seq("2.11.11", "2.12.3")

libraryDependencies ++= Seq(
	"com.github.alexarchambault" %% "argonaut-shapeless_6.2" % "1.2.0-M6"
)
