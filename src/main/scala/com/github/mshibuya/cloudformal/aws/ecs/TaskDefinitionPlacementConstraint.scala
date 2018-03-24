package com.github.mshibuya.cloudformal.aws.ecs

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-taskdefinitionplacementconstraint.html
 */

case class TaskDefinitionPlacementConstraint(
    expression: Property[String] = Empty,
    `type`: NonEmptyProperty[String]) extends Expression[TaskDefinitionPlacementConstraint] {
  def render: Formattable = Value(
    "Expression" -> expression,
    "Type" -> `type`
  )
}
