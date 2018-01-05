package com.github.mshibuya.cloudformal.aws.glue

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-trigger-condition.html
 */

case class Condition(
    state: Option[String] = None,
    logicalOperator: Option[String] = None,
    jobName: Option[String] = None) extends Renderable {
  def render: Formattable = Formattable.opt(
    "State" -> state.map(Formattable(_)),
    "LogicalOperator" -> logicalOperator.map(Formattable(_)),
    "JobName" -> jobName.map(Formattable(_))
  )
}
