package com.github.mshibuya.cloudformal.aws.iot

import com.github.mshibuya.cloudformal.model._
import com.github.mshibuya.cloudformal.model.policy._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-policyprincipalattachment.html
 */

trait PolicyPrincipalAttachment extends Resource[PolicyPrincipalAttachment] with Resource.WithDeletionPolicy {
  val resourceTypeName = "AWS::IoT::PolicyPrincipalAttachment"

  def policyName: NonEmptyProperty[String]
  def principal: NonEmptyProperty[String]

  def render(): MapValue[_] = Value(
    "PolicyName" -> policyName,
    "Principal" -> principal
  )
}
