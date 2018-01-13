package com.github.mshibuya.cloudformal.aws.ec2

import com.github.mshibuya.cloudformal.model._
import com.github.mshibuya.cloudformal.model.policy._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-network-interface.html
 */

trait NetworkInterface extends Resource with Resource.WithDeletionPolicy {
  val resourceTypeName = "AWS::EC2::NetworkInterface"

  def primaryPrivateIpAddressAttribute: Expression[String] = Fn.GetAtt(logicalId, "PrimaryPrivateIpAddress")
  def secondaryPrivateIpAddressesAttribute: Expression[Seq[String]] = Fn.GetAtt(logicalId, "SecondaryPrivateIpAddresses")

  def description: Property[String] = Empty
  def groupSet: Property[Seq[String]] = Empty
  def interfaceType: Property[String] = Empty
  def ipv6AddressCount: Property[Int] = Empty
  def ipv6Addresses: Property[InstanceIpv6Address] = Empty
  def privateIpAddress: Property[String] = Empty
  def privateIpAddresses: Property[Seq[PrivateIpAddressSpecification]] = Empty
  def secondaryPrivateIpAddressCount: Property[Int] = Empty
  def sourceDestCheck: Property[Boolean] = Empty
  def subnetId: NonEmptyProperty[String]
  def tags: Property[Seq[Tag]] = Empty

  def resourceProperties: FormattableMap = Formattable.withProperties(
    "Description" -> description,
    "GroupSet" -> groupSet,
    "InterfaceType" -> interfaceType,
    "Ipv6AddressCount" -> ipv6AddressCount,
    "Ipv6Addresses" -> ipv6Addresses,
    "PrivateIpAddress" -> privateIpAddress,
    "PrivateIpAddresses" -> privateIpAddresses,
    "SecondaryPrivateIpAddressCount" -> secondaryPrivateIpAddressCount,
    "SourceDestCheck" -> sourceDestCheck,
    "SubnetId" -> subnetId,
    "Tags" -> tags
  )
}
