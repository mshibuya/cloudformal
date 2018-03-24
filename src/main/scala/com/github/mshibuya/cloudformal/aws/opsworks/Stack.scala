package com.github.mshibuya.cloudformal.aws.opsworks

import argonaut.Json
import com.github.mshibuya.cloudformal.model._
import com.github.mshibuya.cloudformal.model.policy._

import scala.collection.immutable.ListMap

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html
 */

trait Stack extends Resource[Stack] with Resource.WithDeletionPolicy {
  val resourceTypeName = "AWS::OpsWorks::Stack"

  def agentVersion: Property[String] = Empty
  def attributes: Property[ListMap[String, String]] = Empty
  def chefConfiguration: Property[ChefConfiguration] = Empty
  def cloneAppIds: Property[Seq[String]] = Empty
  def clonePermissions: Property[Boolean] = Empty
  def configurationManager: Property[StackConfigurationManager] = Empty
  def customCookbooksSource: Property[Source] = Empty
  def customJson: Property[Json] = Empty
  def defaultAvailabilityZone: Property[String] = Empty
  def defaultInstanceProfileArn: NonEmptyProperty[String]
  def defaultOs: Property[String] = Empty
  def defaultRootDeviceType: Property[String] = Empty
  def defaultSshKeyName: Property[String] = Empty
  def defaultSubnetId: Property[String] = Empty
  def ecsClusterArn: Property[String] = Empty
  def elasticIps: Property[Seq[ElasticIp]] = Empty
  def hostnameTheme: Property[String] = Empty
  def name: NonEmptyProperty[String]
  def rdsDbInstances: Property[Seq[RdsDbInstance]] = Empty
  def serviceRoleArn: NonEmptyProperty[String]
  def sourceStackId: Property[String] = Empty
  def tags: Property[Seq[Tag]] = Empty
  def useCustomCookbooks: Property[Boolean] = Empty
  def useOpsworksSecurityGroups: Property[Boolean] = Empty
  def vpcId: Property[String] = Empty

  def render(): MapValue[_] = Value(
    "AgentVersion" -> agentVersion,
    "Attributes" -> attributes,
    "ChefConfiguration" -> chefConfiguration,
    "CloneAppIds" -> cloneAppIds,
    "ClonePermissions" -> clonePermissions,
    "ConfigurationManager" -> configurationManager,
    "CustomCookbooksSource" -> customCookbooksSource,
    "CustomJson" -> customJson,
    "DefaultAvailabilityZone" -> defaultAvailabilityZone,
    "DefaultInstanceProfileArn" -> defaultInstanceProfileArn,
    "DefaultOs" -> defaultOs,
    "DefaultRootDeviceType" -> defaultRootDeviceType,
    "DefaultSshKeyName" -> defaultSshKeyName,
    "DefaultSubnetId" -> defaultSubnetId,
    "EcsClusterArn" -> ecsClusterArn,
    "ElasticIps" -> elasticIps,
    "HostnameTheme" -> hostnameTheme,
    "Name" -> name,
    "RdsDbInstances" -> rdsDbInstances,
    "ServiceRoleArn" -> serviceRoleArn,
    "SourceStackId" -> sourceStackId,
    "Tags" -> tags,
    "UseCustomCookbooks" -> useCustomCookbooks,
    "UseOpsworksSecurityGroups" -> useOpsworksSecurityGroups,
    "VpcId" -> vpcId
  )
}
