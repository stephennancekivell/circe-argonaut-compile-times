name := """argonaut"""

scalaVersion := "2.11.12"
crossScalaVersions := Seq("2.11.12", "2.12.4")

libraryDependencies ++= Seq(
	"com.github.alexarchambault" %% "argonaut-shapeless_6.2" % "1.2.0-M8"
)
