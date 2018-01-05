package com.github.mshibuya.cloudformal.aws.sns

import argonaut.Json
import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sns-policy.html
 */

trait TopicPolicy extends Resource {
  val resourceTypeName = "AWS::SNS::TopicPolicy"

  def policyDocument: Json
  def topics: Seq[String]

  def resourceProperties: FormattableMap = Formattable.opt(
    "PolicyDocument" -> Some(Formattable(policyDocument)),
    "Topics" -> Some(Formattable(topics))
  )
}
