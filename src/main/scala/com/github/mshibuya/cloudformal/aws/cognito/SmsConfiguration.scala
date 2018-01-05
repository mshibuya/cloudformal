package com.github.mshibuya.cloudformal.aws.cognito

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-smsconfiguration.html
 */

case class SmsConfiguration(
    externalId: Option[String] = None,
    snsCallerArn: Option[String] = None) extends Renderable {
  def render: Formattable = Formattable.opt(
    "ExternalId" -> externalId.map(Formattable(_)),
    "SnsCallerArn" -> snsCallerArn.map(Formattable(_))
  )
}
