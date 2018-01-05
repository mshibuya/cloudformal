package com.github.mshibuya.cloudformal.aws.cloudfront

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-origincustomheader.html
 */

case class OriginCustomHeader(
    headerValue: String,
    headerName: String) extends Renderable {
  def render: Formattable = Formattable.opt(
    "HeaderValue" -> Some(Formattable(headerValue)),
    "HeaderName" -> Some(Formattable(headerName))
  )
}
