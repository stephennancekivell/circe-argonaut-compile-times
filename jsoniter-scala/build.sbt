name := """jsoniter-scala"""

scalaVersion := "2.12.8"
crossScalaVersions := Seq("2.12.8", "2.13.0")

libraryDependencies ++= Seq(
	"com.github.plokhotnyuk.jsoniter-scala" %% "macros" % "0.50.0"
)
