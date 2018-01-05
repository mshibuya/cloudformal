package com.github.mshibuya.cloudformal.aws.s3

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-loggingconfig.html
 */

case class LoggingConfiguration(
    destinationBucketName: Option[String] = None,
    logFilePrefix: Option[String] = None) extends Renderable {
  def render: Formattable = Formattable.opt(
    "DestinationBucketName" -> destinationBucketName.map(Formattable(_)),
    "LogFilePrefix" -> logFilePrefix.map(Formattable(_))
  )
}
