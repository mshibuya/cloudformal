package com.github.mshibuya.cloudformal.aws.cloudfront

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-cookies.html
 */

case class Cookies(
    whitelistedNames: Property[Seq[String]] = Empty,
    forward: NonEmptyProperty[String]) extends Renderable {
  def render: Formattable = Formattable.withProperties(
    "WhitelistedNames" -> whitelistedNames,
    "Forward" -> forward
  )
}
