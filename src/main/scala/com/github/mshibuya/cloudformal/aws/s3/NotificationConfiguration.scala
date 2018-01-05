package com.github.mshibuya.cloudformal.aws.s3

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-notificationconfig.html
 */

case class NotificationConfiguration(
    lambdaConfigurations: Option[Seq[LambdaConfiguration]] = None,
    queueConfigurations: Option[Seq[QueueConfiguration]] = None,
    topicConfigurations: Option[Seq[TopicConfiguration]] = None) extends Renderable {
  def render: Formattable = Formattable.opt(
    "LambdaConfigurations" -> lambdaConfigurations.map(Formattable(_)),
    "QueueConfigurations" -> queueConfigurations.map(Formattable(_)),
    "TopicConfigurations" -> topicConfigurations.map(Formattable(_))
  )
}
