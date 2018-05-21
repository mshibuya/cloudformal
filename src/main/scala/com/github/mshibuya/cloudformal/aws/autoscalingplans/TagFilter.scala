package com.github.mshibuya.cloudformal.aws.autoscalingplans

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-tagfilter.html
 */

case class TagFilter(
    values: Property[Seq[String]] = Empty,
    key: NonEmptyProperty[String]) extends Expression[TagFilter] {
  def render: Formattable = Value(
    "Values" -> values,
    "Key" -> key
  )
}
