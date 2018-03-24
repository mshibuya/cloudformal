package com.github.mshibuya.cloudformal.aws.logs

import com.github.mshibuya.cloudformal.model._
import com.github.mshibuya.cloudformal.model.policy._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-metricfilter.html
 */

trait MetricFilter extends Resource[MetricFilter] with Resource.WithDeletionPolicy {
  val resourceTypeName = "AWS::Logs::MetricFilter"

  def filterPattern: NonEmptyProperty[String]
  def logGroupName: NonEmptyProperty[String]
  def metricTransformations: NonEmptyProperty[Seq[MetricTransformation]]

  def render(): MapValue[_] = Value(
    "FilterPattern" -> filterPattern,
    "LogGroupName" -> logGroupName,
    "MetricTransformations" -> metricTransformations
  )
}
