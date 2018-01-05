package com.github.mshibuya.cloudformal.aws.iot

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-topicrule.html
 */

trait TopicRule extends Resource {
  val resourceTypeName = "AWS::IoT::TopicRule"

  def ruleName: Option[String] = None
  def topicRulePayload: TopicRulePayload

  def resourceProperties: FormattableMap = Formattable.opt(
    "RuleName" -> ruleName.map(Formattable(_)),
    "TopicRulePayload" -> Some(Formattable(topicRulePayload))
  )
}
