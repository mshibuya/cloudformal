package com.github.mshibuya.cloudformal.aws.dynamodb

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-lsi.html
 */

case class LocalSecondaryIndex(
    indexName: String,
    keySchema: Seq[KeySchema],
    projection: Projection) extends Renderable {
  def render: Formattable = Formattable.opt(
    "IndexName" -> Some(Formattable(indexName)),
    "KeySchema" -> Some(Formattable(keySchema)),
    "Projection" -> Some(Formattable(projection))
  )
}
