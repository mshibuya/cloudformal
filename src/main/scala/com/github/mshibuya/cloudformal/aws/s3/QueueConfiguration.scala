package com.github.mshibuya.cloudformal.aws.s3

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-notificationconfig-queueconfig.html
 */

case class QueueConfiguration(
    event: String,
    filter: Option[NotificationFilter] = None,
    queue: String) extends Renderable {
  def render: Formattable = Formattable.opt(
    "Event" -> Some(Formattable(event)),
    "Filter" -> filter.map(Formattable(_)),
    "Queue" -> Some(Formattable(queue))
  )
}
