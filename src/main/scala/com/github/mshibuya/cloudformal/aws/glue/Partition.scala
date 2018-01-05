package com.github.mshibuya.cloudformal.aws.glue

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-partition.html
 */

trait Partition extends Resource {
  val resourceTypeName = "AWS::Glue::Partition"

  def tableName: String
  def databaseName: String
  def catalogId: String
  def partitionInput: PartitionInput

  def resourceProperties: FormattableMap = Formattable.opt(
    "TableName" -> Some(Formattable(tableName)),
    "DatabaseName" -> Some(Formattable(databaseName)),
    "CatalogId" -> Some(Formattable(catalogId)),
    "PartitionInput" -> Some(Formattable(partitionInput))
  )
}
