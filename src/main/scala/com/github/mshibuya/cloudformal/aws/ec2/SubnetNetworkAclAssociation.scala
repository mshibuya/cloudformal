package com.github.mshibuya.cloudformal.aws.ec2

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-subnet-network-acl-assoc.html
 */

trait SubnetNetworkAclAssociation extends Resource {
  val resourceTypeName = "AWS::EC2::SubnetNetworkAclAssociation"

  def associationIdAttribute: Expression[String] = Fn.GetAtt(logicalId, "AssociationId")

  def networkAclId: NonEmptyProperty[String]
  def subnetId: NonEmptyProperty[String]

  def resourceProperties: FormattableMap = Formattable.withProperties(
    "NetworkAclId" -> networkAclId,
    "SubnetId" -> subnetId
  )
}
