package com.github.mshibuya.cloudformal.aws.dynamodb

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-projectionobject.html
 */

case class Projection(
    nonKeyAttributes: Property[Seq[String]] = Empty,
    projectionType: Property[String] = Empty) extends Renderable {
  def render: Formattable = Formattable.withProperties(
    "NonKeyAttributes" -> nonKeyAttributes,
    "ProjectionType" -> projectionType
  )
}
