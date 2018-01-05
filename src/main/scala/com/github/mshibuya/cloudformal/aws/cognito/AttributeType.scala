package com.github.mshibuya.cloudformal.aws.cognito

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpooluser-attributetype.html
 */

case class AttributeType(
    value: Option[String] = None,
    name: Option[String] = None) extends Renderable {
  def render: Formattable = Formattable.opt(
    "Value" -> value.map(Formattable(_)),
    "Name" -> name.map(Formattable(_))
  )
}
