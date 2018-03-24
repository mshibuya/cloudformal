package com.github.mshibuya.cloudformal.aws.autoscaling

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-notificationconfigurations.html
 */

case class NotificationConfiguration(
    notificationTypes: Property[Seq[String]] = Empty,
    topicARN: NonEmptyProperty[String]) extends Expression[NotificationConfiguration] {
  def render: Formattable = Value(
    "NotificationTypes" -> notificationTypes,
    "TopicARN" -> topicARN
  )
}
