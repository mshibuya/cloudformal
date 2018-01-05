package com.github.mshibuya.cloudformal.aws.sns

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sns-topic.html
 */

trait Topic extends Resource {
  val resourceTypeName = "AWS::SNS::Topic"

  def displayName: Option[String] = None
  def subscription: Option[Seq[Subscription]] = None
  def topicName: Option[String] = None

  def resourceProperties: FormattableMap = Formattable.opt(
    "DisplayName" -> displayName.map(Formattable(_)),
    "Subscription" -> subscription.map(Formattable(_)),
    "TopicName" -> topicName.map(Formattable(_))
  )
}
