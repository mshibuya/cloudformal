package com.github.mshibuya.cloudformal.aws.glue

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-trigger-condition.html
 */

case class Condition(
    state: Property[String] = Empty,
    logicalOperator: Property[String] = Empty,
    jobName: Property[String] = Empty) extends Renderable {
  def render: Formattable = Formattable.withProperties(
    "State" -> state,
    "LogicalOperator" -> logicalOperator,
    "JobName" -> jobName
  )
}
