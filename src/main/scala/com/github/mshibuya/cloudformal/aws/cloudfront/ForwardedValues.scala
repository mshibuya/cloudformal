package com.github.mshibuya.cloudformal.aws.cloudfront

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-forwardedvalues.html
 */

case class ForwardedValues(
    cookies: Property[Cookies] = Empty,
    headers: Property[Seq[String]] = Empty,
    queryString: NonEmptyProperty[Boolean],
    queryStringCacheKeys: Property[Seq[String]] = Empty) extends Renderable {
  def render: Formattable = Formattable.withProperties(
    "Cookies" -> cookies,
    "Headers" -> headers,
    "QueryString" -> queryString,
    "QueryStringCacheKeys" -> queryStringCacheKeys
  )
}
