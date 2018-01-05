package com.github.mshibuya.cloudformal.aws.ssm

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-logginginfo.html
 */

case class LoggingInfo(
    s3Bucket: String,
    region: String,
    s3Prefix: Option[String] = None) extends Renderable {
  def render: Formattable = Formattable.opt(
    "S3Bucket" -> Some(Formattable(s3Bucket)),
    "Region" -> Some(Formattable(region)),
    "S3Prefix" -> s3Prefix.map(Formattable(_))
  )
}
