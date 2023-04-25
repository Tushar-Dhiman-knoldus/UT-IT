ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.10"

lazy val root = (project in file("."))
  .aggregate(module1, module2)
  .settings(
    name := "UT-IT",
    libraryDependencies ++= Seq(
      "org.slf4j" % "slf4j-simple" % "2.0.5",
      "org.scalatest" %% "scalatest" % "3.2.15" % Test
    )
  )

lazy val module1 = (project in file("module1"))
  .settings(
    name := "Module-1",
    libraryDependencies ++= Seq(
      "org.slf4j" % "slf4j-simple" % "2.0.5",
      "org.scalatest" %% "scalatest" % "3.2.15" % Test
    )
  )

lazy val module2 = (project in file("module2"))
  .settings(
    name := "Module-2",
    libraryDependencies ++= Seq(
      "org.slf4j" % "slf4j-simple" % "2.0.5",
      "org.scalatest" %% "scalatest" % "3.2.15" % Test
    )
  )

//Cached Resolution

updateOptions := updateOptions.value.withCachedResolution(true)
