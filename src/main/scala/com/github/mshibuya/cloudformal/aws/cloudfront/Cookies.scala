package com.github.mshibuya.cloudformal.aws.cloudfront

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-cookies.html
 */

case class Cookies(
    whitelistedNames: Option[Seq[String]] = None,
    forward: String) extends Renderable {
  def render: Formattable = Formattable.opt(
    "WhitelistedNames" -> whitelistedNames.map(Formattable(_)),
    "Forward" -> Some(Formattable(forward))
  )
}
