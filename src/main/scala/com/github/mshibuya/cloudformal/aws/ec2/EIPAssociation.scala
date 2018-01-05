package com.github.mshibuya.cloudformal.aws.ec2

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-eip-association.html
 */

trait EIPAssociation extends Resource {
  val resourceTypeName = "AWS::EC2::EIPAssociation"

  def allocationId: Option[String] = None
  def eIP: Option[String] = None
  def instanceId: Option[String] = None
  def networkInterfaceId: Option[String] = None
  def privateIpAddress: Option[String] = None

  def resourceProperties: FormattableMap = Formattable.opt(
    "AllocationId" -> allocationId.map(Formattable(_)),
    "EIP" -> eIP.map(Formattable(_)),
    "InstanceId" -> instanceId.map(Formattable(_)),
    "NetworkInterfaceId" -> networkInterfaceId.map(Formattable(_)),
    "PrivateIpAddress" -> privateIpAddress.map(Formattable(_))
  )
}
