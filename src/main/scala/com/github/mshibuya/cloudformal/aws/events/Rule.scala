package com.github.mshibuya.cloudformal.aws.events

import argonaut.Json
import com.github.mshibuya.cloudformal.model._
import com.github.mshibuya.cloudformal.model.policy._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-rule.html
 */

trait Rule extends Resource with Resource.WithDeletionPolicy {
  val resourceTypeName = "AWS::Events::Rule"

  def arnAttribute: Expression[String] = Fn.GetAtt(logicalId, "Arn")

  def description: Property[String] = Empty
  def eventPattern: Property[Json] = Empty
  def name: Property[String] = Empty
  def roleArn: Property[String] = Empty
  def scheduleExpression: Property[String] = Empty
  def state: Property[String] = Empty
  def targets: Property[Seq[Target]] = Empty

  def resourceProperties: FormattableMap = Formattable.withProperties(
    "Description" -> description,
    "EventPattern" -> eventPattern,
    "Name" -> name,
    "RoleArn" -> roleArn,
    "ScheduleExpression" -> scheduleExpression,
    "State" -> state,
    "Targets" -> targets
  )
}
