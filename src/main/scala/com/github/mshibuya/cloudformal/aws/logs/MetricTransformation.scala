package com.github.mshibuya.cloudformal.aws.logs

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-logs-metricfilter-metrictransformation.html
 */

case class MetricTransformation(
    metricName: String,
    metricNamespace: String,
    metricValue: String) extends Renderable {
  def render: Formattable = Formattable.opt(
    "MetricName" -> Some(Formattable(metricName)),
    "MetricNamespace" -> Some(Formattable(metricNamespace)),
    "MetricValue" -> Some(Formattable(metricValue))
  )
}
