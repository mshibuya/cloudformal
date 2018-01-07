package com.github.mshibuya.cloudformal.aws.dms

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationinstance.html
 */

trait ReplicationInstance extends Resource {
  val resourceTypeName = "AWS::DMS::ReplicationInstance"

  def replicationInstancePublicIpAddressesAttribute: Expression[Seq[String]] = Fn.GetAtt(logicalId, "ReplicationInstancePublicIpAddresses")
  def replicationInstancePrivateIpAddressesAttribute: Expression[Seq[String]] = Fn.GetAtt(logicalId, "ReplicationInstancePrivateIpAddresses")

  def replicationInstanceIdentifier: Property[String] = Empty
  def engineVersion: Property[String] = Empty
  def kmsKeyId: Property[String] = Empty
  def availabilityZone: Property[String] = Empty
  def preferredMaintenanceWindow: Property[String] = Empty
  def autoMinorVersionUpgrade: Property[Boolean] = Empty
  def replicationSubnetGroupIdentifier: Property[String] = Empty
  def allocatedStorage: Property[Int] = Empty
  def vpcSecurityGroupIds: Property[Seq[String]] = Empty
  def allowMajorVersionUpgrade: Property[Boolean] = Empty
  def replicationInstanceClass: NonEmptyProperty[String]
  def publiclyAccessible: Property[Boolean] = Empty
  def multiAZ: Property[Boolean] = Empty
  def tags: Property[Seq[Tag]] = Empty

  def resourceProperties: FormattableMap = Formattable.withProperties(
    "ReplicationInstanceIdentifier" -> replicationInstanceIdentifier,
    "EngineVersion" -> engineVersion,
    "KmsKeyId" -> kmsKeyId,
    "AvailabilityZone" -> availabilityZone,
    "PreferredMaintenanceWindow" -> preferredMaintenanceWindow,
    "AutoMinorVersionUpgrade" -> autoMinorVersionUpgrade,
    "ReplicationSubnetGroupIdentifier" -> replicationSubnetGroupIdentifier,
    "AllocatedStorage" -> allocatedStorage,
    "VpcSecurityGroupIds" -> vpcSecurityGroupIds,
    "AllowMajorVersionUpgrade" -> allowMajorVersionUpgrade,
    "ReplicationInstanceClass" -> replicationInstanceClass,
    "PubliclyAccessible" -> publiclyAccessible,
    "MultiAZ" -> multiAZ,
    "Tags" -> tags
  )
}
