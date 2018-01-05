package com.github.mshibuya.cloudformal.aws.elasticache

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-cache-cluster.html
 */

trait CacheCluster extends Resource {
  val resourceTypeName = "AWS::ElastiCache::CacheCluster"

  def aZMode: Option[String] = None
  def autoMinorVersionUpgrade: Option[Boolean] = None
  def cacheNodeType: String
  def cacheParameterGroupName: Option[String] = None
  def cacheSecurityGroupNames: Option[Seq[String]] = None
  def cacheSubnetGroupName: Option[String] = None
  def clusterName: Option[String] = None
  def engine: String
  def engineVersion: Option[String] = None
  def notificationTopicArn: Option[String] = None
  def numCacheNodes: Int
  def port: Option[Int] = None
  def preferredAvailabilityZone: Option[String] = None
  def preferredAvailabilityZones: Option[Seq[String]] = None
  def preferredMaintenanceWindow: Option[String] = None
  def snapshotArns: Option[Seq[String]] = None
  def snapshotName: Option[String] = None
  def snapshotRetentionLimit: Option[Int] = None
  def snapshotWindow: Option[String] = None
  def tags: Option[Seq[Tag]] = None
  def vpcSecurityGroupIds: Option[Seq[String]] = None

  def resourceProperties: FormattableMap = Formattable.opt(
    "AZMode" -> aZMode.map(Formattable(_)),
    "AutoMinorVersionUpgrade" -> autoMinorVersionUpgrade.map(Formattable(_)),
    "CacheNodeType" -> Some(Formattable(cacheNodeType)),
    "CacheParameterGroupName" -> cacheParameterGroupName.map(Formattable(_)),
    "CacheSecurityGroupNames" -> cacheSecurityGroupNames.map(Formattable(_)),
    "CacheSubnetGroupName" -> cacheSubnetGroupName.map(Formattable(_)),
    "ClusterName" -> clusterName.map(Formattable(_)),
    "Engine" -> Some(Formattable(engine)),
    "EngineVersion" -> engineVersion.map(Formattable(_)),
    "NotificationTopicArn" -> notificationTopicArn.map(Formattable(_)),
    "NumCacheNodes" -> Some(Formattable(numCacheNodes)),
    "Port" -> port.map(Formattable(_)),
    "PreferredAvailabilityZone" -> preferredAvailabilityZone.map(Formattable(_)),
    "PreferredAvailabilityZones" -> preferredAvailabilityZones.map(Formattable(_)),
    "PreferredMaintenanceWindow" -> preferredMaintenanceWindow.map(Formattable(_)),
    "SnapshotArns" -> snapshotArns.map(Formattable(_)),
    "SnapshotName" -> snapshotName.map(Formattable(_)),
    "SnapshotRetentionLimit" -> snapshotRetentionLimit.map(Formattable(_)),
    "SnapshotWindow" -> snapshotWindow.map(Formattable(_)),
    "Tags" -> tags.map(Formattable(_)),
    "VpcSecurityGroupIds" -> vpcSecurityGroupIds.map(Formattable(_))
  )
}
