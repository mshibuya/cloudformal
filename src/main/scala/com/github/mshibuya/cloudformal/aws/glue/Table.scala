package com.github.mshibuya.cloudformal.aws.glue

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-table.html
 */

trait Table extends Resource {
  val resourceTypeName = "AWS::Glue::Table"

  def tableInput: TableInput
  def databaseName: String
  def catalogId: String

  def resourceProperties: FormattableMap = Formattable.opt(
    "TableInput" -> Some(Formattable(tableInput)),
    "DatabaseName" -> Some(Formattable(databaseName)),
    "CatalogId" -> Some(Formattable(catalogId))
  )
}
