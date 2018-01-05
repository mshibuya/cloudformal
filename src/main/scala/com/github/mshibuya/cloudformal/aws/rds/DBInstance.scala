package com.github.mshibuya.cloudformal.aws.rds

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html
 */

trait DBInstance extends Resource {
  val resourceTypeName = "AWS::RDS::DBInstance"

  def allocatedStorage: Option[String] = None
  def allowMajorVersionUpgrade: Option[Boolean] = None
  def autoMinorVersionUpgrade: Option[Boolean] = None
  def availabilityZone: Option[String] = None
  def backupRetentionPeriod: Option[String] = None
  def characterSetName: Option[String] = None
  def copyTagsToSnapshot: Option[Boolean] = None
  def dBClusterIdentifier: Option[String] = None
  def dBInstanceClass: String
  def dBInstanceIdentifier: Option[String] = None
  def dBName: Option[String] = None
  def dBParameterGroupName: Option[String] = None
  def dBSecurityGroups: Option[Seq[String]] = None
  def dBSnapshotIdentifier: Option[String] = None
  def dBSubnetGroupName: Option[String] = None
  def domain: Option[String] = None
  def domainIAMRoleName: Option[String] = None
  def engine: Option[String] = None
  def engineVersion: Option[String] = None
  def iops: Option[Int] = None
  def kmsKeyId: Option[String] = None
  def licenseModel: Option[String] = None
  def masterUserPassword: Option[String] = None
  def masterUsername: Option[String] = None
  def monitoringInterval: Option[Int] = None
  def monitoringRoleArn: Option[String] = None
  def multiAZ: Option[Boolean] = None
  def optionGroupName: Option[String] = None
  def port: Option[String] = None
  def preferredBackupWindow: Option[String] = None
  def preferredMaintenanceWindow: Option[String] = None
  def publiclyAccessible: Option[Boolean] = None
  def sourceDBInstanceIdentifier: Option[String] = None
  def sourceRegion: Option[String] = None
  def storageEncrypted: Option[Boolean] = None
  def storageType: Option[String] = None
  def tags: Option[Seq[Tag]] = None
  def timezone: Option[String] = None
  def vPCSecurityGroups: Option[Seq[String]] = None

  def resourceProperties: FormattableMap = Formattable.opt(
    "AllocatedStorage" -> allocatedStorage.map(Formattable(_)),
    "AllowMajorVersionUpgrade" -> allowMajorVersionUpgrade.map(Formattable(_)),
    "AutoMinorVersionUpgrade" -> autoMinorVersionUpgrade.map(Formattable(_)),
    "AvailabilityZone" -> availabilityZone.map(Formattable(_)),
    "BackupRetentionPeriod" -> backupRetentionPeriod.map(Formattable(_)),
    "CharacterSetName" -> characterSetName.map(Formattable(_)),
    "CopyTagsToSnapshot" -> copyTagsToSnapshot.map(Formattable(_)),
    "DBClusterIdentifier" -> dBClusterIdentifier.map(Formattable(_)),
    "DBInstanceClass" -> Some(Formattable(dBInstanceClass)),
    "DBInstanceIdentifier" -> dBInstanceIdentifier.map(Formattable(_)),
    "DBName" -> dBName.map(Formattable(_)),
    "DBParameterGroupName" -> dBParameterGroupName.map(Formattable(_)),
    "DBSecurityGroups" -> dBSecurityGroups.map(Formattable(_)),
    "DBSnapshotIdentifier" -> dBSnapshotIdentifier.map(Formattable(_)),
    "DBSubnetGroupName" -> dBSubnetGroupName.map(Formattable(_)),
    "Domain" -> domain.map(Formattable(_)),
    "DomainIAMRoleName" -> domainIAMRoleName.map(Formattable(_)),
    "Engine" -> engine.map(Formattable(_)),
    "EngineVersion" -> engineVersion.map(Formattable(_)),
    "Iops" -> iops.map(Formattable(_)),
    "KmsKeyId" -> kmsKeyId.map(Formattable(_)),
    "LicenseModel" -> licenseModel.map(Formattable(_)),
    "MasterUserPassword" -> masterUserPassword.map(Formattable(_)),
    "MasterUsername" -> masterUsername.map(Formattable(_)),
    "MonitoringInterval" -> monitoringInterval.map(Formattable(_)),
    "MonitoringRoleArn" -> monitoringRoleArn.map(Formattable(_)),
    "MultiAZ" -> multiAZ.map(Formattable(_)),
    "OptionGroupName" -> optionGroupName.map(Formattable(_)),
    "Port" -> port.map(Formattable(_)),
    "PreferredBackupWindow" -> preferredBackupWindow.map(Formattable(_)),
    "PreferredMaintenanceWindow" -> preferredMaintenanceWindow.map(Formattable(_)),
    "PubliclyAccessible" -> publiclyAccessible.map(Formattable(_)),
    "SourceDBInstanceIdentifier" -> sourceDBInstanceIdentifier.map(Formattable(_)),
    "SourceRegion" -> sourceRegion.map(Formattable(_)),
    "StorageEncrypted" -> storageEncrypted.map(Formattable(_)),
    "StorageType" -> storageType.map(Formattable(_)),
    "Tags" -> tags.map(Formattable(_)),
    "Timezone" -> timezone.map(Formattable(_)),
    "VPCSecurityGroups" -> vPCSecurityGroups.map(Formattable(_))
  )
}
