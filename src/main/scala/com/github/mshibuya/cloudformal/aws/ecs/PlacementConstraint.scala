package com.github.mshibuya.cloudformal.aws.ecs

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-placementconstraint.html
 */

case class PlacementConstraint(
    expression: Option[String] = None,
    `type`: String) extends Renderable {
  def render: Formattable = Formattable.opt(
    "Expression" -> expression.map(Formattable(_)),
    "Type" -> Some(Formattable(`type`))
  )
}
