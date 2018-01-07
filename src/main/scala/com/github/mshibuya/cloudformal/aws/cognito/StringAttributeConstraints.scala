package com.github.mshibuya.cloudformal.aws.cognito

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-stringattributeconstraints.html
 */

case class StringAttributeConstraints(
    minLength: Property[String] = Empty,
    maxLength: Property[String] = Empty) extends Renderable {
  def render: Formattable = Formattable.withProperties(
    "MinLength" -> minLength,
    "MaxLength" -> maxLength
  )
}
