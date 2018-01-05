package com.github.mshibuya.cloudformal.aws.dms

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationtask.html
 */

trait ReplicationTask extends Resource {
  val resourceTypeName = "AWS::DMS::ReplicationTask"

  def replicationTaskSettings: Option[String] = None
  def tableMappings: String
  def replicationTaskIdentifier: Option[String] = None
  def sourceEndpointArn: String
  def migrationType: String
  def targetEndpointArn: String
  def replicationInstanceArn: String
  def tags: Option[Seq[Tag]] = None
  def cdcStartTime: Option[Double] = None

  def resourceProperties: FormattableMap = Formattable.opt(
    "ReplicationTaskSettings" -> replicationTaskSettings.map(Formattable(_)),
    "TableMappings" -> Some(Formattable(tableMappings)),
    "ReplicationTaskIdentifier" -> replicationTaskIdentifier.map(Formattable(_)),
    "SourceEndpointArn" -> Some(Formattable(sourceEndpointArn)),
    "MigrationType" -> Some(Formattable(migrationType)),
    "TargetEndpointArn" -> Some(Formattable(targetEndpointArn)),
    "ReplicationInstanceArn" -> Some(Formattable(replicationInstanceArn)),
    "Tags" -> tags.map(Formattable(_)),
    "CdcStartTime" -> cdcStartTime.map(Formattable(_))
  )
}
