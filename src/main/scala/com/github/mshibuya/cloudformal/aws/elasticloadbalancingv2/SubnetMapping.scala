package com.github.mshibuya.cloudformal.aws.elasticloadbalancingv2

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-loadbalancer-subnetmapping.html
 */

case class SubnetMapping(
    allocationId: NonEmptyProperty[String],
    subnetId: NonEmptyProperty[String]) extends Expression[SubnetMapping] {
  def render: Formattable = Value(
    "AllocationId" -> allocationId,
    "SubnetId" -> subnetId
  )
}
