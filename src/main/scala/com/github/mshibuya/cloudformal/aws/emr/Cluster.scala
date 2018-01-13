package com.github.mshibuya.cloudformal.aws.emr

import argonaut.Json
import com.github.mshibuya.cloudformal.model._
import com.github.mshibuya.cloudformal.model.policy._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticmapreduce-cluster.html
 */

trait Cluster extends Resource with Resource.WithDeletionPolicy {
  val resourceTypeName = "AWS::EMR::Cluster"

  def masterPublicDNSAttribute: Expression[String] = Fn.GetAtt(logicalId, "MasterPublicDNS")

  def additionalInfo: Property[Json] = Empty
  def applications: Property[Seq[Application]] = Empty
  def autoScalingRole: Property[String] = Empty
  def bootstrapActions: Property[Seq[BootstrapActionConfig]] = Empty
  def configurations: Property[Seq[Configuration]] = Empty
  def customAmiId: Property[String] = Empty
  def ebsRootVolumeSize: Property[Int] = Empty
  def instances: NonEmptyProperty[JobFlowInstancesConfig]
  def jobFlowRole: NonEmptyProperty[String]
  def logUri: Property[String] = Empty
  def name: NonEmptyProperty[String]
  def releaseLabel: Property[String] = Empty
  def scaleDownBehavior: Property[String] = Empty
  def securityConfiguration: Property[String] = Empty
  def serviceRole: NonEmptyProperty[String]
  def tags: Property[Seq[Tag]] = Empty
  def visibleToAllUsers: Property[Boolean] = Empty

  def resourceProperties: FormattableMap = Formattable.withProperties(
    "AdditionalInfo" -> additionalInfo,
    "Applications" -> applications,
    "AutoScalingRole" -> autoScalingRole,
    "BootstrapActions" -> bootstrapActions,
    "Configurations" -> configurations,
    "CustomAmiId" -> customAmiId,
    "EbsRootVolumeSize" -> ebsRootVolumeSize,
    "Instances" -> instances,
    "JobFlowRole" -> jobFlowRole,
    "LogUri" -> logUri,
    "Name" -> name,
    "ReleaseLabel" -> releaseLabel,
    "ScaleDownBehavior" -> scaleDownBehavior,
    "SecurityConfiguration" -> securityConfiguration,
    "ServiceRole" -> serviceRole,
    "Tags" -> tags,
    "VisibleToAllUsers" -> visibleToAllUsers
  )
}
