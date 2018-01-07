package com.github.mshibuya.cloudformal.aws.kinesisfirehose

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-cloudwatchloggingoptions.html
 */

case class CloudWatchLoggingOptions(
    enabled: Property[Boolean] = Empty,
    logGroupName: Property[String] = Empty,
    logStreamName: Property[String] = Empty) extends Renderable {
  def render: Formattable = Formattable.withProperties(
    "Enabled" -> enabled,
    "LogGroupName" -> logGroupName,
    "LogStreamName" -> logStreamName
  )
}
