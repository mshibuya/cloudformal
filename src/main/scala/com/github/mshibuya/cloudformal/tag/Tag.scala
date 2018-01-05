package com.github.mshibuya.cloudformal.tag

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html
 */

case class Tag(
    key: String,
    value: String) extends Renderable {
  def render: Formattable = Formattable.opt(
    "Key" -> Some(Formattable(key)),
    "Value" -> Some(Formattable(value))
  )
}
