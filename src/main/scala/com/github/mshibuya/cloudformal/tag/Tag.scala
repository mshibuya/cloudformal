package com.github.mshibuya.cloudformal.tag

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html
 */

case class Tag(
    key: NonEmptyProperty[String],
    value: NonEmptyProperty[String]) extends Renderable {
  def render: Formattable = Formattable.withProperties(
    "Key" -> key,
    "Value" -> value
  )
}
