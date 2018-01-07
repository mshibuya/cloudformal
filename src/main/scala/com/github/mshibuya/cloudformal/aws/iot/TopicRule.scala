package com.github.mshibuya.cloudformal.aws.iot

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-topicrule.html
 */

trait TopicRule extends Resource {
  val resourceTypeName = "AWS::IoT::TopicRule"

  def arnAttribute: Expression[String] = Fn.GetAtt(logicalId, "Arn")

  def ruleName: Property[String] = Empty
  def topicRulePayload: NonEmptyProperty[TopicRulePayload]

  def resourceProperties: FormattableMap = Formattable.withProperties(
    "RuleName" -> ruleName,
    "TopicRulePayload" -> topicRulePayload
  )
}
