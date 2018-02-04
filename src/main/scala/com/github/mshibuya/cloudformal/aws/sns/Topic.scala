package com.github.mshibuya.cloudformal.aws.sns

import com.github.mshibuya.cloudformal.model._
import com.github.mshibuya.cloudformal.model.policy._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sns-topic.html
 */

trait Topic extends Resource with Resource.WithDeletionPolicy {
  val resourceTypeName = "AWS::SNS::Topic"

  object attributes {
    val topicName: Expression[String] = Fn.GetAtt(logicalId, "TopicName")
  }

  def displayName: Property[String] = Empty
  def subscription: Property[Seq[Subscription]] = Empty
  def topicName: Property[String] = Empty

  def resourceProperties: FormattableMap = Formattable.withProperties(
    "DisplayName" -> displayName,
    "Subscription" -> subscription,
    "TopicName" -> topicName
  )
}
