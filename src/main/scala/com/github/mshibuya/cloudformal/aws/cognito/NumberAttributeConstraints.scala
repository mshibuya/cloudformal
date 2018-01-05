package com.github.mshibuya.cloudformal.aws.cognito

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-numberattributeconstraints.html
 */

case class NumberAttributeConstraints(
    minValue: Option[String] = None,
    maxValue: Option[String] = None) extends Renderable {
  def render: Formattable = Formattable.opt(
    "MinValue" -> minValue.map(Formattable(_)),
    "MaxValue" -> maxValue.map(Formattable(_))
  )
}
