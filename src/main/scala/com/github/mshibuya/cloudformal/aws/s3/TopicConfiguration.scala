package com.github.mshibuya.cloudformal.aws.s3

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-notificationconfig-topicconfig.html
 */

case class TopicConfiguration(
    event: NonEmptyProperty[String],
    filter: Property[NotificationFilter] = Empty,
    topic: NonEmptyProperty[String]) extends Expression[TopicConfiguration] {
  def render: Formattable = Value(
    "Event" -> event,
    "Filter" -> filter,
    "Topic" -> topic
  )
}
