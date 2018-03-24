package com.github.mshibuya.cloudformal.aws.cloudfront

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-lambdafunctionassociation.html
 */

case class LambdaFunctionAssociation(
    eventType: Property[String] = Empty,
    lambdaFunctionARN: Property[String] = Empty) extends Expression[LambdaFunctionAssociation] {
  def render: Formattable = Value(
    "EventType" -> eventType,
    "LambdaFunctionARN" -> lambdaFunctionARN
  )
}
