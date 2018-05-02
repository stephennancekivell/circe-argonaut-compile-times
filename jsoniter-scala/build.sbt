name := """jsoniter-scala"""

scalaVersion := "2.12.6"
// crossScalaVersions := Seq("2.12.6", "2.12.7--bin-af4ffa87ca-SNAPSHOT")

libraryDependencies ++= Seq(
	"com.github.plokhotnyuk.jsoniter-scala" %% "macros" % "0.20.0"
)
