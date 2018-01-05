package com.github.mshibuya.cloudformal.aws.cognito

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-stringattributeconstraints.html
 */

case class StringAttributeConstraints(
    minLength: Option[String] = None,
    maxLength: Option[String] = None) extends Renderable {
  def render: Formattable = Formattable.opt(
    "MinLength" -> minLength.map(Formattable(_)),
    "MaxLength" -> maxLength.map(Formattable(_))
  )
}
