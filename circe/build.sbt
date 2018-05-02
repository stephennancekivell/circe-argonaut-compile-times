name := """circe"""

scalaVersion := "2.12.6"
// scalaVersion := "2.12.7--bin-af4ffa87ca-SNAPSHOT"
// crossScalaVersions := Seq("2.12.6", "2.12.7--bin-af4ffa87ca-SNAPSHOT")

val circeVersion = "0.9.3"

libraryDependencies ++= Seq(
  "io.circe" %% "circe-core",
  "io.circe" %% "circe-generic",
  "io.circe" %% "circe-parser"
).map(_ % circeVersion)
