name := "quill"
organization := "objektwerks"
version := "0.1-SNAPSHOT"
scalaVersion := "2.13.6"
libraryDependencies ++= {
  val quillVersion = "3.8.0"
  Seq(
    "io.getquill" %% "quill-sql" % quillVersion % Test,
    "io.getquill" %% "quill-jdbc" % quillVersion % Test,
    "com.h2database" % "h2" % "1.4.200" % Test,
    "com.typesafe" % "config" % "1.4.0" % Test,
    "ch.qos.logback" % "logback-classic" % "1.2.3" % Test,
    "org.scalatest" %% "scalatest" % "3.2.9" % Test
  )
}
