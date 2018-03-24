package com.github.mshibuya.cloudformal.aws.ec2

import com.github.mshibuya.cloudformal.model._
import com.github.mshibuya.cloudformal.model.policy._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-subnet-network-acl-assoc.html
 */

trait SubnetNetworkAclAssociation extends Resource[SubnetNetworkAclAssociation] with Resource.WithDeletionPolicy {
  val resourceTypeName = "AWS::EC2::SubnetNetworkAclAssociation"

  object attributes {
    val associationId: Expression[String] = Fn.GetAtt(logicalId, "AssociationId")
  }

  def networkAclId: NonEmptyProperty[String]
  def subnetId: NonEmptyProperty[String]

  def render(): MapValue[_] = Value(
    "NetworkAclId" -> networkAclId,
    "SubnetId" -> subnetId
  )
}
