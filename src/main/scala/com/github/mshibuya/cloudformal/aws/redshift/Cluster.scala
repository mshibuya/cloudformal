package com.github.mshibuya.cloudformal.aws.redshift

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html
 */

trait Cluster extends Resource {
  val resourceTypeName = "AWS::Redshift::Cluster"

  def allowVersionUpgrade: Option[Boolean] = None
  def automatedSnapshotRetentionPeriod: Option[Int] = None
  def availabilityZone: Option[String] = None
  def clusterParameterGroupName: Option[String] = None
  def clusterSecurityGroups: Option[Seq[String]] = None
  def clusterSubnetGroupName: Option[String] = None
  def clusterType: String
  def clusterVersion: Option[String] = None
  def dBName: String
  def elasticIp: Option[String] = None
  def encrypted: Option[Boolean] = None
  def hsmClientCertificateIdentifier: Option[String] = None
  def hsmConfigurationIdentifier: Option[String] = None
  def iamRoles: Option[Seq[String]] = None
  def kmsKeyId: Option[String] = None
  def loggingProperties: Option[LoggingProperties] = None
  def masterUserPassword: String
  def masterUsername: String
  def nodeType: String
  def numberOfNodes: Option[Int] = None
  def ownerAccount: Option[String] = None
  def port: Option[Int] = None
  def preferredMaintenanceWindow: Option[String] = None
  def publiclyAccessible: Option[Boolean] = None
  def snapshotClusterIdentifier: Option[String] = None
  def snapshotIdentifier: Option[String] = None
  def tags: Option[Seq[Tag]] = None
  def vpcSecurityGroupIds: Option[Seq[String]] = None

  def resourceProperties: FormattableMap = Formattable.opt(
    "AllowVersionUpgrade" -> allowVersionUpgrade.map(Formattable(_)),
    "AutomatedSnapshotRetentionPeriod" -> automatedSnapshotRetentionPeriod.map(Formattable(_)),
    "AvailabilityZone" -> availabilityZone.map(Formattable(_)),
    "ClusterParameterGroupName" -> clusterParameterGroupName.map(Formattable(_)),
    "ClusterSecurityGroups" -> clusterSecurityGroups.map(Formattable(_)),
    "ClusterSubnetGroupName" -> clusterSubnetGroupName.map(Formattable(_)),
    "ClusterType" -> Some(Formattable(clusterType)),
    "ClusterVersion" -> clusterVersion.map(Formattable(_)),
    "DBName" -> Some(Formattable(dBName)),
    "ElasticIp" -> elasticIp.map(Formattable(_)),
    "Encrypted" -> encrypted.map(Formattable(_)),
    "HsmClientCertificateIdentifier" -> hsmClientCertificateIdentifier.map(Formattable(_)),
    "HsmConfigurationIdentifier" -> hsmConfigurationIdentifier.map(Formattable(_)),
    "IamRoles" -> iamRoles.map(Formattable(_)),
    "KmsKeyId" -> kmsKeyId.map(Formattable(_)),
    "LoggingProperties" -> loggingProperties.map(Formattable(_)),
    "MasterUserPassword" -> Some(Formattable(masterUserPassword)),
    "MasterUsername" -> Some(Formattable(masterUsername)),
    "NodeType" -> Some(Formattable(nodeType)),
    "NumberOfNodes" -> numberOfNodes.map(Formattable(_)),
    "OwnerAccount" -> ownerAccount.map(Formattable(_)),
    "Port" -> port.map(Formattable(_)),
    "PreferredMaintenanceWindow" -> preferredMaintenanceWindow.map(Formattable(_)),
    "PubliclyAccessible" -> publiclyAccessible.map(Formattable(_)),
    "SnapshotClusterIdentifier" -> snapshotClusterIdentifier.map(Formattable(_)),
    "SnapshotIdentifier" -> snapshotIdentifier.map(Formattable(_)),
    "Tags" -> tags.map(Formattable(_)),
    "VpcSecurityGroupIds" -> vpcSecurityGroupIds.map(Formattable(_))
  )
}
