package com.github.mshibuya.cloudformal.aws.codebuild

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-source.html
 */

case class Source(
    `type`: NonEmptyProperty[String],
    auth: Property[SourceAuth] = Empty,
    buildSpec: Property[String] = Empty,
    location: Property[String] = Empty) extends Renderable {
  def render: Formattable = Formattable.withProperties(
    "Type" -> `type`,
    "Auth" -> auth,
    "BuildSpec" -> buildSpec,
    "Location" -> location
  )
}
