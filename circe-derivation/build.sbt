name := """circe"""

scalaVersion := "2.12.11"
crossScalaVersions := Seq("2.12.11", "2.13.2")

val circeVersion = "0.13.0"

libraryDependencies ++= Seq(
  "io.circe" %% "circe-core",
  "io.circe" %% "circe-parser"
).map(_ % circeVersion)

libraryDependencies ++= Seq(
	"io.circe" %% "circe-derivation" % "0.13.0-M4"
)
