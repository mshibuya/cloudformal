package com.github.mshibuya.cloudformal.aws.cognito

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-invitemessagetemplate.html
 */

case class InviteMessageTemplate(
    emailMessage: Option[String] = None,
    sMSMessage: Option[String] = None,
    emailSubject: Option[String] = None) extends Renderable {
  def render: Formattable = Formattable.opt(
    "EmailMessage" -> emailMessage.map(Formattable(_)),
    "SMSMessage" -> sMSMessage.map(Formattable(_)),
    "EmailSubject" -> emailSubject.map(Formattable(_))
  )
}
