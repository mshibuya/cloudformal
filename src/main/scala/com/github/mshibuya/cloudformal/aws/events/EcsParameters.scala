package com.github.mshibuya.cloudformal.aws.events

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-ecsparameters.html
 */

case class EcsParameters(
    taskCount: Option[Int] = None,
    taskDefinitionArn: String) extends Renderable {
  def render: Formattable = Formattable.opt(
    "TaskCount" -> taskCount.map(Formattable(_)),
    "TaskDefinitionArn" -> Some(Formattable(taskDefinitionArn))
  )
}
