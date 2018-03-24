package com.github.mshibuya.cloudformal.aws.logs

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-logs-metricfilter-metrictransformation.html
 */

case class MetricTransformation(
    metricName: NonEmptyProperty[String],
    metricNamespace: NonEmptyProperty[String],
    metricValue: NonEmptyProperty[String]) extends Expression[MetricTransformation] {
  def render: Formattable = Value(
    "MetricName" -> metricName,
    "MetricNamespace" -> metricNamespace,
    "MetricValue" -> metricValue
  )
}
