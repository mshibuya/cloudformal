package com.github.mshibuya.cloudformal.aws.ec2

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-network-interface.html
 */

trait NetworkInterface extends Resource {
  val resourceTypeName = "AWS::EC2::NetworkInterface"

  def description: Option[String] = None
  def groupSet: Option[Seq[String]] = None
  def interfaceType: Option[String] = None
  def ipv6AddressCount: Option[Int] = None
  def ipv6Addresses: Option[InstanceIpv6Address] = None
  def privateIpAddress: Option[String] = None
  def privateIpAddresses: Option[Seq[PrivateIpAddressSpecification]] = None
  def secondaryPrivateIpAddressCount: Option[Int] = None
  def sourceDestCheck: Option[Boolean] = None
  def subnetId: String
  def tags: Option[Seq[Tag]] = None

  def resourceProperties: FormattableMap = Formattable.opt(
    "Description" -> description.map(Formattable(_)),
    "GroupSet" -> groupSet.map(Formattable(_)),
    "InterfaceType" -> interfaceType.map(Formattable(_)),
    "Ipv6AddressCount" -> ipv6AddressCount.map(Formattable(_)),
    "Ipv6Addresses" -> ipv6Addresses.map(Formattable(_)),
    "PrivateIpAddress" -> privateIpAddress.map(Formattable(_)),
    "PrivateIpAddresses" -> privateIpAddresses.map(Formattable(_)),
    "SecondaryPrivateIpAddressCount" -> secondaryPrivateIpAddressCount.map(Formattable(_)),
    "SourceDestCheck" -> sourceDestCheck.map(Formattable(_)),
    "SubnetId" -> Some(Formattable(subnetId)),
    "Tags" -> tags.map(Formattable(_))
  )
}
