package com.github.mshibuya.cloudformal.aws.dax

import argonaut.Json
import com.github.mshibuya.cloudformal.model._
import com.github.mshibuya.cloudformal.model.policy._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dax-cluster.html
 */

trait Cluster extends Resource[Cluster] with Resource.WithDeletionPolicy {
  val resourceTypeName = "AWS::DAX::Cluster"

  object attributes {
    val clusterDiscoveryEndpoint: Expression[String] = Fn.GetAtt(logicalId, "ClusterDiscoveryEndpoint")
    val arn: Expression[String] = Fn.GetAtt(logicalId, "Arn")
  }

  def description: Property[String] = Empty
  def replicationFactor: NonEmptyProperty[Int]
  def parameterGroupName: Property[String] = Empty
  def availabilityZones: Property[Seq[String]] = Empty
  def nodeType: NonEmptyProperty[String]
  def iamRoleARN: NonEmptyProperty[String]
  def subnetGroupName: Property[String] = Empty
  def clusterName: Property[String] = Empty
  def preferredMaintenanceWindow: Property[String] = Empty
  def notificationTopicARN: Property[String] = Empty
  def securityGroupIds: Property[Seq[String]] = Empty
  def tags: Property[Json] = Empty

  def render(): MapValue[_] = Value(
    "Description" -> description,
    "ReplicationFactor" -> replicationFactor,
    "ParameterGroupName" -> parameterGroupName,
    "AvailabilityZones" -> availabilityZones,
    "NodeType" -> nodeType,
    "IAMRoleARN" -> iamRoleARN,
    "SubnetGroupName" -> subnetGroupName,
    "ClusterName" -> clusterName,
    "PreferredMaintenanceWindow" -> preferredMaintenanceWindow,
    "NotificationTopicARN" -> notificationTopicARN,
    "SecurityGroupIds" -> securityGroupIds,
    "Tags" -> tags
  )
}
