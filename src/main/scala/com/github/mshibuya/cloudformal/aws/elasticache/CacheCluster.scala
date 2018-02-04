package com.github.mshibuya.cloudformal.aws.elasticache

import com.github.mshibuya.cloudformal.model._
import com.github.mshibuya.cloudformal.model.policy._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-cache-cluster.html
 */

trait CacheCluster extends Resource with Resource.WithSnapshotableDeletionPolicy {
  val resourceTypeName = "AWS::ElastiCache::CacheCluster"

  object attributes {
    val configurationEndpointAddress: Expression[String] = Fn.GetAtt(logicalId, "ConfigurationEndpoint.Address")
    val configurationEndpointPort: Expression[String] = Fn.GetAtt(logicalId, "ConfigurationEndpoint.Port")
    val redisEndpointAddress: Expression[String] = Fn.GetAtt(logicalId, "RedisEndpoint.Address")
    val redisEndpointPort: Expression[String] = Fn.GetAtt(logicalId, "RedisEndpoint.Port")
  }

  def aZMode: Property[String] = Empty
  def autoMinorVersionUpgrade: Property[Boolean] = Empty
  def cacheNodeType: NonEmptyProperty[String]
  def cacheParameterGroupName: Property[String] = Empty
  def cacheSecurityGroupNames: Property[Seq[String]] = Empty
  def cacheSubnetGroupName: Property[String] = Empty
  def clusterName: Property[String] = Empty
  def engine: NonEmptyProperty[String]
  def engineVersion: Property[String] = Empty
  def notificationTopicArn: Property[String] = Empty
  def numCacheNodes: NonEmptyProperty[Int]
  def port: Property[Int] = Empty
  def preferredAvailabilityZone: Property[String] = Empty
  def preferredAvailabilityZones: Property[Seq[String]] = Empty
  def preferredMaintenanceWindow: Property[String] = Empty
  def snapshotArns: Property[Seq[String]] = Empty
  def snapshotName: Property[String] = Empty
  def snapshotRetentionLimit: Property[Int] = Empty
  def snapshotWindow: Property[String] = Empty
  def tags: Property[Seq[Tag]] = Empty
  def vpcSecurityGroupIds: Property[Seq[String]] = Empty

  def resourceProperties: FormattableMap = Formattable.withProperties(
    "AZMode" -> aZMode,
    "AutoMinorVersionUpgrade" -> autoMinorVersionUpgrade,
    "CacheNodeType" -> cacheNodeType,
    "CacheParameterGroupName" -> cacheParameterGroupName,
    "CacheSecurityGroupNames" -> cacheSecurityGroupNames,
    "CacheSubnetGroupName" -> cacheSubnetGroupName,
    "ClusterName" -> clusterName,
    "Engine" -> engine,
    "EngineVersion" -> engineVersion,
    "NotificationTopicArn" -> notificationTopicArn,
    "NumCacheNodes" -> numCacheNodes,
    "Port" -> port,
    "PreferredAvailabilityZone" -> preferredAvailabilityZone,
    "PreferredAvailabilityZones" -> preferredAvailabilityZones,
    "PreferredMaintenanceWindow" -> preferredMaintenanceWindow,
    "SnapshotArns" -> snapshotArns,
    "SnapshotName" -> snapshotName,
    "SnapshotRetentionLimit" -> snapshotRetentionLimit,
    "SnapshotWindow" -> snapshotWindow,
    "Tags" -> tags,
    "VpcSecurityGroupIds" -> vpcSecurityGroupIds
  )
}
