name := """circe"""

scalaVersion := "2.13.6"
crossScalaVersions := Seq("2.13.6", "3.0.0")

val circeVersion = "0.14.0-M7"

libraryDependencies ++= Seq(
  "io.circe" %% "circe-core",
  "io.circe" %% "circe-generic",
  "io.circe" %% "circe-parser"
).map(_ % circeVersion)
