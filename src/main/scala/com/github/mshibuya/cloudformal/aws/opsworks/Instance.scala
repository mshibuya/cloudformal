package com.github.mshibuya.cloudformal.aws.opsworks

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-instance.html
 */

trait Instance extends Resource {
  val resourceTypeName = "AWS::OpsWorks::Instance"

  def agentVersion: Option[String] = None
  def amiId: Option[String] = None
  def architecture: Option[String] = None
  def autoScalingType: Option[String] = None
  def availabilityZone: Option[String] = None
  def blockDeviceMappings: Option[Seq[BlockDeviceMapping]] = None
  def ebsOptimized: Option[Boolean] = None
  def elasticIps: Option[Seq[String]] = None
  def hostname: Option[String] = None
  def installUpdatesOnBoot: Option[Boolean] = None
  def instanceType: String
  def layerIds: Seq[String]
  def os: Option[String] = None
  def rootDeviceType: Option[String] = None
  def sshKeyName: Option[String] = None
  def stackId: String
  def subnetId: Option[String] = None
  def tenancy: Option[String] = None
  def timeBasedAutoScaling: Option[TimeBasedAutoScaling] = None
  def virtualizationType: Option[String] = None
  def volumes: Option[Seq[String]] = None

  def resourceProperties: FormattableMap = Formattable.opt(
    "AgentVersion" -> agentVersion.map(Formattable(_)),
    "AmiId" -> amiId.map(Formattable(_)),
    "Architecture" -> architecture.map(Formattable(_)),
    "AutoScalingType" -> autoScalingType.map(Formattable(_)),
    "AvailabilityZone" -> availabilityZone.map(Formattable(_)),
    "BlockDeviceMappings" -> blockDeviceMappings.map(Formattable(_)),
    "EbsOptimized" -> ebsOptimized.map(Formattable(_)),
    "ElasticIps" -> elasticIps.map(Formattable(_)),
    "Hostname" -> hostname.map(Formattable(_)),
    "InstallUpdatesOnBoot" -> installUpdatesOnBoot.map(Formattable(_)),
    "InstanceType" -> Some(Formattable(instanceType)),
    "LayerIds" -> Some(Formattable(layerIds)),
    "Os" -> os.map(Formattable(_)),
    "RootDeviceType" -> rootDeviceType.map(Formattable(_)),
    "SshKeyName" -> sshKeyName.map(Formattable(_)),
    "StackId" -> Some(Formattable(stackId)),
    "SubnetId" -> subnetId.map(Formattable(_)),
    "Tenancy" -> tenancy.map(Formattable(_)),
    "TimeBasedAutoScaling" -> timeBasedAutoScaling.map(Formattable(_)),
    "VirtualizationType" -> virtualizationType.map(Formattable(_)),
    "Volumes" -> volumes.map(Formattable(_))
  )
}
