package com.github.mshibuya.cloudformal.aws.iot

import com.github.mshibuya.cloudformal.model._
import com.github.mshibuya.cloudformal.model.policy._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-topicrule.html
 */

trait TopicRule extends Resource with Resource.WithDeletionPolicy {
  val resourceTypeName = "AWS::IoT::TopicRule"

  object attributes {
    val arn: Expression[String] = Fn.GetAtt(logicalId, "Arn")
  }

  def ruleName: Property[String] = Empty
  def topicRulePayload: NonEmptyProperty[TopicRulePayload]

  def resourceProperties: FormattableMap = Formattable.withProperties(
    "RuleName" -> ruleName,
    "TopicRulePayload" -> topicRulePayload
  )
}
