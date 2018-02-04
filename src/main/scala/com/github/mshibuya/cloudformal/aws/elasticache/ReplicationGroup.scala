package com.github.mshibuya.cloudformal.aws.elasticache

import com.github.mshibuya.cloudformal.model._
import com.github.mshibuya.cloudformal.model.policy._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html
 */

trait ReplicationGroup extends Resource with Resource.WithSnapshotableDeletionPolicy {
  val resourceTypeName = "AWS::ElastiCache::ReplicationGroup"

  object attributes {
    val configurationEndPointAddress: Expression[String] = Fn.GetAtt(logicalId, "ConfigurationEndPoint.Address")
    val configurationEndPointPort: Expression[String] = Fn.GetAtt(logicalId, "ConfigurationEndPoint.Port")
    val primaryEndPointAddress: Expression[String] = Fn.GetAtt(logicalId, "PrimaryEndPoint.Address")
    val primaryEndPointPort: Expression[String] = Fn.GetAtt(logicalId, "PrimaryEndPoint.Port")
    val readEndPointAddresses: Expression[String] = Fn.GetAtt(logicalId, "ReadEndPoint.Addresses")
    val readEndPointAddressesList: Expression[Seq[String]] = Fn.GetAtt(logicalId, "ReadEndPoint.Addresses.List")
    val readEndPointPorts: Expression[String] = Fn.GetAtt(logicalId, "ReadEndPoint.Ports")
    val readEndPointPortsList: Expression[Seq[String]] = Fn.GetAtt(logicalId, "ReadEndPoint.Ports.List")
  }

  def atRestEncryptionEnabled: Property[Boolean] = Empty
  def authToken: Property[String] = Empty
  def autoMinorVersionUpgrade: Property[Boolean] = Empty
  def automaticFailoverEnabled: Property[Boolean] = Empty
  def cacheNodeType: Property[String] = Empty
  def cacheParameterGroupName: Property[String] = Empty
  def cacheSecurityGroupNames: Property[Seq[String]] = Empty
  def cacheSubnetGroupName: Property[String] = Empty
  def engine: Property[String] = Empty
  def engineVersion: Property[String] = Empty
  def nodeGroupConfiguration: Property[Seq[NodeGroupConfiguration]] = Empty
  def notificationTopicArn: Property[String] = Empty
  def numCacheClusters: Property[Int] = Empty
  def numNodeGroups: Property[Int] = Empty
  def port: Property[Int] = Empty
  def preferredCacheClusterAZs: Property[Seq[String]] = Empty
  def preferredMaintenanceWindow: Property[String] = Empty
  def primaryClusterId: Property[String] = Empty
  def replicasPerNodeGroup: Property[Int] = Empty
  def replicationGroupDescription: NonEmptyProperty[String]
  def replicationGroupId: Property[String] = Empty
  def securityGroupIds: Property[Seq[String]] = Empty
  def snapshotArns: Property[Seq[String]] = Empty
  def snapshotName: Property[String] = Empty
  def snapshotRetentionLimit: Property[Int] = Empty
  def snapshotWindow: Property[String] = Empty
  def snapshottingClusterId: Property[String] = Empty
  def tags: Property[Seq[Tag]] = Empty
  def transitEncryptionEnabled: Property[Boolean] = Empty

  def resourceProperties: FormattableMap = Formattable.withProperties(
    "AtRestEncryptionEnabled" -> atRestEncryptionEnabled,
    "AuthToken" -> authToken,
    "AutoMinorVersionUpgrade" -> autoMinorVersionUpgrade,
    "AutomaticFailoverEnabled" -> automaticFailoverEnabled,
    "CacheNodeType" -> cacheNodeType,
    "CacheParameterGroupName" -> cacheParameterGroupName,
    "CacheSecurityGroupNames" -> cacheSecurityGroupNames,
    "CacheSubnetGroupName" -> cacheSubnetGroupName,
    "Engine" -> engine,
    "EngineVersion" -> engineVersion,
    "NodeGroupConfiguration" -> nodeGroupConfiguration,
    "NotificationTopicArn" -> notificationTopicArn,
    "NumCacheClusters" -> numCacheClusters,
    "NumNodeGroups" -> numNodeGroups,
    "Port" -> port,
    "PreferredCacheClusterAZs" -> preferredCacheClusterAZs,
    "PreferredMaintenanceWindow" -> preferredMaintenanceWindow,
    "PrimaryClusterId" -> primaryClusterId,
    "ReplicasPerNodeGroup" -> replicasPerNodeGroup,
    "ReplicationGroupDescription" -> replicationGroupDescription,
    "ReplicationGroupId" -> replicationGroupId,
    "SecurityGroupIds" -> securityGroupIds,
    "SnapshotArns" -> snapshotArns,
    "SnapshotName" -> snapshotName,
    "SnapshotRetentionLimit" -> snapshotRetentionLimit,
    "SnapshotWindow" -> snapshotWindow,
    "SnapshottingClusterId" -> snapshottingClusterId,
    "Tags" -> tags,
    "TransitEncryptionEnabled" -> transitEncryptionEnabled
  )
}
