
// The simplest possible sbt build file is just one line:

ThisBuild / scalaVersion := "2.13.8"

ThisBuild / version := "1.0"

Compile / packageBin / mainClass := Some("com.ngdangdat.Main")

lazy val root = (project in file("."))
  .settings(
    name := "redis-acl",
  )

libraryDependencies += "io.lettuce" % "lettuce-core" % "6.2.2.RELEASE"

assembly / assemblyMergeStrategy := {
  case PathList("META-INF", xs @ _*) => MergeStrategy.discard
  case x                             => MergeStrategy.first
}
