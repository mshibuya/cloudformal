package com.github.mshibuya.cloudformal.aws.cloudformation

import com.github.mshibuya.cloudformal.model._
import com.github.mshibuya.cloudformal.model.policy._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cfn-customresource.html
 */

trait CustomResource extends Resource[CustomResource] with Resource.WithDeletionPolicy {
  val resourceTypeName = "AWS::CloudFormation::CustomResource"

  def serviceToken: NonEmptyProperty[String]

  def render(): MapValue[_] = Value(
    "ServiceToken" -> serviceToken
  )
}
