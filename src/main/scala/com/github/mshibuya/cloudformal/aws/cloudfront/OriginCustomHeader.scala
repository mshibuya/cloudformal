package com.github.mshibuya.cloudformal.aws.cloudfront

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-origincustomheader.html
 */

case class OriginCustomHeader(
    headerValue: NonEmptyProperty[String],
    headerName: NonEmptyProperty[String]) extends Renderable {
  def render: Formattable = Formattable.withProperties(
    "HeaderValue" -> headerValue,
    "HeaderName" -> headerName
  )
}
