package com.github.mshibuya.cloudformal.aws.events

import argonaut.Json
import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-rule.html
 */

trait Rule extends Resource {
  val resourceTypeName = "AWS::Events::Rule"

  def description: Option[String] = None
  def eventPattern: Option[Json] = None
  def name: Option[String] = None
  def roleArn: Option[String] = None
  def scheduleExpression: Option[String] = None
  def state: Option[String] = None
  def targets: Option[Seq[Target]] = None

  def resourceProperties: FormattableMap = Formattable.opt(
    "Description" -> description.map(Formattable(_)),
    "EventPattern" -> eventPattern.map(Formattable(_)),
    "Name" -> name.map(Formattable(_)),
    "RoleArn" -> roleArn.map(Formattable(_)),
    "ScheduleExpression" -> scheduleExpression.map(Formattable(_)),
    "State" -> state.map(Formattable(_)),
    "Targets" -> targets.map(Formattable(_))
  )
}
