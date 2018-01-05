package com.github.mshibuya.cloudformal.aws.glue

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-trigger.html
 */

trait Trigger extends Resource {
  val resourceTypeName = "AWS::Glue::Trigger"

  def `type`: String
  def description: Option[String] = None
  def actions: Seq[Action]
  def schedule: Option[String] = None
  def name: Option[String] = None
  def predicate: Option[Predicate] = None

  def resourceProperties: FormattableMap = Formattable.opt(
    "Type" -> Some(Formattable(`type`)),
    "Description" -> description.map(Formattable(_)),
    "Actions" -> Some(Formattable(actions)),
    "Schedule" -> schedule.map(Formattable(_)),
    "Name" -> name.map(Formattable(_)),
    "Predicate" -> predicate.map(Formattable(_))
  )
}
