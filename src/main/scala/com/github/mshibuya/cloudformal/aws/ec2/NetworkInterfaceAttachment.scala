package com.github.mshibuya.cloudformal.aws.ec2

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-network-interface-attachment.html
 */

trait NetworkInterfaceAttachment extends Resource {
  val resourceTypeName = "AWS::EC2::NetworkInterfaceAttachment"

  def deleteOnTermination: Option[Boolean] = None
  def deviceIndex: String
  def instanceId: String
  def networkInterfaceId: String

  def resourceProperties: FormattableMap = Formattable.opt(
    "DeleteOnTermination" -> deleteOnTermination.map(Formattable(_)),
    "DeviceIndex" -> Some(Formattable(deviceIndex)),
    "InstanceId" -> Some(Formattable(instanceId)),
    "NetworkInterfaceId" -> Some(Formattable(networkInterfaceId))
  )
}
