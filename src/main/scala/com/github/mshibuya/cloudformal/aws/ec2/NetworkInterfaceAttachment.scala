package com.github.mshibuya.cloudformal.aws.ec2

import com.github.mshibuya.cloudformal.model._
import com.github.mshibuya.cloudformal.model.policy._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-network-interface-attachment.html
 */

trait NetworkInterfaceAttachment extends Resource[NetworkInterfaceAttachment] with Resource.WithDeletionPolicy {
  val resourceTypeName = "AWS::EC2::NetworkInterfaceAttachment"

  def deleteOnTermination: Property[Boolean] = Empty
  def deviceIndex: NonEmptyProperty[String]
  def instanceId: NonEmptyProperty[String]
  def networkInterfaceId: NonEmptyProperty[String]

  def render(): MapValue[_] = Value(
    "DeleteOnTermination" -> deleteOnTermination,
    "DeviceIndex" -> deviceIndex,
    "InstanceId" -> instanceId,
    "NetworkInterfaceId" -> networkInterfaceId
  )
}
