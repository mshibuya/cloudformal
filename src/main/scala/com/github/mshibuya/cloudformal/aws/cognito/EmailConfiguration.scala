package com.github.mshibuya.cloudformal.aws.cognito

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-emailconfiguration.html
 */

case class EmailConfiguration(
    replyToEmailAddress: Option[String] = None,
    sourceArn: Option[String] = None) extends Renderable {
  def render: Formattable = Formattable.opt(
    "ReplyToEmailAddress" -> replyToEmailAddress.map(Formattable(_)),
    "SourceArn" -> sourceArn.map(Formattable(_))
  )
}
