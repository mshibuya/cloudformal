package com.github.mshibuya.cloudformal.aws.cloudfront

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-logging.html
 */

case class Logging(
    includeCookies: Option[Boolean] = None,
    bucket: String,
    prefix: Option[String] = None) extends Renderable {
  def render: Formattable = Formattable.opt(
    "IncludeCookies" -> includeCookies.map(Formattable(_)),
    "Bucket" -> Some(Formattable(bucket)),
    "Prefix" -> prefix.map(Formattable(_))
  )
}
