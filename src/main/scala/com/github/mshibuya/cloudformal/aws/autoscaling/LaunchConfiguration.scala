package com.github.mshibuya.cloudformal.aws.autoscaling

import com.github.mshibuya.cloudformal.model._
import com.github.mshibuya.cloudformal.model.policy._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-launchconfig.html
 */

trait LaunchConfiguration extends Resource with Resource.WithDeletionPolicy {
  val resourceTypeName = "AWS::AutoScaling::LaunchConfiguration"

  def associatePublicIpAddress: Property[Boolean] = Empty
  def blockDeviceMappings: Property[Seq[BlockDeviceMapping]] = Empty
  def classicLinkVPCId: Property[String] = Empty
  def classicLinkVPCSecurityGroups: Property[Seq[String]] = Empty
  def ebsOptimized: Property[Boolean] = Empty
  def iamInstanceProfile: Property[String] = Empty
  def imageId: NonEmptyProperty[String]
  def instanceId: Property[String] = Empty
  def instanceMonitoring: Property[Boolean] = Empty
  def instanceType: NonEmptyProperty[String]
  def kernelId: Property[String] = Empty
  def keyName: Property[String] = Empty
  def placementTenancy: Property[String] = Empty
  def ramDiskId: Property[String] = Empty
  def securityGroups: Property[Seq[String]] = Empty
  def spotPrice: Property[String] = Empty
  def userData: Property[String] = Empty

  def resourceProperties: FormattableMap = Formattable.withProperties(
    "AssociatePublicIpAddress" -> associatePublicIpAddress,
    "BlockDeviceMappings" -> blockDeviceMappings,
    "ClassicLinkVPCId" -> classicLinkVPCId,
    "ClassicLinkVPCSecurityGroups" -> classicLinkVPCSecurityGroups,
    "EbsOptimized" -> ebsOptimized,
    "IamInstanceProfile" -> iamInstanceProfile,
    "ImageId" -> imageId,
    "InstanceId" -> instanceId,
    "InstanceMonitoring" -> instanceMonitoring,
    "InstanceType" -> instanceType,
    "KernelId" -> kernelId,
    "KeyName" -> keyName,
    "PlacementTenancy" -> placementTenancy,
    "RamDiskId" -> ramDiskId,
    "SecurityGroups" -> securityGroups,
    "SpotPrice" -> spotPrice,
    "UserData" -> userData
  )
}
