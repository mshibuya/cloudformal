package com.github.mshibuya.cloudformal.aws.iot

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-cloudwatchmetricaction.html
 */

case class CloudwatchMetricAction(
    metricName: String,
    metricNamespace: String,
    metricTimestamp: Option[String] = None,
    metricUnit: String,
    metricValue: String,
    roleArn: String) extends Renderable {
  def render: Formattable = Formattable.opt(
    "MetricName" -> Some(Formattable(metricName)),
    "MetricNamespace" -> Some(Formattable(metricNamespace)),
    "MetricTimestamp" -> metricTimestamp.map(Formattable(_)),
    "MetricUnit" -> Some(Formattable(metricUnit)),
    "MetricValue" -> Some(Formattable(metricValue)),
    "RoleArn" -> Some(Formattable(roleArn))
  )
}
