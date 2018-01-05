package com.github.mshibuya.cloudformal.aws.glue

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-database.html
 */

trait Database extends Resource {
  val resourceTypeName = "AWS::Glue::Database"

  def databaseInput: DatabaseInput
  def catalogId: String

  def resourceProperties: FormattableMap = Formattable.opt(
    "DatabaseInput" -> Some(Formattable(databaseInput)),
    "CatalogId" -> Some(Formattable(catalogId))
  )
}
