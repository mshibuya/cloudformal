package com.github.mshibuya.cloudformal.aws.autoscalingplans

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-metricdimension.html
 */

case class MetricDimension(
    value: NonEmptyProperty[String],
    name: NonEmptyProperty[String]) extends Expression[MetricDimension] {
  def render: Formattable = Value(
    "Value" -> value,
    "Name" -> name
  )
}
