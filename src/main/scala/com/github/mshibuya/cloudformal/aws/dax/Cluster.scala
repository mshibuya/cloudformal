package com.github.mshibuya.cloudformal.aws.dax

import argonaut.Json
import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dax-cluster.html
 */

trait Cluster extends Resource {
  val resourceTypeName = "AWS::DAX::Cluster"

  def clusterDiscoveryEndpointAttribute: Expression[String] = Fn.GetAtt(logicalId, "ClusterDiscoveryEndpoint")
  def arnAttribute: Expression[String] = Fn.GetAtt(logicalId, "Arn")

  def description: Property[String] = Empty
  def replicationFactor: NonEmptyProperty[Int]
  def parameterGroupName: Property[String] = Empty
  def availabilityZones: Property[Seq[String]] = Empty
  def nodeType: NonEmptyProperty[String]
  def iAMRoleARN: NonEmptyProperty[String]
  def subnetGroupName: Property[String] = Empty
  def clusterName: Property[String] = Empty
  def preferredMaintenanceWindow: Property[String] = Empty
  def notificationTopicARN: Property[String] = Empty
  def securityGroupIds: Property[Seq[String]] = Empty
  def tags: Property[Json] = Empty

  def resourceProperties: FormattableMap = Formattable.withProperties(
    "Description" -> description,
    "ReplicationFactor" -> replicationFactor,
    "ParameterGroupName" -> parameterGroupName,
    "AvailabilityZones" -> availabilityZones,
    "NodeType" -> nodeType,
    "IAMRoleARN" -> iAMRoleARN,
    "SubnetGroupName" -> subnetGroupName,
    "ClusterName" -> clusterName,
    "PreferredMaintenanceWindow" -> preferredMaintenanceWindow,
    "NotificationTopicARN" -> notificationTopicARN,
    "SecurityGroupIds" -> securityGroupIds,
    "Tags" -> tags
  )
}
