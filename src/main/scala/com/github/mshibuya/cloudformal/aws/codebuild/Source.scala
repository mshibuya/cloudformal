package com.github.mshibuya.cloudformal.aws.codebuild

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-source.html
 */

case class Source(
    `type`: String,
    auth: Option[SourceAuth] = None,
    buildSpec: Option[String] = None,
    location: Option[String] = None) extends Renderable {
  def render: Formattable = Formattable.opt(
    "Type" -> Some(Formattable(`type`)),
    "Auth" -> auth.map(Formattable(_)),
    "BuildSpec" -> buildSpec.map(Formattable(_)),
    "Location" -> location.map(Formattable(_))
  )
}
