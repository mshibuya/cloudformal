package com.github.mshibuya.cloudformal.aws.glue

import com.github.mshibuya.cloudformal.model._
import com.github.mshibuya.cloudformal.model.policy._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-partition.html
 */

trait Partition extends Resource with Resource.WithDeletionPolicy {
  val resourceTypeName = "AWS::Glue::Partition"

  def tableName: NonEmptyProperty[String]
  def databaseName: NonEmptyProperty[String]
  def catalogId: NonEmptyProperty[String]
  def partitionInput: NonEmptyProperty[PartitionInput]

  def resourceProperties: FormattableMap = Formattable.withProperties(
    "TableName" -> tableName,
    "DatabaseName" -> databaseName,
    "CatalogId" -> catalogId,
    "PartitionInput" -> partitionInput
  )
}
