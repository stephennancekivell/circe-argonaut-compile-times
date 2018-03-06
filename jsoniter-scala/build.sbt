name := """jsoniter-scala"""

scalaVersion := "2.11.12"
crossScalaVersions := Seq("2.11.12", "2.12.4")

libraryDependencies ++= Seq(
	"com.github.plokhotnyuk.jsoniter-scala" %% "macros" % "0.20.0"
)
