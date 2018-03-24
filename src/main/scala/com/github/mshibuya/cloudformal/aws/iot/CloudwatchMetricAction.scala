package com.github.mshibuya.cloudformal.aws.iot

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-cloudwatchmetricaction.html
 */

case class CloudwatchMetricAction(
    metricName: NonEmptyProperty[String],
    metricNamespace: NonEmptyProperty[String],
    metricTimestamp: Property[String] = Empty,
    metricUnit: NonEmptyProperty[String],
    metricValue: NonEmptyProperty[String],
    roleArn: NonEmptyProperty[String]) extends Expression[CloudwatchMetricAction] {
  def render: Formattable = Value(
    "MetricName" -> metricName,
    "MetricNamespace" -> metricNamespace,
    "MetricTimestamp" -> metricTimestamp,
    "MetricUnit" -> metricUnit,
    "MetricValue" -> metricValue,
    "RoleArn" -> roleArn
  )
}
