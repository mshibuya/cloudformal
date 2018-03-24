package com.github.mshibuya.cloudformal.aws.cloudwatch

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cw-dimension.html
 */

case class Dimension(
    name: NonEmptyProperty[String],
    value: NonEmptyProperty[String]) extends Expression[Dimension] {
  def render: Formattable = Value(
    "Name" -> name,
    "Value" -> value
  )
}
