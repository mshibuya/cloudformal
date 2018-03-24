package com.github.mshibuya.cloudformal.aws.opsworks

import com.github.mshibuya.cloudformal.model._
import com.github.mshibuya.cloudformal.model.policy._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-instance.html
 */

trait Instance extends Resource[Instance] with Resource.WithDeletionPolicy {
  val resourceTypeName = "AWS::OpsWorks::Instance"

  object attributes {
    val availabilityZone: Expression[String] = Fn.GetAtt(logicalId, "AvailabilityZone")
    val privateDnsName: Expression[String] = Fn.GetAtt(logicalId, "PrivateDnsName")
    val privateIp: Expression[String] = Fn.GetAtt(logicalId, "PrivateIp")
    val publicDnsName: Expression[String] = Fn.GetAtt(logicalId, "PublicDnsName")
    val publicIp: Expression[String] = Fn.GetAtt(logicalId, "PublicIp")
  }

  def agentVersion: Property[String] = Empty
  def amiId: Property[String] = Empty
  def architecture: Property[String] = Empty
  def autoScalingType: Property[String] = Empty
  def availabilityZone: Property[String] = Empty
  def blockDeviceMappings: Property[Seq[BlockDeviceMapping]] = Empty
  def ebsOptimized: Property[Boolean] = Empty
  def elasticIps: Property[Seq[String]] = Empty
  def hostname: Property[String] = Empty
  def installUpdatesOnBoot: Property[Boolean] = Empty
  def instanceType: NonEmptyProperty[String]
  def layerIds: NonEmptyProperty[Seq[String]]
  def os: Property[String] = Empty
  def rootDeviceType: Property[String] = Empty
  def sshKeyName: Property[String] = Empty
  def stackId: NonEmptyProperty[String]
  def subnetId: Property[String] = Empty
  def tenancy: Property[String] = Empty
  def timeBasedAutoScaling: Property[TimeBasedAutoScaling] = Empty
  def virtualizationType: Property[String] = Empty
  def volumes: Property[Seq[String]] = Empty

  def render(): MapValue[_] = Value(
    "AgentVersion" -> agentVersion,
    "AmiId" -> amiId,
    "Architecture" -> architecture,
    "AutoScalingType" -> autoScalingType,
    "AvailabilityZone" -> availabilityZone,
    "BlockDeviceMappings" -> blockDeviceMappings,
    "EbsOptimized" -> ebsOptimized,
    "ElasticIps" -> elasticIps,
    "Hostname" -> hostname,
    "InstallUpdatesOnBoot" -> installUpdatesOnBoot,
    "InstanceType" -> instanceType,
    "LayerIds" -> layerIds,
    "Os" -> os,
    "RootDeviceType" -> rootDeviceType,
    "SshKeyName" -> sshKeyName,
    "StackId" -> stackId,
    "SubnetId" -> subnetId,
    "Tenancy" -> tenancy,
    "TimeBasedAutoScaling" -> timeBasedAutoScaling,
    "VirtualizationType" -> virtualizationType,
    "Volumes" -> volumes
  )
}
