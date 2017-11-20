package com.github.mshibuya.cloudformal.aws.ec2

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-network-iface-embedded.html
 */

case class EC2NetworkInterface(
    associatePublicIpAddress: Option[Boolean] = None,
    deleteOnTermination: Option[Boolean] = None,
    description: Option[String] = None,
    deviceIndex: String,
    groupSet: Option[Seq[String]] = None,
    networkInterfaceId: Option[String] = None,
    ipv6AddressCount: Option[Int] = None,
    ipv6Addresses: Option[Seq[EC2NetworkInterfaceIpv6Addresses]] = None,
    privateIpAddress: Option[String] = None,
    privateIpAddresses: Option[Seq[PrivateIpAddressSpecification]] = None,
    secondaryPrivateIpAddressCount: Option[Int] = None,
    subnetId: Option[String] = None) extends Renderable {
  def render: Formattable = Formattable.opt(
    "AssociatePublicIpAddress" -> associatePublicIpAddress.map(Formattable(_)),
    "DeleteOnTermination" -> deleteOnTermination.map(Formattable(_)),
    "Description" -> description.map(Formattable(_)),
    "DeviceIndex" -> Some(Formattable(deviceIndex)),
    "GroupSet" -> groupSet.map(Formattable(_)),
    "NetworkInterfaceId" -> networkInterfaceId.map(Formattable(_)),
    "Ipv6AddressCount" -> ipv6AddressCount.map(Formattable(_)),
    "Ipv6Addresses" -> ipv6Addresses.map(Formattable(_)),
    "PrivateIpAddress" -> privateIpAddress.map(Formattable(_)),
    "PrivateIpAddresses" -> privateIpAddresses.map(Formattable(_)),
    "SecondaryPrivateIpAddressCount" -> secondaryPrivateIpAddressCount.map(Formattable(_)),
    "SubnetId" -> subnetId.map(Formattable(_))
  )
}
