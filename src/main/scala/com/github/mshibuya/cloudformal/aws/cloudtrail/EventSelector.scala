package com.github.mshibuya.cloudformal.aws.cloudtrail

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudtrail-trail-eventselector.html
 */

case class EventSelector(
    dataResources: Option[Seq[DataResource]] = None,
    includeManagementEvents: Option[Boolean] = None,
    readWriteType: Option[String] = None) extends Renderable {
  def render: Formattable = Formattable.opt(
    "DataResources" -> dataResources.map(Formattable(_)),
    "IncludeManagementEvents" -> includeManagementEvents.map(Formattable(_)),
    "ReadWriteType" -> readWriteType.map(Formattable(_))
  )
}
