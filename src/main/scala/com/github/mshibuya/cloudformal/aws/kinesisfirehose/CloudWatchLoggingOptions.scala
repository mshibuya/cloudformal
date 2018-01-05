package com.github.mshibuya.cloudformal.aws.kinesisfirehose

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-cloudwatchloggingoptions.html
 */

case class CloudWatchLoggingOptions(
    enabled: Option[Boolean] = None,
    logGroupName: Option[String] = None,
    logStreamName: Option[String] = None) extends Renderable {
  def render: Formattable = Formattable.opt(
    "Enabled" -> enabled.map(Formattable(_)),
    "LogGroupName" -> logGroupName.map(Formattable(_)),
    "LogStreamName" -> logStreamName.map(Formattable(_))
  )
}
