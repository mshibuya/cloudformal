package com.github.mshibuya.cloudformal.aws.ec2

import com.github.mshibuya.cloudformal.model._
import com.github.mshibuya.cloudformal.model.policy._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html
 */

trait Instance extends Resource[Instance] with Resource.WithCreationPolicy with Resource.WithDeletionPolicy {
  val resourceTypeName = "AWS::EC2::Instance"

  object attributes {
    val availabilityZone: Expression[String] = Fn.GetAtt(logicalId, "AvailabilityZone")
    val privateDnsName: Expression[String] = Fn.GetAtt(logicalId, "PrivateDnsName")
    val privateIp: Expression[String] = Fn.GetAtt(logicalId, "PrivateIp")
    val publicDnsName: Expression[String] = Fn.GetAtt(logicalId, "PublicDnsName")
    val publicIp: Expression[String] = Fn.GetAtt(logicalId, "PublicIp")
  }

  def additionalInfo: Property[String] = Empty
  def affinity: Property[String] = Empty
  def availabilityZone: Property[String] = Empty
  def blockDeviceMappings: Property[Seq[BlockDeviceMapping]] = Empty
  def creditSpecification: Property[CreditSpecification] = Empty
  def disableApiTermination: Property[Boolean] = Empty
  def ebsOptimized: Property[Boolean] = Empty
  def elasticGpuSpecifications: Property[Seq[ElasticGpuSpecification]] = Empty
  def hostId: Property[String] = Empty
  def iamInstanceProfile: Property[String] = Empty
  def imageId: NonEmptyProperty[String]
  def instanceInitiatedShutdownBehavior: Property[String] = Empty
  def instanceType: Property[String] = Empty
  def ipv6AddressCount: Property[Int] = Empty
  def ipv6Addresses: Property[Seq[InstanceIpv6Address]] = Empty
  def kernelId: Property[String] = Empty
  def keyName: Property[String] = Empty
  def monitoring: Property[Boolean] = Empty
  def networkInterfaces: Property[Seq[NetworkInterface]] = Empty
  def placementGroupName: Property[String] = Empty
  def privateIpAddress: Property[String] = Empty
  def ramdiskId: Property[String] = Empty
  def securityGroupIds: Property[Seq[String]] = Empty
  def securityGroups: Property[Seq[String]] = Empty
  def sourceDestCheck: Property[Boolean] = Empty
  def ssmAssociations: Property[Seq[SsmAssociation]] = Empty
  def subnetId: Property[String] = Empty
  def tags: Property[Seq[Tag]] = Empty
  def tenancy: Property[String] = Empty
  def userData: Property[String] = Empty
  def volumes: Property[Seq[Volume]] = Empty

  def render(): MapValue[_] = Value(
    "AdditionalInfo" -> additionalInfo,
    "Affinity" -> affinity,
    "AvailabilityZone" -> availabilityZone,
    "BlockDeviceMappings" -> blockDeviceMappings,
    "CreditSpecification" -> creditSpecification,
    "DisableApiTermination" -> disableApiTermination,
    "EbsOptimized" -> ebsOptimized,
    "ElasticGpuSpecifications" -> elasticGpuSpecifications,
    "HostId" -> hostId,
    "IamInstanceProfile" -> iamInstanceProfile,
    "ImageId" -> imageId,
    "InstanceInitiatedShutdownBehavior" -> instanceInitiatedShutdownBehavior,
    "InstanceType" -> instanceType,
    "Ipv6AddressCount" -> ipv6AddressCount,
    "Ipv6Addresses" -> ipv6Addresses,
    "KernelId" -> kernelId,
    "KeyName" -> keyName,
    "Monitoring" -> monitoring,
    "NetworkInterfaces" -> networkInterfaces,
    "PlacementGroupName" -> placementGroupName,
    "PrivateIpAddress" -> privateIpAddress,
    "RamdiskId" -> ramdiskId,
    "SecurityGroupIds" -> securityGroupIds,
    "SecurityGroups" -> securityGroups,
    "SourceDestCheck" -> sourceDestCheck,
    "SsmAssociations" -> ssmAssociations,
    "SubnetId" -> subnetId,
    "Tags" -> tags,
    "Tenancy" -> tenancy,
    "UserData" -> userData,
    "Volumes" -> volumes
  )
}
