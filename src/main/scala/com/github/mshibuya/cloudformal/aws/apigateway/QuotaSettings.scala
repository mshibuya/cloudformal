package com.github.mshibuya.cloudformal.aws.apigateway

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-usageplan-quotasettings.html
 */

case class QuotaSettings(
    limit: Property[Int] = Empty,
    offset: Property[Int] = Empty,
    period: Property[String] = Empty) extends Expression[QuotaSettings] {
  def render: Formattable = Value(
    "Limit" -> limit,
    "Offset" -> offset,
    "Period" -> period
  )
}
