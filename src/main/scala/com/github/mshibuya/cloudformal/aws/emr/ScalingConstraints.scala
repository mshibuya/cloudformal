package com.github.mshibuya.cloudformal.aws.emr

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-instancegroupconfig-scalingconstraints.html
 */

case class ScalingConstraints(
    maxCapacity: NonEmptyProperty[Int],
    minCapacity: NonEmptyProperty[Int]) extends Expression[ScalingConstraints] {
  def render: Formattable = Value(
    "MaxCapacity" -> maxCapacity,
    "MinCapacity" -> minCapacity
  )
}
