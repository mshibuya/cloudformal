import Dependencies._

lazy val generate = taskKey[Unit]("Crawl an AWS CloudFormation reference page and generate corresponding resource class")

lazy val root = (project in file(".")).
  settings(
    inThisBuild(List(
      organization := "com.github.mshibuya",
      scalaVersion := "2.12.4",
      version      := "0.1.0-SNAPSHOT"
    )),
    name := "cloudformal",
    libraryDependencies ++= Seq(argonaut, scopt, awsCloudFormation, reflections, scalaReflect, scalaTest % Test)
  )

lazy val generator = (project in file("generator")).
  settings(
    inThisBuild(List(
      organization := "com.github.mshibuya",
      scalaVersion := "2.12.4",
      version      := "0.1.0-SNAPSHOT"
    )),
    name := "cloudformal-generator",
    libraryDependencies ++= Seq(argonaut)
  )

lazy val example = (project in file("example")).
  settings(
    inThisBuild(List(
      organization := "com.github.mshibuya",
      scalaVersion := "2.12.4",
      version      := "0.1.0-SNAPSHOT"
    )),
    name := "cloudformal-example",
    libraryDependencies ++= Seq(awsEc2)
  )
  .dependsOn(root)
