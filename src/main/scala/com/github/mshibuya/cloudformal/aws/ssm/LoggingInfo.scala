package com.github.mshibuya.cloudformal.aws.ssm

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-logginginfo.html
 */

case class LoggingInfo(
    s3Bucket: NonEmptyProperty[String],
    region: NonEmptyProperty[String],
    s3Prefix: Property[String] = Empty) extends Renderable {
  def render: Formattable = Formattable.withProperties(
    "S3Bucket" -> s3Bucket,
    "Region" -> region,
    "S3Prefix" -> s3Prefix
  )
}
