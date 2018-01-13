package com.github.mshibuya.cloudformal.aws.glue

import com.github.mshibuya.cloudformal.model._
import com.github.mshibuya.cloudformal.model.policy._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-trigger.html
 */

trait Trigger extends Resource with Resource.WithDeletionPolicy {
  val resourceTypeName = "AWS::Glue::Trigger"

  def `type`: NonEmptyProperty[String]
  def description: Property[String] = Empty
  def actions: NonEmptyProperty[Seq[Action]]
  def schedule: Property[String] = Empty
  def name: Property[String] = Empty
  def predicate: Property[Predicate] = Empty

  def resourceProperties: FormattableMap = Formattable.withProperties(
    "Type" -> `type`,
    "Description" -> description,
    "Actions" -> actions,
    "Schedule" -> schedule,
    "Name" -> name,
    "Predicate" -> predicate
  )
}
