package com.github.mshibuya.cloudformal.aws.s3

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-loggingconfig.html
 */

case class LoggingConfiguration(
    destinationBucketName: Property[String] = Empty,
    logFilePrefix: Property[String] = Empty) extends Expression[LoggingConfiguration] {
  def render: Formattable = Value(
    "DestinationBucketName" -> destinationBucketName,
    "LogFilePrefix" -> logFilePrefix
  )
}
