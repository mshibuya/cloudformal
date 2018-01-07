package com.github.mshibuya.cloudformal.aws.s3

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-inventoryconfiguration.html
 */

case class InventoryConfiguration(
    destination: NonEmptyProperty[Destination],
    enabled: NonEmptyProperty[Boolean],
    id: NonEmptyProperty[String],
    includedObjectVersions: NonEmptyProperty[String],
    optionalFields: Property[Seq[String]] = Empty,
    prefix: Property[String] = Empty,
    scheduleFrequency: NonEmptyProperty[String]) extends Renderable {
  def render: Formattable = Formattable.withProperties(
    "Destination" -> destination,
    "Enabled" -> enabled,
    "Id" -> id,
    "IncludedObjectVersions" -> includedObjectVersions,
    "OptionalFields" -> optionalFields,
    "Prefix" -> prefix,
    "ScheduleFrequency" -> scheduleFrequency
  )
}
