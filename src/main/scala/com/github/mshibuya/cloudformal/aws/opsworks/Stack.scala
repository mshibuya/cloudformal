package com.github.mshibuya.cloudformal.aws.opsworks

import argonaut.Json
import com.github.mshibuya.cloudformal.model._

import scala.collection.immutable.ListMap

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html
 */

trait Stack extends Resource {
  val resourceTypeName = "AWS::OpsWorks::Stack"

  def agentVersion: Option[String] = None
  def attributes: Option[ListMap[String, String]] = None
  def chefConfiguration: Option[ChefConfiguration] = None
  def cloneAppIds: Option[Seq[String]] = None
  def clonePermissions: Option[Boolean] = None
  def configurationManager: Option[StackConfigurationManager] = None
  def customCookbooksSource: Option[Source] = None
  def customJson: Option[Json] = None
  def defaultAvailabilityZone: Option[String] = None
  def defaultInstanceProfileArn: String
  def defaultOs: Option[String] = None
  def defaultRootDeviceType: Option[String] = None
  def defaultSshKeyName: Option[String] = None
  def defaultSubnetId: Option[String] = None
  def ecsClusterArn: Option[String] = None
  def elasticIps: Option[Seq[ElasticIp]] = None
  def hostnameTheme: Option[String] = None
  def name: String
  def rdsDbInstances: Option[Seq[RdsDbInstance]] = None
  def serviceRoleArn: String
  def sourceStackId: Option[String] = None
  def tags: Option[Seq[Tag]] = None
  def useCustomCookbooks: Option[Boolean] = None
  def useOpsworksSecurityGroups: Option[Boolean] = None
  def vpcId: Option[String] = None

  def resourceProperties: FormattableMap = Formattable.opt(
    "AgentVersion" -> agentVersion.map(Formattable(_)),
    "Attributes" -> attributes.map(Formattable(_)),
    "ChefConfiguration" -> chefConfiguration.map(Formattable(_)),
    "CloneAppIds" -> cloneAppIds.map(Formattable(_)),
    "ClonePermissions" -> clonePermissions.map(Formattable(_)),
    "ConfigurationManager" -> configurationManager.map(Formattable(_)),
    "CustomCookbooksSource" -> customCookbooksSource.map(Formattable(_)),
    "CustomJson" -> customJson.map(Formattable(_)),
    "DefaultAvailabilityZone" -> defaultAvailabilityZone.map(Formattable(_)),
    "DefaultInstanceProfileArn" -> Some(Formattable(defaultInstanceProfileArn)),
    "DefaultOs" -> defaultOs.map(Formattable(_)),
    "DefaultRootDeviceType" -> defaultRootDeviceType.map(Formattable(_)),
    "DefaultSshKeyName" -> defaultSshKeyName.map(Formattable(_)),
    "DefaultSubnetId" -> defaultSubnetId.map(Formattable(_)),
    "EcsClusterArn" -> ecsClusterArn.map(Formattable(_)),
    "ElasticIps" -> elasticIps.map(Formattable(_)),
    "HostnameTheme" -> hostnameTheme.map(Formattable(_)),
    "Name" -> Some(Formattable(name)),
    "RdsDbInstances" -> rdsDbInstances.map(Formattable(_)),
    "ServiceRoleArn" -> Some(Formattable(serviceRoleArn)),
    "SourceStackId" -> sourceStackId.map(Formattable(_)),
    "Tags" -> tags.map(Formattable(_)),
    "UseCustomCookbooks" -> useCustomCookbooks.map(Formattable(_)),
    "UseOpsworksSecurityGroups" -> useOpsworksSecurityGroups.map(Formattable(_)),
    "VpcId" -> vpcId.map(Formattable(_))
  )
}
