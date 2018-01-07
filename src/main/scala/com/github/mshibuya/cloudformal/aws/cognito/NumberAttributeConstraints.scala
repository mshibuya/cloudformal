package com.github.mshibuya.cloudformal.aws.cognito

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-numberattributeconstraints.html
 */

case class NumberAttributeConstraints(
    minValue: Property[String] = Empty,
    maxValue: Property[String] = Empty) extends Renderable {
  def render: Formattable = Formattable.withProperties(
    "MinValue" -> minValue,
    "MaxValue" -> maxValue
  )
}
