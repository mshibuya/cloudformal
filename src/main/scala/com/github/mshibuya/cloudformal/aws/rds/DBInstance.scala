package com.github.mshibuya.cloudformal.aws.rds

import com.github.mshibuya.cloudformal.model._
import com.github.mshibuya.cloudformal.model.policy._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html
 */

trait DBInstance extends Resource with Resource.WithSnapshotableDeletionPolicy {
  val resourceTypeName = "AWS::RDS::DBInstance"

  object attributes {
    val endpointAddress: Expression[String] = Fn.GetAtt(logicalId, "Endpoint.Address")
    val endpointPort: Expression[String] = Fn.GetAtt(logicalId, "Endpoint.Port")
  }

  def allocatedStorage: Property[String] = Empty
  def allowMajorVersionUpgrade: Property[Boolean] = Empty
  def autoMinorVersionUpgrade: Property[Boolean] = Empty
  def availabilityZone: Property[String] = Empty
  def backupRetentionPeriod: Property[String] = Empty
  def characterSetName: Property[String] = Empty
  def copyTagsToSnapshot: Property[Boolean] = Empty
  def dBClusterIdentifier: Property[String] = Empty
  def dBInstanceClass: NonEmptyProperty[String]
  def dBInstanceIdentifier: Property[String] = Empty
  def dBName: Property[String] = Empty
  def dBParameterGroupName: Property[String] = Empty
  def dBSecurityGroups: Property[Seq[String]] = Empty
  def dBSnapshotIdentifier: Property[String] = Empty
  def dBSubnetGroupName: Property[String] = Empty
  def domain: Property[String] = Empty
  def domainIAMRoleName: Property[String] = Empty
  def engine: Property[String] = Empty
  def engineVersion: Property[String] = Empty
  def iops: Property[Int] = Empty
  def kmsKeyId: Property[String] = Empty
  def licenseModel: Property[String] = Empty
  def masterUserPassword: Property[String] = Empty
  def masterUsername: Property[String] = Empty
  def monitoringInterval: Property[Int] = Empty
  def monitoringRoleArn: Property[String] = Empty
  def multiAZ: Property[Boolean] = Empty
  def optionGroupName: Property[String] = Empty
  def port: Property[String] = Empty
  def preferredBackupWindow: Property[String] = Empty
  def preferredMaintenanceWindow: Property[String] = Empty
  def publiclyAccessible: Property[Boolean] = Empty
  def sourceDBInstanceIdentifier: Property[String] = Empty
  def sourceRegion: Property[String] = Empty
  def storageEncrypted: Property[Boolean] = Empty
  def storageType: Property[String] = Empty
  def tags: Property[Seq[Tag]] = Empty
  def timezone: Property[String] = Empty
  def vPCSecurityGroups: Property[Seq[String]] = Empty

  def resourceProperties: FormattableMap = Formattable.withProperties(
    "AllocatedStorage" -> allocatedStorage,
    "AllowMajorVersionUpgrade" -> allowMajorVersionUpgrade,
    "AutoMinorVersionUpgrade" -> autoMinorVersionUpgrade,
    "AvailabilityZone" -> availabilityZone,
    "BackupRetentionPeriod" -> backupRetentionPeriod,
    "CharacterSetName" -> characterSetName,
    "CopyTagsToSnapshot" -> copyTagsToSnapshot,
    "DBClusterIdentifier" -> dBClusterIdentifier,
    "DBInstanceClass" -> dBInstanceClass,
    "DBInstanceIdentifier" -> dBInstanceIdentifier,
    "DBName" -> dBName,
    "DBParameterGroupName" -> dBParameterGroupName,
    "DBSecurityGroups" -> dBSecurityGroups,
    "DBSnapshotIdentifier" -> dBSnapshotIdentifier,
    "DBSubnetGroupName" -> dBSubnetGroupName,
    "Domain" -> domain,
    "DomainIAMRoleName" -> domainIAMRoleName,
    "Engine" -> engine,
    "EngineVersion" -> engineVersion,
    "Iops" -> iops,
    "KmsKeyId" -> kmsKeyId,
    "LicenseModel" -> licenseModel,
    "MasterUserPassword" -> masterUserPassword,
    "MasterUsername" -> masterUsername,
    "MonitoringInterval" -> monitoringInterval,
    "MonitoringRoleArn" -> monitoringRoleArn,
    "MultiAZ" -> multiAZ,
    "OptionGroupName" -> optionGroupName,
    "Port" -> port,
    "PreferredBackupWindow" -> preferredBackupWindow,
    "PreferredMaintenanceWindow" -> preferredMaintenanceWindow,
    "PubliclyAccessible" -> publiclyAccessible,
    "SourceDBInstanceIdentifier" -> sourceDBInstanceIdentifier,
    "SourceRegion" -> sourceRegion,
    "StorageEncrypted" -> storageEncrypted,
    "StorageType" -> storageType,
    "Tags" -> tags,
    "Timezone" -> timezone,
    "VPCSecurityGroups" -> vPCSecurityGroups
  )
}
