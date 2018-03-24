package com.github.mshibuya.cloudformal.aws.dynamodb

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-lsi.html
 */

case class LocalSecondaryIndex(
    indexName: NonEmptyProperty[String],
    keySchema: NonEmptyProperty[Seq[KeySchema]],
    projection: NonEmptyProperty[Projection]) extends Expression[LocalSecondaryIndex] {
  def render: Formattable = Value(
    "IndexName" -> indexName,
    "KeySchema" -> keySchema,
    "Projection" -> projection
  )
}
