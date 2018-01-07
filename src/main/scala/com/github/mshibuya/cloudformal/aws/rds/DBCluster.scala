package com.github.mshibuya.cloudformal.aws.rds

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html
 */

trait DBCluster extends Resource {
  val resourceTypeName = "AWS::RDS::DBCluster"

  def endpointAddressAttribute: Expression[String] = Fn.GetAtt(logicalId, "Endpoint.Address")
  def endpointPortAttribute: Expression[String] = Fn.GetAtt(logicalId, "Endpoint.Port")
  def readEndpointAddressAttribute: Expression[String] = Fn.GetAtt(logicalId, "ReadEndpoint.Address")

  def availabilityZones: Property[Seq[String]] = Empty
  def backupRetentionPeriod: Property[Int] = Empty
  def dBClusterParameterGroupName: Property[String] = Empty
  def dBSubnetGroupName: Property[String] = Empty
  def databaseName: Property[String] = Empty
  def engine: NonEmptyProperty[String]
  def engineVersion: Property[String] = Empty
  def kmsKeyId: Property[String] = Empty
  def masterUserPassword: Property[String] = Empty
  def masterUsername: Property[String] = Empty
  def port: Property[Int] = Empty
  def preferredBackupWindow: Property[String] = Empty
  def preferredMaintenanceWindow: Property[String] = Empty
  def replicationSourceIdentifier: Property[String] = Empty
  def snapshotIdentifier: Property[String] = Empty
  def storageEncrypted: Property[Boolean] = Empty
  def tags: Property[Seq[Tag]] = Empty
  def vpcSecurityGroupIds: Property[Seq[String]] = Empty

  def resourceProperties: FormattableMap = Formattable.withProperties(
    "AvailabilityZones" -> availabilityZones,
    "BackupRetentionPeriod" -> backupRetentionPeriod,
    "DBClusterParameterGroupName" -> dBClusterParameterGroupName,
    "DBSubnetGroupName" -> dBSubnetGroupName,
    "DatabaseName" -> databaseName,
    "Engine" -> engine,
    "EngineVersion" -> engineVersion,
    "KmsKeyId" -> kmsKeyId,
    "MasterUserPassword" -> masterUserPassword,
    "MasterUsername" -> masterUsername,
    "Port" -> port,
    "PreferredBackupWindow" -> preferredBackupWindow,
    "PreferredMaintenanceWindow" -> preferredMaintenanceWindow,
    "ReplicationSourceIdentifier" -> replicationSourceIdentifier,
    "SnapshotIdentifier" -> snapshotIdentifier,
    "StorageEncrypted" -> storageEncrypted,
    "Tags" -> tags,
    "VpcSecurityGroupIds" -> vpcSecurityGroupIds
  )
}
