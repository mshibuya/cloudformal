package com.github.mshibuya.cloudformal.aws.elasticloadbalancingv2

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-loadbalancer-subnetmapping.html
 */

case class SubnetMapping(
    allocationId: String,
    subnetId: String) extends Renderable {
  def render: Formattable = Formattable.opt(
    "AllocationId" -> Some(Formattable(allocationId)),
    "SubnetId" -> Some(Formattable(subnetId))
  )
}
