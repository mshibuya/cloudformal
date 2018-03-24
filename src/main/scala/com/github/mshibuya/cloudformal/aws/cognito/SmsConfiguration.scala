package com.github.mshibuya.cloudformal.aws.cognito

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-smsconfiguration.html
 */

case class SmsConfiguration(
    externalId: Property[String] = Empty,
    snsCallerArn: Property[String] = Empty) extends Expression[SmsConfiguration] {
  def render: Formattable = Value(
    "ExternalId" -> externalId,
    "SnsCallerArn" -> snsCallerArn
  )
}
