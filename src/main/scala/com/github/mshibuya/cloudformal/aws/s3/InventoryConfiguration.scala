package com.github.mshibuya.cloudformal.aws.s3

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-inventoryconfiguration.html
 */

case class InventoryConfiguration(
    destination: Destination,
    enabled: Boolean,
    id: String,
    includedObjectVersions: String,
    optionalFields: Option[Seq[String]] = None,
    prefix: Option[String] = None,
    scheduleFrequency: String) extends Renderable {
  def render: Formattable = Formattable.opt(
    "Destination" -> Some(Formattable(destination)),
    "Enabled" -> Some(Formattable(enabled)),
    "Id" -> Some(Formattable(id)),
    "IncludedObjectVersions" -> Some(Formattable(includedObjectVersions)),
    "OptionalFields" -> optionalFields.map(Formattable(_)),
    "Prefix" -> prefix.map(Formattable(_)),
    "ScheduleFrequency" -> Some(Formattable(scheduleFrequency))
  )
}
