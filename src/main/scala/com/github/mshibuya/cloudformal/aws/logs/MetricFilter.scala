package com.github.mshibuya.cloudformal.aws.logs

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-metricfilter.html
 */

trait MetricFilter extends Resource {
  val resourceTypeName = "AWS::Logs::MetricFilter"

  def filterPattern: NonEmptyProperty[String]
  def logGroupName: NonEmptyProperty[String]
  def metricTransformations: NonEmptyProperty[Seq[MetricTransformation]]

  def resourceProperties: FormattableMap = Formattable.withProperties(
    "FilterPattern" -> filterPattern,
    "LogGroupName" -> logGroupName,
    "MetricTransformations" -> metricTransformations
  )
}
