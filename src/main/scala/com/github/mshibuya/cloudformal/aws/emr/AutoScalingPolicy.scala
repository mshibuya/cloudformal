package com.github.mshibuya.cloudformal.aws.emr

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-instancegroupconfig-autoscalingpolicy.html
 */

case class AutoScalingPolicy(
    constraints: NonEmptyProperty[ScalingConstraints],
    rules: NonEmptyProperty[Seq[ScalingRule]]) extends Renderable {
  def render: Formattable = Formattable.withProperties(
    "Constraints" -> constraints,
    "Rules" -> rules
  )
}
