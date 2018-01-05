package com.github.mshibuya.cloudformal.aws.s3

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-notificationconfiguration-config-filter.html
 */

case class NotificationFilter(
    s3Key: S3KeyFilter) extends Renderable {
  def render: Formattable = Formattable.opt(
    "S3Key" -> Some(Formattable(s3Key))
  )
}
