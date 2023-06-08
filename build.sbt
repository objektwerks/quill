enablePlugins(JmhPlugin)

name := "quill"
organization := "objektwerks"
version := "0.1-SNAPSHOT"
scalaVersion := "2.13.11"
libraryDependencies ++= {
  val quillVersion = "3.10.0" // 3.11 contains dev.zio
  Seq(
    "io.getquill" %% "quill-sql" % quillVersion,
    "io.getquill" %% "quill-jdbc" % quillVersion,
    "com.h2database" % "h2" % "2.1.214",
    "com.typesafe" % "config" % "1.4.2",
    "com.typesafe.scala-logging" %% "scala-logging" % "3.9.5",
    "ch.qos.logback" % "logback-classic" % "1.4.7",
    "org.scalatest" %% "scalatest" % "3.2.16" % Test
  )
}
