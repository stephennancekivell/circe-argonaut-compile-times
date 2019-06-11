name := """circe"""

scalaVersion := "2.12.8"
crossScalaVersions := Seq("2.12.8", "2.13.0-RC2")

val circeVersion = "0.12.0-M2"

libraryDependencies ++= Seq(
  "io.circe" %% "circe-core",
  "io.circe" %% "circe-parser"
).map(_ % circeVersion)

libraryDependencies ++= Seq(
	"io.circe" %% "circe-derivation" % circeVersion
)
