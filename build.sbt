name := "macro-skeleton"

version in Global := "0.1.0"

scalaVersion in Global := "2.11.8"

lazy val root = (project in file("."))
  .dependsOn(macros)

lazy val macros = (project in file("macros"))
  .settings(
    scalacOptions += "-language:experimental.macros",
    libraryDependencies += "org.scala-lang" % "scala-reflect" % scalaVersion.value)