package com.github.mshibuya.cloudformal.aws.ssm

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-notificationconfig.html
 */

case class NotificationConfig(
    notificationArn: NonEmptyProperty[String],
    notificationType: Property[String] = Empty,
    notificationEvents: Property[Seq[String]] = Empty) extends Renderable {
  def render: Formattable = Formattable.withProperties(
    "NotificationArn" -> notificationArn,
    "NotificationType" -> notificationType,
    "NotificationEvents" -> notificationEvents
  )
}
