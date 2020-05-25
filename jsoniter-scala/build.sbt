name := """jsoniter-scala"""

scalaVersion := "2.12.11"
crossScalaVersions := Seq("2.12.11", "2.13.2")

libraryDependencies ++= Seq(
	"com.github.plokhotnyuk.jsoniter-scala" %% "jsoniter-scala-macros" % "2.2.4"
)
