package com.github.mshibuya.cloudformal.aws.events

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-ecsparameters.html
 */

case class EcsParameters(
    taskCount: Property[Int] = Empty,
    taskDefinitionArn: NonEmptyProperty[String]) extends Expression[EcsParameters] {
  def render: Formattable = Value(
    "TaskCount" -> taskCount,
    "TaskDefinitionArn" -> taskDefinitionArn
  )
}
