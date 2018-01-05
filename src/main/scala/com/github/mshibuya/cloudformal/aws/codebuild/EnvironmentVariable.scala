package com.github.mshibuya.cloudformal.aws.codebuild

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-environmentvariable.html
 */

case class EnvironmentVariable(
    `type`: Option[String] = None,
    value: String,
    name: String) extends Renderable {
  def render: Formattable = Formattable.opt(
    "Type" -> `type`.map(Formattable(_)),
    "Value" -> Some(Formattable(value)),
    "Name" -> Some(Formattable(name))
  )
}
