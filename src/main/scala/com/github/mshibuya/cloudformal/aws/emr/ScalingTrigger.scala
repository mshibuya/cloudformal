package com.github.mshibuya.cloudformal.aws.emr

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-scalingtrigger.html
 */

case class ScalingTrigger(
    cloudWatchAlarmDefinition: NonEmptyProperty[CloudWatchAlarmDefinition]) extends Expression[ScalingTrigger] {
  def render: Formattable = Value(
    "CloudWatchAlarmDefinition" -> cloudWatchAlarmDefinition
  )
}
