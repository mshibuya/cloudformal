package com.github.mshibuya.cloudformal.aws.dms

import com.github.mshibuya.cloudformal.model._
import com.github.mshibuya.cloudformal.model.policy._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationtask.html
 */

trait ReplicationTask extends Resource with Resource.WithDeletionPolicy {
  val resourceTypeName = "AWS::DMS::ReplicationTask"

  def replicationTaskSettings: Property[String] = Empty
  def tableMappings: NonEmptyProperty[String]
  def replicationTaskIdentifier: Property[String] = Empty
  def sourceEndpointArn: NonEmptyProperty[String]
  def migrationType: NonEmptyProperty[String]
  def targetEndpointArn: NonEmptyProperty[String]
  def replicationInstanceArn: NonEmptyProperty[String]
  def tags: Property[Seq[Tag]] = Empty
  def cdcStartTime: Property[Double] = Empty

  def resourceProperties: FormattableMap = Formattable.withProperties(
    "ReplicationTaskSettings" -> replicationTaskSettings,
    "TableMappings" -> tableMappings,
    "ReplicationTaskIdentifier" -> replicationTaskIdentifier,
    "SourceEndpointArn" -> sourceEndpointArn,
    "MigrationType" -> migrationType,
    "TargetEndpointArn" -> targetEndpointArn,
    "ReplicationInstanceArn" -> replicationInstanceArn,
    "Tags" -> tags,
    "CdcStartTime" -> cdcStartTime
  )
}
