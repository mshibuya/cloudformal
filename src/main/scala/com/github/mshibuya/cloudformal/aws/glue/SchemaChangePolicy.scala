package com.github.mshibuya.cloudformal.aws.glue

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-crawler-schemachangepolicy.html
 */

case class SchemaChangePolicy(
    updateBehavior: Property[String] = Empty,
    deleteBehavior: Property[String] = Empty) extends Expression[SchemaChangePolicy] {
  def render: Formattable = Value(
    "UpdateBehavior" -> updateBehavior,
    "DeleteBehavior" -> deleteBehavior
  )
}
