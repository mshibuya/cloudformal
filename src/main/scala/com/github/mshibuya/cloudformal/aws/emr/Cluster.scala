package com.github.mshibuya.cloudformal.aws.emr

import argonaut.Json
import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticmapreduce-cluster.html
 */

trait Cluster extends Resource {
  val resourceTypeName = "AWS::EMR::Cluster"

  def additionalInfo: Option[Json] = None
  def applications: Option[Seq[Application]] = None
  def autoScalingRole: Option[String] = None
  def bootstrapActions: Option[Seq[BootstrapActionConfig]] = None
  def configurations: Option[Seq[Configuration]] = None
  def customAmiId: Option[String] = None
  def ebsRootVolumeSize: Option[Int] = None
  def instances: JobFlowInstancesConfig
  def jobFlowRole: String
  def logUri: Option[String] = None
  def name: String
  def releaseLabel: Option[String] = None
  def scaleDownBehavior: Option[String] = None
  def securityConfiguration: Option[String] = None
  def serviceRole: String
  def tags: Option[Seq[Tag]] = None
  def visibleToAllUsers: Option[Boolean] = None

  def resourceProperties: FormattableMap = Formattable.opt(
    "AdditionalInfo" -> additionalInfo.map(Formattable(_)),
    "Applications" -> applications.map(Formattable(_)),
    "AutoScalingRole" -> autoScalingRole.map(Formattable(_)),
    "BootstrapActions" -> bootstrapActions.map(Formattable(_)),
    "Configurations" -> configurations.map(Formattable(_)),
    "CustomAmiId" -> customAmiId.map(Formattable(_)),
    "EbsRootVolumeSize" -> ebsRootVolumeSize.map(Formattable(_)),
    "Instances" -> Some(Formattable(instances)),
    "JobFlowRole" -> Some(Formattable(jobFlowRole)),
    "LogUri" -> logUri.map(Formattable(_)),
    "Name" -> Some(Formattable(name)),
    "ReleaseLabel" -> releaseLabel.map(Formattable(_)),
    "ScaleDownBehavior" -> scaleDownBehavior.map(Formattable(_)),
    "SecurityConfiguration" -> securityConfiguration.map(Formattable(_)),
    "ServiceRole" -> Some(Formattable(serviceRole)),
    "Tags" -> tags.map(Formattable(_)),
    "VisibleToAllUsers" -> visibleToAllUsers.map(Formattable(_))
  )
}
