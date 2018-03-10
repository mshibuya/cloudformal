package com.github.mshibuya.cloudformal.aws.redshift

import com.github.mshibuya.cloudformal.model._
import com.github.mshibuya.cloudformal.model.policy._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html
 */

trait Cluster extends Resource with Resource.WithSnapshotableDeletionPolicy {
  val resourceTypeName = "AWS::Redshift::Cluster"

  object attributes {
    val endpointAddress: Expression[String] = Fn.GetAtt(logicalId, "Endpoint.Address")
    val endpointPort: Expression[String] = Fn.GetAtt(logicalId, "Endpoint.Port")
  }

  def allowVersionUpgrade: Property[Boolean] = Empty
  def automatedSnapshotRetentionPeriod: Property[Int] = Empty
  def availabilityZone: Property[String] = Empty
  def clusterIdentifier: Property[String] = Empty
  def clusterParameterGroupName: Property[String] = Empty
  def clusterSecurityGroups: Property[Seq[String]] = Empty
  def clusterSubnetGroupName: Property[String] = Empty
  def clusterType: NonEmptyProperty[String]
  def clusterVersion: Property[String] = Empty
  def dbName: NonEmptyProperty[String]
  def elasticIp: Property[String] = Empty
  def encrypted: Property[Boolean] = Empty
  def hsmClientCertificateIdentifier: Property[String] = Empty
  def hsmConfigurationIdentifier: Property[String] = Empty
  def iamRoles: Property[Seq[String]] = Empty
  def kmsKeyId: Property[String] = Empty
  def loggingProperties: Property[LoggingProperties] = Empty
  def masterUserPassword: NonEmptyProperty[String]
  def masterUsername: NonEmptyProperty[String]
  def nodeType: NonEmptyProperty[String]
  def numberOfNodes: Property[Int] = Empty
  def ownerAccount: Property[String] = Empty
  def port: Property[Int] = Empty
  def preferredMaintenanceWindow: Property[String] = Empty
  def publiclyAccessible: Property[Boolean] = Empty
  def snapshotClusterIdentifier: Property[String] = Empty
  def snapshotIdentifier: Property[String] = Empty
  def tags: Property[Seq[Tag]] = Empty
  def vpcSecurityGroupIds: Property[Seq[String]] = Empty

  def resourceProperties: FormattableMap = Formattable.withProperties(
    "AllowVersionUpgrade" -> allowVersionUpgrade,
    "AutomatedSnapshotRetentionPeriod" -> automatedSnapshotRetentionPeriod,
    "AvailabilityZone" -> availabilityZone,
    "ClusterIdentifier" -> clusterIdentifier,
    "ClusterParameterGroupName" -> clusterParameterGroupName,
    "ClusterSecurityGroups" -> clusterSecurityGroups,
    "ClusterSubnetGroupName" -> clusterSubnetGroupName,
    "ClusterType" -> clusterType,
    "ClusterVersion" -> clusterVersion,
    "DBName" -> dbName,
    "ElasticIp" -> elasticIp,
    "Encrypted" -> encrypted,
    "HsmClientCertificateIdentifier" -> hsmClientCertificateIdentifier,
    "HsmConfigurationIdentifier" -> hsmConfigurationIdentifier,
    "IamRoles" -> iamRoles,
    "KmsKeyId" -> kmsKeyId,
    "LoggingProperties" -> loggingProperties,
    "MasterUserPassword" -> masterUserPassword,
    "MasterUsername" -> masterUsername,
    "NodeType" -> nodeType,
    "NumberOfNodes" -> numberOfNodes,
    "OwnerAccount" -> ownerAccount,
    "Port" -> port,
    "PreferredMaintenanceWindow" -> preferredMaintenanceWindow,
    "PubliclyAccessible" -> publiclyAccessible,
    "SnapshotClusterIdentifier" -> snapshotClusterIdentifier,
    "SnapshotIdentifier" -> snapshotIdentifier,
    "Tags" -> tags,
    "VpcSecurityGroupIds" -> vpcSecurityGroupIds
  )
}
