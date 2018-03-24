package com.github.mshibuya.cloudformal.aws.applicationautoscaling

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalingpolicy-metricdimension.html
 */

case class MetricDimension(
    name: NonEmptyProperty[String],
    value: NonEmptyProperty[String]) extends Expression[MetricDimension] {
  def render: Formattable = Value(
    "Name" -> name,
    "Value" -> value
  )
}
