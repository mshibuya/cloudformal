package com.github.mshibuya.cloudformal.aws.codebuild

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-source.html
 */

case class Source(
    `type`: NonEmptyProperty[String],
    auth: Property[SourceAuth] = Empty,
    buildSpec: Property[String] = Empty,
    gitCloneDepth: Property[Int] = Empty,
    insecureSsl: Property[Boolean] = Empty,
    location: Property[String] = Empty) extends Expression[Source] {
  def render: Formattable = Value(
    "Type" -> `type`,
    "Auth" -> auth,
    "BuildSpec" -> buildSpec,
    "GitCloneDepth" -> gitCloneDepth,
    "InsecureSsl" -> insecureSsl,
    "Location" -> location
  )
}
