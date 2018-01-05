package com.github.mshibuya.cloudformal.aws.dynamodb

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-gsi.html
 */

case class GlobalSecondaryIndex(
    indexName: String,
    keySchema: Seq[KeySchema],
    projection: Projection,
    provisionedThroughput: ProvisionedThroughput) extends Renderable {
  def render: Formattable = Formattable.opt(
    "IndexName" -> Some(Formattable(indexName)),
    "KeySchema" -> Some(Formattable(keySchema)),
    "Projection" -> Some(Formattable(projection)),
    "ProvisionedThroughput" -> Some(Formattable(provisionedThroughput))
  )
}
