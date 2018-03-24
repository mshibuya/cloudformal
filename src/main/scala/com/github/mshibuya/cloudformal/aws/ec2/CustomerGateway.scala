package com.github.mshibuya.cloudformal.aws.ec2

import com.github.mshibuya.cloudformal.model._
import com.github.mshibuya.cloudformal.model.policy._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-customer-gateway.html
 */

trait CustomerGateway extends Resource[CustomerGateway] with Resource.WithDeletionPolicy {
  val resourceTypeName = "AWS::EC2::CustomerGateway"

  def bgpAsn: NonEmptyProperty[Int]
  def ipAddress: NonEmptyProperty[String]
  def tags: Property[Seq[Tag]] = Empty
  def `type`: NonEmptyProperty[String]

  def render(): MapValue[_] = Value(
    "BgpAsn" -> bgpAsn,
    "IpAddress" -> ipAddress,
    "Tags" -> tags,
    "Type" -> `type`
  )
}
