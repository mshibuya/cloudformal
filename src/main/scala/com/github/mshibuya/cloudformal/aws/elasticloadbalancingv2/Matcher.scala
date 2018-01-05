package com.github.mshibuya.cloudformal.aws.elasticloadbalancingv2

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-targetgroup-matcher.html
 */

case class Matcher(
    httpCode: String) extends Renderable {
  def render: Formattable = Formattable.opt(
    "HttpCode" -> Some(Formattable(httpCode))
  )
}
