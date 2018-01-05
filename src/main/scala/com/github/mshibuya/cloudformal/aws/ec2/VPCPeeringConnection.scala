package com.github.mshibuya.cloudformal.aws.ec2

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcpeeringconnection.html
 */

trait VPCPeeringConnection extends Resource {
  val resourceTypeName = "AWS::EC2::VPCPeeringConnection"

  def peerOwnerId: Option[String] = None
  def peerRoleArn: Option[String] = None
  def peerVpcId: String
  def tags: Option[Seq[Tag]] = None
  def vpcId: String

  def resourceProperties: FormattableMap = Formattable.opt(
    "PeerOwnerId" -> peerOwnerId.map(Formattable(_)),
    "PeerRoleArn" -> peerRoleArn.map(Formattable(_)),
    "PeerVpcId" -> Some(Formattable(peerVpcId)),
    "Tags" -> tags.map(Formattable(_)),
    "VpcId" -> Some(Formattable(vpcId))
  )
}
