package com.github.mshibuya.cloudformal.aws.ses

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-snsaction.html
 */

case class SNSAction(
    topicArn: Property[String] = Empty,
    encoding: Property[String] = Empty) extends Expression[SNSAction] {
  def render: Formattable = Value(
    "TopicArn" -> topicArn,
    "Encoding" -> encoding
  )
}
