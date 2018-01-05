package com.github.mshibuya.cloudformal.aws.glue

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-crawler-schemachangepolicy.html
 */

case class SchemaChangePolicy(
    updateBehavior: Option[String] = None,
    deleteBehavior: Option[String] = None) extends Renderable {
  def render: Formattable = Formattable.opt(
    "UpdateBehavior" -> updateBehavior.map(Formattable(_)),
    "DeleteBehavior" -> deleteBehavior.map(Formattable(_))
  )
}
