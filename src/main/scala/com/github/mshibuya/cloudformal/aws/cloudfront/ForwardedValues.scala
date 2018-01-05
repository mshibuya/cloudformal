package com.github.mshibuya.cloudformal.aws.cloudfront

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-forwardedvalues.html
 */

case class ForwardedValues(
    cookies: Option[Cookies] = None,
    headers: Option[Seq[String]] = None,
    queryString: Boolean,
    queryStringCacheKeys: Option[Seq[String]] = None) extends Renderable {
  def render: Formattable = Formattable.opt(
    "Cookies" -> cookies.map(Formattable(_)),
    "Headers" -> headers.map(Formattable(_)),
    "QueryString" -> Some(Formattable(queryString)),
    "QueryStringCacheKeys" -> queryStringCacheKeys.map(Formattable(_))
  )
}
