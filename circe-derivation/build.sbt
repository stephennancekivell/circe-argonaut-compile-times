name := """circe"""

scalaVersion := "2.12.6"
// crossScalaVersions := Seq("2.12.6", "2.12.7--bin-af4ffa87ca-SNAPSHOT")

val circeVersion = "0.9.3"

libraryDependencies ++= Seq(
  "io.circe" %% "circe-core",
  "io.circe" %% "circe-parser"
).map(_ % circeVersion)

libraryDependencies ++= Seq(
	"io.circe" %% "circe-derivation" % "0.9.0-M3"
)
