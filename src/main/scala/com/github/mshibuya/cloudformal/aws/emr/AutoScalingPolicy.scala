package com.github.mshibuya.cloudformal.aws.emr

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-instancegroupconfig-autoscalingpolicy.html
 */

case class AutoScalingPolicy(
    constraints: ScalingConstraints,
    rules: Seq[ScalingRule]) extends Renderable {
  def render: Formattable = Formattable.opt(
    "Constraints" -> Some(Formattable(constraints)),
    "Rules" -> Some(Formattable(rules))
  )
}
