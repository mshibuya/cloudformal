package com.github.mshibuya.cloudformal.aws.autoscaling

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-notificationconfigurations.html
 */

case class NotificationConfiguration(
    notificationTypes: Option[Seq[String]] = None,
    topicARN: String) extends Renderable {
  def render: Formattable = Formattable.opt(
    "NotificationTypes" -> notificationTypes.map(Formattable(_)),
    "TopicARN" -> Some(Formattable(topicARN))
  )
}
