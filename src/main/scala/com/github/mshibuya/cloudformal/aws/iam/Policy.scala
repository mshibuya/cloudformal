package com.github.mshibuya.cloudformal.aws.iam

import argonaut.Json
import com.github.mshibuya.cloudformal.model._
import com.github.mshibuya.cloudformal.model.policy._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-policy.html
 */

trait Policy extends Resource[Policy] with Resource.WithDeletionPolicy {
  val resourceTypeName = "AWS::IAM::Policy"

  def groups: Property[Seq[String]] = Empty
  def policyDocument: NonEmptyProperty[Json]
  def policyName: NonEmptyProperty[String]
  def roles: Property[Seq[String]] = Empty
  def users: Property[Seq[String]] = Empty

  def render(): MapValue[_] = Value(
    "Groups" -> groups,
    "PolicyDocument" -> policyDocument,
    "PolicyName" -> policyName,
    "Roles" -> roles,
    "Users" -> users
  )
}
