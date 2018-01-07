package com.github.mshibuya.cloudformal.aws.cognito

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-emailconfiguration.html
 */

case class EmailConfiguration(
    replyToEmailAddress: Property[String] = Empty,
    sourceArn: Property[String] = Empty) extends Renderable {
  def render: Formattable = Formattable.withProperties(
    "ReplyToEmailAddress" -> replyToEmailAddress,
    "SourceArn" -> sourceArn
  )
}
