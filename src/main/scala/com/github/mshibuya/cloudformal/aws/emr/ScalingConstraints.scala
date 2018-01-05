package com.github.mshibuya.cloudformal.aws.emr

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-instancegroupconfig-scalingconstraints.html
 */

case class ScalingConstraints(
    maxCapacity: Int,
    minCapacity: Int) extends Renderable {
  def render: Formattable = Formattable.opt(
    "MaxCapacity" -> Some(Formattable(maxCapacity)),
    "MinCapacity" -> Some(Formattable(minCapacity))
  )
}
