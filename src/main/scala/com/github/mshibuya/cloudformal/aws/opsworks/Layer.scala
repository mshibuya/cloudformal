package com.github.mshibuya.cloudformal.aws.opsworks

import argonaut.Json
import com.github.mshibuya.cloudformal.model._

import scala.collection.immutable.ListMap

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html
 */

trait Layer extends Resource {
  val resourceTypeName = "AWS::OpsWorks::Layer"

  def attributes: Option[ListMap[String, String]] = None
  def autoAssignElasticIps: Boolean
  def autoAssignPublicIps: Boolean
  def customInstanceProfileArn: Option[String] = None
  def customJson: Option[Json] = None
  def customRecipes: Option[Recipes] = None
  def customSecurityGroupIds: Option[Seq[String]] = None
  def enableAutoHealing: Boolean
  def installUpdatesOnBoot: Option[Boolean] = None
  def lifecycleEventConfiguration: Option[LifecycleEventConfiguration] = None
  def loadBasedAutoScaling: Option[LoadBasedAutoScaling] = None
  def name: String
  def packages: Option[Seq[String]] = None
  def shortname: String
  def stackId: String
  def tags: Option[Seq[Tag]] = None
  def `type`: String
  def useEbsOptimizedInstances: Option[Boolean] = None
  def volumeConfigurations: Option[Seq[VolumeConfiguration]] = None

  def resourceProperties: FormattableMap = Formattable.opt(
    "Attributes" -> attributes.map(Formattable(_)),
    "AutoAssignElasticIps" -> Some(Formattable(autoAssignElasticIps)),
    "AutoAssignPublicIps" -> Some(Formattable(autoAssignPublicIps)),
    "CustomInstanceProfileArn" -> customInstanceProfileArn.map(Formattable(_)),
    "CustomJson" -> customJson.map(Formattable(_)),
    "CustomRecipes" -> customRecipes.map(Formattable(_)),
    "CustomSecurityGroupIds" -> customSecurityGroupIds.map(Formattable(_)),
    "EnableAutoHealing" -> Some(Formattable(enableAutoHealing)),
    "InstallUpdatesOnBoot" -> installUpdatesOnBoot.map(Formattable(_)),
    "LifecycleEventConfiguration" -> lifecycleEventConfiguration.map(Formattable(_)),
    "LoadBasedAutoScaling" -> loadBasedAutoScaling.map(Formattable(_)),
    "Name" -> Some(Formattable(name)),
    "Packages" -> packages.map(Formattable(_)),
    "Shortname" -> Some(Formattable(shortname)),
    "StackId" -> Some(Formattable(stackId)),
    "Tags" -> tags.map(Formattable(_)),
    "Type" -> Some(Formattable(`type`)),
    "UseEbsOptimizedInstances" -> useEbsOptimizedInstances.map(Formattable(_)),
    "VolumeConfigurations" -> volumeConfigurations.map(Formattable(_))
  )
}
