name := """circe"""

scalaVersion := "2.12.8"
crossScalaVersions := Seq("2.12.8", "2.13.0")

val circeVersion = "0.11.1"

libraryDependencies ++= Seq(
  "io.circe" %% "circe-core",
  "io.circe" %% "circe-parser"
).map(_ % circeVersion)

libraryDependencies ++= Seq(
	"io.circe" %% "circe-derivation" % "0.11.1"
)
