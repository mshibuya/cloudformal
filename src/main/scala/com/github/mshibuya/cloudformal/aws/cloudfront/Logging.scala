package com.github.mshibuya.cloudformal.aws.cloudfront

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-logging.html
 */

case class Logging(
    includeCookies: Property[Boolean] = Empty,
    bucket: NonEmptyProperty[String],
    prefix: Property[String] = Empty) extends Expression[Logging] {
  def render: Formattable = Value(
    "IncludeCookies" -> includeCookies,
    "Bucket" -> bucket,
    "Prefix" -> prefix
  )
}
