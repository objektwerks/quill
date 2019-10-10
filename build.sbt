name := "quill"
organization := "objektwerks"
version := "0.1-SNAPSHOT"
scalaVersion := "2.12.10"
libraryDependencies ++= {
  val quillVersion = "3.4.10"
  Seq(
    "io.getquill" %% "quill-sql" % quillVersion % Test,
    "io.getquill" %% "quill-jdbc" % quillVersion % Test,
    "com.h2database" % "h2" % "1.4.197" % Test,
    "com.typesafe" % "config" % "1.3.4" % Test,
    "ch.qos.logback" % "logback-classic" % "1.2.3" % Test,
    "org.scalatest" %% "scalatest" % "3.0.8" % Test
  )
}