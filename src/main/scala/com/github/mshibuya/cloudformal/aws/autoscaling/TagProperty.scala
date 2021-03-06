package com.github.mshibuya.cloudformal.aws.autoscaling

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-tags.html
 */

case class TagProperty(
    key: NonEmptyProperty[String],
    propagateAtLaunch: NonEmptyProperty[Boolean],
    value: NonEmptyProperty[String]) extends Expression[TagProperty] {
  def render: Formattable = Value(
    "Key" -> key,
    "PropagateAtLaunch" -> propagateAtLaunch,
    "Value" -> value
  )
}
