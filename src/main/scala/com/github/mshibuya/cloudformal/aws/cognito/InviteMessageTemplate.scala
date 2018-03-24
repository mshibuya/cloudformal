package com.github.mshibuya.cloudformal.aws.cognito

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-invitemessagetemplate.html
 */

case class InviteMessageTemplate(
    emailMessage: Property[String] = Empty,
    smsMessage: Property[String] = Empty,
    emailSubject: Property[String] = Empty) extends Expression[InviteMessageTemplate] {
  def render: Formattable = Value(
    "EmailMessage" -> emailMessage,
    "SMSMessage" -> smsMessage,
    "EmailSubject" -> emailSubject
  )
}
