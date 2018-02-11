package com.github.mshibuya.cloudformal.aws.ec2

import com.github.mshibuya.cloudformal.model._
import com.github.mshibuya.cloudformal.model.policy._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-eip-association.html
 */

trait EIPAssociation extends Resource with Resource.WithDeletionPolicy {
  val resourceTypeName = "AWS::EC2::EIPAssociation"

  def allocationId: Property[String] = Empty
  def eiP: Property[String] = Empty
  def instanceId: Property[String] = Empty
  def networkInterfaceId: Property[String] = Empty
  def privateIpAddress: Property[String] = Empty

  def resourceProperties: FormattableMap = Formattable.withProperties(
    "AllocationId" -> allocationId,
    "EIP" -> eiP,
    "InstanceId" -> instanceId,
    "NetworkInterfaceId" -> networkInterfaceId,
    "PrivateIpAddress" -> privateIpAddress
  )
}
