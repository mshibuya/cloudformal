package com.github.mshibuya.cloudformal.aws.glue

import com.github.mshibuya.cloudformal.model._
import com.github.mshibuya.cloudformal.model.policy._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-database.html
 */

trait Database extends Resource[Database] with Resource.WithDeletionPolicy {
  val resourceTypeName = "AWS::Glue::Database"

  def databaseInput: NonEmptyProperty[DatabaseInput]
  def catalogId: NonEmptyProperty[String]

  def render(): MapValue[_] = Value(
    "DatabaseInput" -> databaseInput,
    "CatalogId" -> catalogId
  )
}
