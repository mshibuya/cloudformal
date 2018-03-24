package com.github.mshibuya.cloudformal.aws.codebuild

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-environmentvariable.html
 */

case class EnvironmentVariable(
    `type`: Property[String] = Empty,
    value: NonEmptyProperty[String],
    name: NonEmptyProperty[String]) extends Expression[EnvironmentVariable] {
  def render: Formattable = Value(
    "Type" -> `type`,
    "Value" -> value,
    "Name" -> name
  )
}
