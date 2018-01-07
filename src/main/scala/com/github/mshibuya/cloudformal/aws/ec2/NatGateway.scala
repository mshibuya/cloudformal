package com.github.mshibuya.cloudformal.aws.ec2

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-natgateway.html
 */

trait NatGateway extends Resource {
  val resourceTypeName = "AWS::EC2::NatGateway"

  def allocationId: NonEmptyProperty[String]
  def subnetId: NonEmptyProperty[String]
  def tags: Property[Seq[Tag]] = Empty

  def resourceProperties: FormattableMap = Formattable.withProperties(
    "AllocationId" -> allocationId,
    "SubnetId" -> subnetId,
    "Tags" -> tags
  )
}
