package com.github.mshibuya.cloudformal.aws.glue

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-crawler-schemachangepolicy.html
 */

case class SchemaChangePolicy(
    updateBehavior: Property[String] = Empty,
    deleteBehavior: Property[String] = Empty) extends Renderable {
  def render: Formattable = Formattable.withProperties(
    "UpdateBehavior" -> updateBehavior,
    "DeleteBehavior" -> deleteBehavior
  )
}
