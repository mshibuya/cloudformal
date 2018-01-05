package com.github.mshibuya.cloudformal.aws.cloudfront

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-lambdafunctionassociation.html
 */

case class LambdaFunctionAssociation(
    eventType: Option[String] = None,
    lambdaFunctionARN: Option[String] = None) extends Renderable {
  def render: Formattable = Formattable.opt(
    "EventType" -> eventType.map(Formattable(_)),
    "LambdaFunctionARN" -> lambdaFunctionARN.map(Formattable(_))
  )
}
