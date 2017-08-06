name := """circe"""

scalaVersion := "2.11.11"
crossScalaVersions := Seq("2.11.11", "2.12.3")

val circeVersion = "0.8.0"

libraryDependencies ++= Seq(
  "io.circe" %% "circe-core",
  "io.circe" %% "circe-generic",
  "io.circe" %% "circe-parser"
).map(_ % circeVersion)
