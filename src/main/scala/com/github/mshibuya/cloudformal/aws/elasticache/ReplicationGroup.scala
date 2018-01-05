package com.github.mshibuya.cloudformal.aws.elasticache

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html
 */

trait ReplicationGroup extends Resource {
  val resourceTypeName = "AWS::ElastiCache::ReplicationGroup"

  def atRestEncryptionEnabled: Option[Boolean] = None
  def authToken: Option[String] = None
  def autoMinorVersionUpgrade: Option[Boolean] = None
  def automaticFailoverEnabled: Option[Boolean] = None
  def cacheNodeType: Option[String] = None
  def cacheParameterGroupName: Option[String] = None
  def cacheSecurityGroupNames: Option[Seq[String]] = None
  def cacheSubnetGroupName: Option[String] = None
  def engine: Option[String] = None
  def engineVersion: Option[String] = None
  def nodeGroupConfiguration: Option[Seq[NodeGroupConfiguration]] = None
  def notificationTopicArn: Option[String] = None
  def numCacheClusters: Option[Int] = None
  def numNodeGroups: Option[Int] = None
  def port: Option[Int] = None
  def preferredCacheClusterAZs: Option[Seq[String]] = None
  def preferredMaintenanceWindow: Option[String] = None
  def primaryClusterId: Option[String] = None
  def replicasPerNodeGroup: Option[Int] = None
  def replicationGroupDescription: String
  def replicationGroupId: Option[String] = None
  def securityGroupIds: Option[Seq[String]] = None
  def snapshotArns: Option[Seq[String]] = None
  def snapshotName: Option[String] = None
  def snapshotRetentionLimit: Option[Int] = None
  def snapshotWindow: Option[String] = None
  def snapshottingClusterId: Option[String] = None
  def tags: Option[Seq[Tag]] = None
  def transitEncryptionEnabled: Option[Boolean] = None

  def resourceProperties: FormattableMap = Formattable.opt(
    "AtRestEncryptionEnabled" -> atRestEncryptionEnabled.map(Formattable(_)),
    "AuthToken" -> authToken.map(Formattable(_)),
    "AutoMinorVersionUpgrade" -> autoMinorVersionUpgrade.map(Formattable(_)),
    "AutomaticFailoverEnabled" -> automaticFailoverEnabled.map(Formattable(_)),
    "CacheNodeType" -> cacheNodeType.map(Formattable(_)),
    "CacheParameterGroupName" -> cacheParameterGroupName.map(Formattable(_)),
    "CacheSecurityGroupNames" -> cacheSecurityGroupNames.map(Formattable(_)),
    "CacheSubnetGroupName" -> cacheSubnetGroupName.map(Formattable(_)),
    "Engine" -> engine.map(Formattable(_)),
    "EngineVersion" -> engineVersion.map(Formattable(_)),
    "NodeGroupConfiguration" -> nodeGroupConfiguration.map(Formattable(_)),
    "NotificationTopicArn" -> notificationTopicArn.map(Formattable(_)),
    "NumCacheClusters" -> numCacheClusters.map(Formattable(_)),
    "NumNodeGroups" -> numNodeGroups.map(Formattable(_)),
    "Port" -> port.map(Formattable(_)),
    "PreferredCacheClusterAZs" -> preferredCacheClusterAZs.map(Formattable(_)),
    "PreferredMaintenanceWindow" -> preferredMaintenanceWindow.map(Formattable(_)),
    "PrimaryClusterId" -> primaryClusterId.map(Formattable(_)),
    "ReplicasPerNodeGroup" -> replicasPerNodeGroup.map(Formattable(_)),
    "ReplicationGroupDescription" -> Some(Formattable(replicationGroupDescription)),
    "ReplicationGroupId" -> replicationGroupId.map(Formattable(_)),
    "SecurityGroupIds" -> securityGroupIds.map(Formattable(_)),
    "SnapshotArns" -> snapshotArns.map(Formattable(_)),
    "SnapshotName" -> snapshotName.map(Formattable(_)),
    "SnapshotRetentionLimit" -> snapshotRetentionLimit.map(Formattable(_)),
    "SnapshotWindow" -> snapshotWindow.map(Formattable(_)),
    "SnapshottingClusterId" -> snapshottingClusterId.map(Formattable(_)),
    "Tags" -> tags.map(Formattable(_)),
    "TransitEncryptionEnabled" -> transitEncryptionEnabled.map(Formattable(_))
  )
}
