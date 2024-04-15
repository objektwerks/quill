enablePlugins(JmhPlugin)

name := "quill"
organization := "objektwerks"
version := "0.1-SNAPSHOT"
scalaVersion := "2.13.13"
libraryDependencies ++= {
  val quillVersion = "3.10.0" // 3.11 contains dev.zio
  Seq(
    "io.getquill" %% "quill-sql" % quillVersion,
    "io.getquill" %% "quill-jdbc" % quillVersion,
    "com.h2database" % "h2" % "2.2.224",
    "com.typesafe" % "config" % "1.4.3",
    "ch.qos.logback" % "logback-classic" % "1.5.4",
    "org.scalatest" %% "scalatest" % "3.2.18" % Test
  )
}
