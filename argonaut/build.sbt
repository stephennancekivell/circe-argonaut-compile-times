name := """argonaut"""

scalaVersion := "2.12.8"
crossScalaVersions := Seq("2.12.8", "2.13.0")

libraryDependencies ++= Seq(
	"com.github.alexarchambault" %% "argonaut-shapeless_6.2" % "1.2.0-M11"
)
