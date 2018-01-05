package com.github.mshibuya.cloudformal.aws.opsworks

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-app-environment.html
 */

case class EnvironmentVariable(
    key: String,
    secure: Option[Boolean] = None,
    value: String) extends Renderable {
  def render: Formattable = Formattable.opt(
    "Key" -> Some(Formattable(key)),
    "Secure" -> secure.map(Formattable(_)),
    "Value" -> Some(Formattable(value))
  )
}
