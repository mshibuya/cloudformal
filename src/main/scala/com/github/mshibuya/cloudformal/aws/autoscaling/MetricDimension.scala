package com.github.mshibuya.cloudformal.aws.autoscaling

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-scalingpolicy-metricdimension.html
 */

case class MetricDimension(
    name: NonEmptyProperty[String],
    value: NonEmptyProperty[String]) extends Renderable {
  def render: Formattable = Formattable.withProperties(
    "Name" -> name,
    "Value" -> value
  )
}
