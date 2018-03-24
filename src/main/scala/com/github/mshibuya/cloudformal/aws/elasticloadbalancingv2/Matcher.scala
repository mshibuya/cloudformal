package com.github.mshibuya.cloudformal.aws.elasticloadbalancingv2

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-targetgroup-matcher.html
 */

case class Matcher(
    httpCode: NonEmptyProperty[String]) extends Expression[Matcher] {
  def render: Formattable = Value(
    "HttpCode" -> httpCode
  )
}
