package com.github.mshibuya.cloudformal.aws.logs

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-metricfilter.html
 */

trait MetricFilter extends Resource {
  val resourceTypeName = "AWS::Logs::MetricFilter"

  def filterPattern: String
  def logGroupName: String
  def metricTransformations: Seq[MetricTransformation]

  def resourceProperties: FormattableMap = Formattable.opt(
    "FilterPattern" -> Some(Formattable(filterPattern)),
    "LogGroupName" -> Some(Formattable(logGroupName)),
    "MetricTransformations" -> Some(Formattable(metricTransformations))
  )
}
