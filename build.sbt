enablePlugins(JmhPlugin)

name := "quill"
organization := "objektwerks"
version := "0.1-SNAPSHOT"
scalaVersion := "2.13.6"
libraryDependencies ++= {
  val quillVersion = "3.9.0"
  Seq(
    "io.getquill" %% "quill-sql" % quillVersion,
    "io.getquill" %% "quill-jdbc" % quillVersion,
    "com.h2database" % "h2" % "1.4.200",
    "com.typesafe" % "config" % "1.4.1",
    "com.typesafe.scala-logging" %% "scala-logging" % "3.9.4",
    "ch.qos.logback" % "logback-classic" % "1.2.5",
    "org.scalatest" %% "scalatest" % "3.2.9" % Test
  )
}