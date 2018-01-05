package com.github.mshibuya.cloudformal.aws.ssm

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-notificationconfig.html
 */

case class NotificationConfig(
    notificationArn: Option[String] = None,
    notificationType: Option[String] = None,
    notificationEvents: Option[Seq[String]] = None) extends Renderable {
  def render: Formattable = Formattable.opt(
    "NotificationArn" -> notificationArn.map(Formattable(_)),
    "NotificationType" -> notificationType.map(Formattable(_)),
    "NotificationEvents" -> notificationEvents.map(Formattable(_))
  )
}
