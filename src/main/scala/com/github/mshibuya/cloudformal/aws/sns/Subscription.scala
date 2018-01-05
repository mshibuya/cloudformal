package com.github.mshibuya.cloudformal.aws.sns

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sns-subscription.html
 */

trait Subscription extends Resource {
  val resourceTypeName = "AWS::SNS::Subscription"

  def endpoint: Option[String] = None
  def protocol: Option[String] = None
  def topicArn: Option[String] = None

  def resourceProperties: FormattableMap = Formattable.opt(
    "Endpoint" -> endpoint.map(Formattable(_)),
    "Protocol" -> protocol.map(Formattable(_)),
    "TopicArn" -> topicArn.map(Formattable(_))
  )
}
