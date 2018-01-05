package com.github.mshibuya.cloudformal.aws.codebuild

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-sourceauth.html
 */

case class SourceAuth(
    `type`: String,
    resource: Option[String] = None) extends Renderable {
  def render: Formattable = Formattable.opt(
    "Type" -> Some(Formattable(`type`)),
    "Resource" -> resource.map(Formattable(_))
  )
}
