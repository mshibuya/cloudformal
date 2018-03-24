package com.github.mshibuya.cloudformal.aws.cognito

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-stringattributeconstraints.html
 */

case class StringAttributeConstraints(
    minLength: Property[String] = Empty,
    maxLength: Property[String] = Empty) extends Expression[StringAttributeConstraints] {
  def render: Formattable = Value(
    "MinLength" -> minLength,
    "MaxLength" -> maxLength
  )
}
