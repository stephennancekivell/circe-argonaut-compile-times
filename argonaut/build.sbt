name := """argonaut"""

scalaVersion := "2.12.11"
crossScalaVersions := Seq("2.12.11", "2.13.2")

libraryDependencies ++= Seq(
	"com.github.alexarchambault" %% "argonaut-shapeless_6.2" % "1.2.0-M12"
)
