package com.github.mshibuya.cloudformal.aws.apigateway

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-usageplan-quotasettings.html
 */

case class QuotaSettings(
    limit: Option[Int] = None,
    offset: Option[Int] = None,
    period: Option[String] = None) extends Renderable {
  def render: Formattable = Formattable.opt(
    "Limit" -> limit.map(Formattable(_)),
    "Offset" -> offset.map(Formattable(_)),
    "Period" -> period.map(Formattable(_))
  )
}
