package com.github.mshibuya.cloudformal.aws.ec2

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html
 */

trait Instance extends Resource {
  val resourceType = "AWS::EC2::Instance"

  def affinity: Option[String] = None
  def availabilityZone: Option[String] = None
  def blockDeviceMappings: Option[Seq[EC2BlockDeviceMapping]] = None
  def disableApiTermination: Option[Boolean] = None
  def ebsOptimized: Option[Boolean] = None
  def hostId: Option[String] = None
  def iamInstanceProfile: Option[String] = None
  def imageId: String
  def instanceInitiatedShutdownBehavior: Option[String] = None
  def instanceType: Option[String] = None
  def ipv6AddressCount: Option[Int] = None
  def ipv6Addresses: Option[Seq[EC2NetworkInterfaceIpv6Addresses]] = None
  def kernelId: Option[String] = None
  def keyName: Option[String] = None
  def monitoring: Option[Boolean] = None
  def networkInterfaces: Option[Seq[EC2NetworkInterface]] = None
  def placementGroupName: Option[String] = None
  def privateIpAddress: Option[String] = None
  def ramdiskId: Option[String] = None
  def securityGroupIds: Option[Seq[String]] = None
  def securityGroups: Option[Seq[String]] = None
  def sourceDestCheck: Option[Boolean] = None
  def ssmAssociations: Option[Seq[EC2InstanceSsmAssociations]] = None
  def subnetId: Option[String] = None
  def tags: Option[Seq[Tag]] = None
  def tenancy: Option[String] = None
  def userData: Option[String] = None
  def volumes: Option[Seq[EC2MountPoint]] = None
  def additionalInfo: Option[String] = None

  def properties: FormattableMap = Formattable.opt(
    "Affinity" -> affinity.map(Formattable(_)),
    "AvailabilityZone" -> availabilityZone.map(Formattable(_)),
    "BlockDeviceMappings" -> blockDeviceMappings.map(Formattable(_)),
    "DisableApiTermination" -> disableApiTermination.map(Formattable(_)),
    "EbsOptimized" -> ebsOptimized.map(Formattable(_)),
    "HostId" -> hostId.map(Formattable(_)),
    "IamInstanceProfile" -> iamInstanceProfile.map(Formattable(_)),
    "ImageId" -> Some(Formattable(imageId)),
    "InstanceInitiatedShutdownBehavior" -> instanceInitiatedShutdownBehavior.map(Formattable(_)),
    "InstanceType" -> instanceType.map(Formattable(_)),
    "Ipv6AddressCount" -> ipv6AddressCount.map(Formattable(_)),
    "Ipv6Addresses" -> ipv6Addresses.map(Formattable(_)),
    "KernelId" -> kernelId.map(Formattable(_)),
    "KeyName" -> keyName.map(Formattable(_)),
    "Monitoring" -> monitoring.map(Formattable(_)),
    "NetworkInterfaces" -> networkInterfaces.map(Formattable(_)),
    "PlacementGroupName" -> placementGroupName.map(Formattable(_)),
    "PrivateIpAddress" -> privateIpAddress.map(Formattable(_)),
    "RamdiskId" -> ramdiskId.map(Formattable(_)),
    "SecurityGroupIds" -> securityGroupIds.map(Formattable(_)),
    "SecurityGroups" -> securityGroups.map(Formattable(_)),
    "SourceDestCheck" -> sourceDestCheck.map(Formattable(_)),
    "SsmAssociations" -> ssmAssociations.map(Formattable(_)),
    "SubnetId" -> subnetId.map(Formattable(_)),
    "Tags" -> tags.map(Formattable(_)),
    "Tenancy" -> tenancy.map(Formattable(_)),
    "UserData" -> userData.map(Formattable(_)),
    "Volumes" -> volumes.map(Formattable(_)),
    "AdditionalInfo" -> additionalInfo.map(Formattable(_))
  )
}
