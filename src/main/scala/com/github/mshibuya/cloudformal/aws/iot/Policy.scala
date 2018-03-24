package com.github.mshibuya.cloudformal.aws.iot

import argonaut.Json
import com.github.mshibuya.cloudformal.model._
import com.github.mshibuya.cloudformal.model.policy._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-policy.html
 */

trait Policy extends Resource[Policy] with Resource.WithDeletionPolicy {
  val resourceTypeName = "AWS::IoT::Policy"

  object attributes {
    val arn: Expression[String] = Fn.GetAtt(logicalId, "Arn")
  }

  def policyDocument: NonEmptyProperty[Json]
  def policyName: Property[String] = Empty

  def render(): MapValue[_] = Value(
    "PolicyDocument" -> policyDocument,
    "PolicyName" -> policyName
  )
}
