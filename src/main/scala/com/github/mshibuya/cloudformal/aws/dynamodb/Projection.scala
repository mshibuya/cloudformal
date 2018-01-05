package com.github.mshibuya.cloudformal.aws.dynamodb

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-projectionobject.html
 */

case class Projection(
    nonKeyAttributes: Option[Seq[String]] = None,
    projectionType: Option[String] = None) extends Renderable {
  def render: Formattable = Formattable.opt(
    "NonKeyAttributes" -> nonKeyAttributes.map(Formattable(_)),
    "ProjectionType" -> projectionType.map(Formattable(_))
  )
}
