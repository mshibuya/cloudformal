package com.github.mshibuya.cloudformal.aws.cognito

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpooluser-attributetype.html
 */

case class AttributeType(
    value: Property[String] = Empty,
    name: Property[String] = Empty) extends Expression[AttributeType] {
  def render: Formattable = Value(
    "Value" -> value,
    "Name" -> name
  )
}
