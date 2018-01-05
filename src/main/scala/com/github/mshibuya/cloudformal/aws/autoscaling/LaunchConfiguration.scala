package com.github.mshibuya.cloudformal.aws.autoscaling

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-launchconfig.html
 */

trait LaunchConfiguration extends Resource {
  val resourceTypeName = "AWS::AutoScaling::LaunchConfiguration"

  def associatePublicIpAddress: Option[Boolean] = None
  def blockDeviceMappings: Option[Seq[BlockDeviceMapping]] = None
  def classicLinkVPCId: Option[String] = None
  def classicLinkVPCSecurityGroups: Option[Seq[String]] = None
  def ebsOptimized: Option[Boolean] = None
  def iamInstanceProfile: Option[String] = None
  def imageId: String
  def instanceId: Option[String] = None
  def instanceMonitoring: Option[Boolean] = None
  def instanceType: String
  def kernelId: Option[String] = None
  def keyName: Option[String] = None
  def placementTenancy: Option[String] = None
  def ramDiskId: Option[String] = None
  def securityGroups: Option[Seq[String]] = None
  def spotPrice: Option[String] = None
  def userData: Option[String] = None

  def resourceProperties: FormattableMap = Formattable.opt(
    "AssociatePublicIpAddress" -> associatePublicIpAddress.map(Formattable(_)),
    "BlockDeviceMappings" -> blockDeviceMappings.map(Formattable(_)),
    "ClassicLinkVPCId" -> classicLinkVPCId.map(Formattable(_)),
    "ClassicLinkVPCSecurityGroups" -> classicLinkVPCSecurityGroups.map(Formattable(_)),
    "EbsOptimized" -> ebsOptimized.map(Formattable(_)),
    "IamInstanceProfile" -> iamInstanceProfile.map(Formattable(_)),
    "ImageId" -> Some(Formattable(imageId)),
    "InstanceId" -> instanceId.map(Formattable(_)),
    "InstanceMonitoring" -> instanceMonitoring.map(Formattable(_)),
    "InstanceType" -> Some(Formattable(instanceType)),
    "KernelId" -> kernelId.map(Formattable(_)),
    "KeyName" -> keyName.map(Formattable(_)),
    "PlacementTenancy" -> placementTenancy.map(Formattable(_)),
    "RamDiskId" -> ramDiskId.map(Formattable(_)),
    "SecurityGroups" -> securityGroups.map(Formattable(_)),
    "SpotPrice" -> spotPrice.map(Formattable(_)),
    "UserData" -> userData.map(Formattable(_))
  )
}
