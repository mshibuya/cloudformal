package com.github.mshibuya.cloudformal.aws.opsworks

import argonaut.Json
import com.github.mshibuya.cloudformal.model._
import com.github.mshibuya.cloudformal.model.policy._

import scala.collection.immutable.ListMap

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html
 */

trait Layer extends Resource with Resource.WithDeletionPolicy {
  val resourceTypeName = "AWS::OpsWorks::Layer"

  def attributes: Property[ListMap[String, String]] = Empty
  def autoAssignElasticIps: NonEmptyProperty[Boolean]
  def autoAssignPublicIps: NonEmptyProperty[Boolean]
  def customInstanceProfileArn: Property[String] = Empty
  def customJson: Property[Json] = Empty
  def customRecipes: Property[Recipes] = Empty
  def customSecurityGroupIds: Property[Seq[String]] = Empty
  def enableAutoHealing: NonEmptyProperty[Boolean]
  def installUpdatesOnBoot: Property[Boolean] = Empty
  def lifecycleEventConfiguration: Property[LifecycleEventConfiguration] = Empty
  def loadBasedAutoScaling: Property[LoadBasedAutoScaling] = Empty
  def name: NonEmptyProperty[String]
  def packages: Property[Seq[String]] = Empty
  def shortname: NonEmptyProperty[String]
  def stackId: NonEmptyProperty[String]
  def tags: Property[Seq[Tag]] = Empty
  def `type`: NonEmptyProperty[String]
  def useEbsOptimizedInstances: Property[Boolean] = Empty
  def volumeConfigurations: Property[Seq[VolumeConfiguration]] = Empty

  def resourceProperties: FormattableMap = Formattable.withProperties(
    "Attributes" -> attributes,
    "AutoAssignElasticIps" -> autoAssignElasticIps,
    "AutoAssignPublicIps" -> autoAssignPublicIps,
    "CustomInstanceProfileArn" -> customInstanceProfileArn,
    "CustomJson" -> customJson,
    "CustomRecipes" -> customRecipes,
    "CustomSecurityGroupIds" -> customSecurityGroupIds,
    "EnableAutoHealing" -> enableAutoHealing,
    "InstallUpdatesOnBoot" -> installUpdatesOnBoot,
    "LifecycleEventConfiguration" -> lifecycleEventConfiguration,
    "LoadBasedAutoScaling" -> loadBasedAutoScaling,
    "Name" -> name,
    "Packages" -> packages,
    "Shortname" -> shortname,
    "StackId" -> stackId,
    "Tags" -> tags,
    "Type" -> `type`,
    "UseEbsOptimizedInstances" -> useEbsOptimizedInstances,
    "VolumeConfigurations" -> volumeConfigurations
  )
}
