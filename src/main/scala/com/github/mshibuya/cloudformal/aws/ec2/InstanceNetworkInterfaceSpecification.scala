package com.github.mshibuya.cloudformal.aws.ec2

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications-networkinterfaces.html
 */

case class InstanceNetworkInterfaceSpecification(
    associatePublicIpAddress: Property[Boolean] = Empty,
    deleteOnTermination: Property[Boolean] = Empty,
    description: Property[String] = Empty,
    deviceIndex: Property[Int] = Empty,
    groups: Property[Seq[String]] = Empty,
    ipv6AddressCount: Property[Int] = Empty,
    ipv6Addresses: Property[Seq[InstanceIpv6Address]] = Empty,
    networkInterfaceId: Property[String] = Empty,
    privateIpAddresses: Property[Seq[PrivateIpAddressSpecification]] = Empty,
    secondaryPrivateIpAddressCount: Property[Int] = Empty,
    subnetId: Property[String] = Empty) extends Expression[InstanceNetworkInterfaceSpecification] {
  def render: Formattable = Value(
    "AssociatePublicIpAddress" -> associatePublicIpAddress,
    "DeleteOnTermination" -> deleteOnTermination,
    "Description" -> description,
    "DeviceIndex" -> deviceIndex,
    "Groups" -> groups,
    "Ipv6AddressCount" -> ipv6AddressCount,
    "Ipv6Addresses" -> ipv6Addresses,
    "NetworkInterfaceId" -> networkInterfaceId,
    "PrivateIpAddresses" -> privateIpAddresses,
    "SecondaryPrivateIpAddressCount" -> secondaryPrivateIpAddressCount,
    "SubnetId" -> subnetId
  )
}
