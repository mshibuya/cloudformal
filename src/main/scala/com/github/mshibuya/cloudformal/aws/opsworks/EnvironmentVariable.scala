package com.github.mshibuya.cloudformal.aws.opsworks

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-app-environment.html
 */

case class EnvironmentVariable(
    key: NonEmptyProperty[String],
    secure: Property[Boolean] = Empty,
    value: NonEmptyProperty[String]) extends Renderable {
  def render: Formattable = Formattable.withProperties(
    "Key" -> key,
    "Secure" -> secure,
    "Value" -> value
  )
}
