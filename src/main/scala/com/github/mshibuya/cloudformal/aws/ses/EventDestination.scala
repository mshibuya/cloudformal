package com.github.mshibuya.cloudformal.aws.ses

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-configurationseteventdestination-eventdestination.html
 */

case class EventDestination(
    cloudWatchDestination: Property[CloudWatchDestination] = Empty,
    enabled: Property[Boolean] = Empty,
    matchingEventTypes: NonEmptyProperty[Seq[String]],
    name: Property[String] = Empty,
    kinesisFirehoseDestination: Property[KinesisFirehoseDestination] = Empty) extends Renderable {
  def render: Formattable = Formattable.withProperties(
    "CloudWatchDestination" -> cloudWatchDestination,
    "Enabled" -> enabled,
    "MatchingEventTypes" -> matchingEventTypes,
    "Name" -> name,
    "KinesisFirehoseDestination" -> kinesisFirehoseDestination
  )
}
