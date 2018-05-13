import sbt._

object Dependencies {
  lazy val argonaut = "io.argonaut" %% "argonaut" % "6.2.1"
  lazy val scalaTest = "org.scalatest" %% "scalatest" % "3.0.5"
  lazy val scopt = "com.github.scopt" %% "scopt" % "3.7.0"
  lazy val awsCloudFormation = "com.amazonaws" % "aws-java-sdk-cloudformation" % "1.11.321"
  lazy val reflections = "org.reflections" % "reflections" % "0.9.11"
}
