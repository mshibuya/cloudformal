package com.github.mshibuya.cloudformal.aws.dax

import argonaut.Json
import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dax-cluster.html
 */

trait Cluster extends Resource {
  val resourceTypeName = "AWS::DAX::Cluster"

  def description: Option[String] = None
  def replicationFactor: Int
  def parameterGroupName: Option[String] = None
  def availabilityZones: Option[Seq[String]] = None
  def nodeType: String
  def iAMRoleARN: String
  def subnetGroupName: Option[String] = None
  def clusterName: Option[String] = None
  def preferredMaintenanceWindow: Option[String] = None
  def notificationTopicARN: Option[String] = None
  def securityGroupIds: Option[Seq[String]] = None
  def tags: Option[Json] = None

  def resourceProperties: FormattableMap = Formattable.opt(
    "Description" -> description.map(Formattable(_)),
    "ReplicationFactor" -> Some(Formattable(replicationFactor)),
    "ParameterGroupName" -> parameterGroupName.map(Formattable(_)),
    "AvailabilityZones" -> availabilityZones.map(Formattable(_)),
    "NodeType" -> Some(Formattable(nodeType)),
    "IAMRoleARN" -> Some(Formattable(iAMRoleARN)),
    "SubnetGroupName" -> subnetGroupName.map(Formattable(_)),
    "ClusterName" -> clusterName.map(Formattable(_)),
    "PreferredMaintenanceWindow" -> preferredMaintenanceWindow.map(Formattable(_)),
    "NotificationTopicARN" -> notificationTopicARN.map(Formattable(_)),
    "SecurityGroupIds" -> securityGroupIds.map(Formattable(_)),
    "Tags" -> tags.map(Formattable(_))
  )
}
