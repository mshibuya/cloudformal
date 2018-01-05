package com.github.mshibuya.cloudformal.aws.rds

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html
 */

trait DBCluster extends Resource {
  val resourceTypeName = "AWS::RDS::DBCluster"

  def availabilityZones: Option[Seq[String]] = None
  def backupRetentionPeriod: Option[Int] = None
  def dBClusterParameterGroupName: Option[String] = None
  def dBSubnetGroupName: Option[String] = None
  def databaseName: Option[String] = None
  def engine: String
  def engineVersion: Option[String] = None
  def kmsKeyId: Option[String] = None
  def masterUserPassword: Option[String] = None
  def masterUsername: Option[String] = None
  def port: Option[Int] = None
  def preferredBackupWindow: Option[String] = None
  def preferredMaintenanceWindow: Option[String] = None
  def replicationSourceIdentifier: Option[String] = None
  def snapshotIdentifier: Option[String] = None
  def storageEncrypted: Option[Boolean] = None
  def tags: Option[Seq[Tag]] = None
  def vpcSecurityGroupIds: Option[Seq[String]] = None

  def resourceProperties: FormattableMap = Formattable.opt(
    "AvailabilityZones" -> availabilityZones.map(Formattable(_)),
    "BackupRetentionPeriod" -> backupRetentionPeriod.map(Formattable(_)),
    "DBClusterParameterGroupName" -> dBClusterParameterGroupName.map(Formattable(_)),
    "DBSubnetGroupName" -> dBSubnetGroupName.map(Formattable(_)),
    "DatabaseName" -> databaseName.map(Formattable(_)),
    "Engine" -> Some(Formattable(engine)),
    "EngineVersion" -> engineVersion.map(Formattable(_)),
    "KmsKeyId" -> kmsKeyId.map(Formattable(_)),
    "MasterUserPassword" -> masterUserPassword.map(Formattable(_)),
    "MasterUsername" -> masterUsername.map(Formattable(_)),
    "Port" -> port.map(Formattable(_)),
    "PreferredBackupWindow" -> preferredBackupWindow.map(Formattable(_)),
    "PreferredMaintenanceWindow" -> preferredMaintenanceWindow.map(Formattable(_)),
    "ReplicationSourceIdentifier" -> replicationSourceIdentifier.map(Formattable(_)),
    "SnapshotIdentifier" -> snapshotIdentifier.map(Formattable(_)),
    "StorageEncrypted" -> storageEncrypted.map(Formattable(_)),
    "Tags" -> tags.map(Formattable(_)),
    "VpcSecurityGroupIds" -> vpcSecurityGroupIds.map(Formattable(_))
  )
}
