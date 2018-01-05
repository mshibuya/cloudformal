package com.github.mshibuya.cloudformal.aws.applicationautoscaling

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalingpolicy-metricdimension.html
 */

case class MetricDimension(
    name: String,
    value: String) extends Renderable {
  def render: Formattable = Formattable.opt(
    "Name" -> Some(Formattable(name)),
    "Value" -> Some(Formattable(value))
  )
}
