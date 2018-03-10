package com.github.mshibuya.cloudformal.aws.ses

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-bounceaction.html
 */

case class BounceAction(
    sender: NonEmptyProperty[String],
    smtpReplyCode: NonEmptyProperty[String],
    message: NonEmptyProperty[String],
    topicArn: Property[String] = Empty,
    statusCode: Property[String] = Empty) extends Renderable {
  def render: Formattable = Formattable.withProperties(
    "Sender" -> sender,
    "SmtpReplyCode" -> smtpReplyCode,
    "Message" -> message,
    "TopicArn" -> topicArn,
    "StatusCode" -> statusCode
  )
}
