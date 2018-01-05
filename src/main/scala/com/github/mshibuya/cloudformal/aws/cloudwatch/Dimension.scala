package com.github.mshibuya.cloudformal.aws.cloudwatch

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cw-dimension.html
 */

case class Dimension(
    name: String,
    value: String) extends Renderable {
  def render: Formattable = Formattable.opt(
    "Name" -> Some(Formattable(name)),
    "Value" -> Some(Formattable(value))
  )
}
