name := """PlayFrameworkTemperature"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.11.1"

libraryDependencies ++= Seq(
  javaJdbc,
  javaEbean,
  cache,
  javaWs,
  "com.orientechnologies" % "orientdb-graphdb" % "2.0.5"
)

//libraryDependencies += "com.orientechnologies" % "orientdb-graphdb" % "2.0.5"
