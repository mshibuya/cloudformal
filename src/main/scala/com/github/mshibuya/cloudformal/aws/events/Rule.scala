package com.github.mshibuya.cloudformal.aws.events

import argonaut.Json
import com.github.mshibuya.cloudformal.model._
import com.github.mshibuya.cloudformal.model.policy._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-rule.html
 */

trait Rule extends Resource[Rule] with Resource.WithDeletionPolicy {
  val resourceTypeName = "AWS::Events::Rule"

  object attributes {
    val arn: Expression[String] = Fn.GetAtt(logicalId, "Arn")
  }

  def description: Property[String] = Empty
  def eventPattern: Property[Json] = Empty
  def name: Property[String] = Empty
  def roleArn: Property[String] = Empty
  def scheduleExpression: Property[String] = Empty
  def state: Property[String] = Empty
  def targets: Property[Seq[Target]] = Empty

  def render(): MapValue[_] = Value(
    "Description" -> description,
    "EventPattern" -> eventPattern,
    "Name" -> name,
    "RoleArn" -> roleArn,
    "ScheduleExpression" -> scheduleExpression,
    "State" -> state,
    "Targets" -> targets
  )
}
