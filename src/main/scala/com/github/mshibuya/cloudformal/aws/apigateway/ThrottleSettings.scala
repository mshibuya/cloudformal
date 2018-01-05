package com.github.mshibuya.cloudformal.aws.apigateway

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-usageplan-throttlesettings.html
 */

case class ThrottleSettings(
    burstLimit: Option[Int] = None,
    rateLimit: Option[Double] = None) extends Renderable {
  def render: Formattable = Formattable.opt(
    "BurstLimit" -> burstLimit.map(Formattable(_)),
    "RateLimit" -> rateLimit.map(Formattable(_))
  )
}
