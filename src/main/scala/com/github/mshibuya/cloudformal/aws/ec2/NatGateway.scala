package com.github.mshibuya.cloudformal.aws.ec2

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-natgateway.html
 */

trait NatGateway extends Resource {
  val resourceTypeName = "AWS::EC2::NatGateway"

  def allocationId: String
  def subnetId: String
  def tags: Option[Seq[Tag]] = None

  def resourceProperties: FormattableMap = Formattable.opt(
    "AllocationId" -> Some(Formattable(allocationId)),
    "SubnetId" -> Some(Formattable(subnetId)),
    "Tags" -> tags.map(Formattable(_))
  )
}
