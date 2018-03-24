package com.github.mshibuya.cloudformal.aws.apigateway

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-usageplan-throttlesettings.html
 */

case class ThrottleSettings(
    burstLimit: Property[Int] = Empty,
    rateLimit: Property[Double] = Empty) extends Expression[ThrottleSettings] {
  def render: Formattable = Value(
    "BurstLimit" -> burstLimit,
    "RateLimit" -> rateLimit
  )
}
