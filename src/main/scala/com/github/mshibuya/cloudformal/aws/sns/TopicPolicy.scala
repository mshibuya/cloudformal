package com.github.mshibuya.cloudformal.aws.sns

import argonaut.Json
import com.github.mshibuya.cloudformal.model._
import com.github.mshibuya.cloudformal.model.policy._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sns-policy.html
 */

trait TopicPolicy extends Resource with Resource.WithDeletionPolicy {
  val resourceTypeName = "AWS::SNS::TopicPolicy"

  def policyDocument: NonEmptyProperty[Json]
  def topics: NonEmptyProperty[Seq[String]]

  def resourceProperties: FormattableMap = Formattable.withProperties(
    "PolicyDocument" -> policyDocument,
    "Topics" -> topics
  )
}
