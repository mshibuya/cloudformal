package com.github.mshibuya.cloudformal.aws.sns

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sns-subscription.html
 */

trait Subscription extends Resource {
  val resourceTypeName = "AWS::SNS::Subscription"

  def endpoint: Property[String] = Empty
  def protocol: Property[String] = Empty
  def topicArn: Property[String] = Empty

  def resourceProperties: FormattableMap = Formattable.withProperties(
    "Endpoint" -> endpoint,
    "Protocol" -> protocol,
    "TopicArn" -> topicArn
  )
}
