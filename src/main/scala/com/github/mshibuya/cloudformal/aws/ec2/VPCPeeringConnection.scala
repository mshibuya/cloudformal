package com.github.mshibuya.cloudformal.aws.ec2

import com.github.mshibuya.cloudformal.model._
import com.github.mshibuya.cloudformal.model.policy._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcpeeringconnection.html
 */

trait VPCPeeringConnection extends Resource with Resource.WithDeletionPolicy {
  val resourceTypeName = "AWS::EC2::VPCPeeringConnection"

  def peerOwnerId: Property[String] = Empty
  def peerRoleArn: Property[String] = Empty
  def peerVpcId: NonEmptyProperty[String]
  def tags: Property[Seq[Tag]] = Empty
  def vpcId: NonEmptyProperty[String]

  def resourceProperties: FormattableMap = Formattable.withProperties(
    "PeerOwnerId" -> peerOwnerId,
    "PeerRoleArn" -> peerRoleArn,
    "PeerVpcId" -> peerVpcId,
    "Tags" -> tags,
    "VpcId" -> vpcId
  )
}
