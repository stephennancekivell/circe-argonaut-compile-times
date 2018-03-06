name := """circe"""

scalaVersion := "2.11.12"
crossScalaVersions := Seq("2.11.12", "2.12.4")

val circeVersion = "0.9.1"

libraryDependencies ++= Seq(
  "io.circe" %% "circe-core",
  "io.circe" %% "circe-generic",
  "io.circe" %% "circe-parser"
).map(_ % circeVersion)
