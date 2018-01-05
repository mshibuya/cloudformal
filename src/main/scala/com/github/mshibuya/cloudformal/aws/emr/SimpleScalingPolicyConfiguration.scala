package com.github.mshibuya.cloudformal.aws.emr

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-instancegroupconfig-simplescalingpolicyconfiguration.html
 */

case class SimpleScalingPolicyConfiguration(
    adjustmentType: Option[String] = None,
    coolDown: Option[Int] = None,
    scalingAdjustment: Int) extends Renderable {
  def render: Formattable = Formattable.opt(
    "AdjustmentType" -> adjustmentType.map(Formattable(_)),
    "CoolDown" -> coolDown.map(Formattable(_)),
    "ScalingAdjustment" -> Some(Formattable(scalingAdjustment))
  )
}
