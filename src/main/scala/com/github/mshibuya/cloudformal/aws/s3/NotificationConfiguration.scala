package com.github.mshibuya.cloudformal.aws.s3

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-notificationconfig.html
 */

case class NotificationConfiguration(
    lambdaConfigurations: Property[Seq[LambdaConfiguration]] = Empty,
    queueConfigurations: Property[Seq[QueueConfiguration]] = Empty,
    topicConfigurations: Property[Seq[TopicConfiguration]] = Empty) extends Expression[NotificationConfiguration] {
  def render: Formattable = Value(
    "LambdaConfigurations" -> lambdaConfigurations,
    "QueueConfigurations" -> queueConfigurations,
    "TopicConfigurations" -> topicConfigurations
  )
}
