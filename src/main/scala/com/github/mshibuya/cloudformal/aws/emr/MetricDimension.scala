package com.github.mshibuya.cloudformal.aws.emr

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-metricdimension.html
 */

case class MetricDimension(
    key: NonEmptyProperty[String],
    value: NonEmptyProperty[String]) extends Expression[MetricDimension] {
  def render: Formattable = Value(
    "Key" -> key,
    "Value" -> value
  )
}
