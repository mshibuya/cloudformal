package com.github.mshibuya.cloudformal.aws.dms

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationinstance.html
 */

trait ReplicationInstance extends Resource {
  val resourceTypeName = "AWS::DMS::ReplicationInstance"

  def replicationInstanceIdentifier: Option[String] = None
  def engineVersion: Option[String] = None
  def kmsKeyId: Option[String] = None
  def availabilityZone: Option[String] = None
  def preferredMaintenanceWindow: Option[String] = None
  def autoMinorVersionUpgrade: Option[Boolean] = None
  def replicationSubnetGroupIdentifier: Option[String] = None
  def allocatedStorage: Option[Int] = None
  def vpcSecurityGroupIds: Option[Seq[String]] = None
  def allowMajorVersionUpgrade: Option[Boolean] = None
  def replicationInstanceClass: String
  def publiclyAccessible: Option[Boolean] = None
  def multiAZ: Option[Boolean] = None
  def tags: Option[Seq[Tag]] = None

  def resourceProperties: FormattableMap = Formattable.opt(
    "ReplicationInstanceIdentifier" -> replicationInstanceIdentifier.map(Formattable(_)),
    "EngineVersion" -> engineVersion.map(Formattable(_)),
    "KmsKeyId" -> kmsKeyId.map(Formattable(_)),
    "AvailabilityZone" -> availabilityZone.map(Formattable(_)),
    "PreferredMaintenanceWindow" -> preferredMaintenanceWindow.map(Formattable(_)),
    "AutoMinorVersionUpgrade" -> autoMinorVersionUpgrade.map(Formattable(_)),
    "ReplicationSubnetGroupIdentifier" -> replicationSubnetGroupIdentifier.map(Formattable(_)),
    "AllocatedStorage" -> allocatedStorage.map(Formattable(_)),
    "VpcSecurityGroupIds" -> vpcSecurityGroupIds.map(Formattable(_)),
    "AllowMajorVersionUpgrade" -> allowMajorVersionUpgrade.map(Formattable(_)),
    "ReplicationInstanceClass" -> Some(Formattable(replicationInstanceClass)),
    "PubliclyAccessible" -> publiclyAccessible.map(Formattable(_)),
    "MultiAZ" -> multiAZ.map(Formattable(_)),
    "Tags" -> tags.map(Formattable(_))
  )
}
