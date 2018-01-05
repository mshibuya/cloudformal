package com.github.mshibuya.cloudformal.aws.emr

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-instancegroupconfig-scalingaction.html
 */

case class ScalingAction(
    market: Option[String] = None,
    simpleScalingPolicyConfiguration: SimpleScalingPolicyConfiguration) extends Renderable {
  def render: Formattable = Formattable.opt(
    "Market" -> market.map(Formattable(_)),
    "SimpleScalingPolicyConfiguration" -> Some(Formattable(simpleScalingPolicyConfiguration))
  )
}
