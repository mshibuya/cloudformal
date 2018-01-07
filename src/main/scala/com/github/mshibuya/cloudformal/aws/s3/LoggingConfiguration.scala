package com.github.mshibuya.cloudformal.aws.s3

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-loggingconfig.html
 */

case class LoggingConfiguration(
    destinationBucketName: Property[String] = Empty,
    logFilePrefix: Property[String] = Empty) extends Renderable {
  def render: Formattable = Formattable.withProperties(
    "DestinationBucketName" -> destinationBucketName,
    "LogFilePrefix" -> logFilePrefix
  )
}
