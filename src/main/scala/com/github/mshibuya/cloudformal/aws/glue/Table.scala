package com.github.mshibuya.cloudformal.aws.glue

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-table.html
 */

trait Table extends Resource {
  val resourceTypeName = "AWS::Glue::Table"

  def tableInput: NonEmptyProperty[TableInput]
  def databaseName: NonEmptyProperty[String]
  def catalogId: NonEmptyProperty[String]

  def resourceProperties: FormattableMap = Formattable.withProperties(
    "TableInput" -> tableInput,
    "DatabaseName" -> databaseName,
    "CatalogId" -> catalogId
  )
}
