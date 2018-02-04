package com.github.mshibuya.cloudformal.aws.ec2

import com.github.mshibuya.cloudformal.model._
import com.github.mshibuya.cloudformal.model.policy._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpc.html
 */

trait VPC extends Resource with Resource.WithDeletionPolicy {
  val resourceTypeName = "AWS::EC2::VPC"

  object attributes {
    val cidrBlock: Expression[String] = Fn.GetAtt(logicalId, "CidrBlock")
    val cidrBlockAssociations: Expression[Seq[String]] = Fn.GetAtt(logicalId, "CidrBlockAssociations")
    val defaultNetworkAcl: Expression[String] = Fn.GetAtt(logicalId, "DefaultNetworkAcl")
    val defaultSecurityGroup: Expression[String] = Fn.GetAtt(logicalId, "DefaultSecurityGroup")
    val ipv6CidrBlocks: Expression[Seq[String]] = Fn.GetAtt(logicalId, "Ipv6CidrBlocks")
  }

  def cidrBlock: NonEmptyProperty[String]
  def enableDnsHostnames: Property[Boolean] = Empty
  def enableDnsSupport: Property[Boolean] = Empty
  def instanceTenancy: Property[String] = Empty
  def tags: Property[Seq[Tag]] = Empty

  def resourceProperties: FormattableMap = Formattable.withProperties(
    "CidrBlock" -> cidrBlock,
    "EnableDnsHostnames" -> enableDnsHostnames,
    "EnableDnsSupport" -> enableDnsSupport,
    "InstanceTenancy" -> instanceTenancy,
    "Tags" -> tags
  )
}
