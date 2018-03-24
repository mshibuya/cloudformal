package com.github.mshibuya.cloudformal.aws.cloudtrail

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudtrail-trail-eventselector.html
 */

case class EventSelector(
    dataResources: Property[Seq[DataResource]] = Empty,
    includeManagementEvents: Property[Boolean] = Empty,
    readWriteType: Property[String] = Empty) extends Expression[EventSelector] {
  def render: Formattable = Value(
    "DataResources" -> dataResources,
    "IncludeManagementEvents" -> includeManagementEvents,
    "ReadWriteType" -> readWriteType
  )
}
