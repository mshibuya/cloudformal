package com.github.mshibuya.cloudformal.aws.iam

import argonaut.Json
import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-policy.html
 */

trait Policy extends Resource {
  val resourceTypeName = "AWS::IAM::Policy"

  def groups: Property[Seq[String]] = Empty
  def policyDocument: NonEmptyProperty[Json]
  def policyName: NonEmptyProperty[String]
  def roles: Property[Seq[String]] = Empty
  def users: Property[Seq[String]] = Empty

  def resourceProperties: FormattableMap = Formattable.withProperties(
    "Groups" -> groups,
    "PolicyDocument" -> policyDocument,
    "PolicyName" -> policyName,
    "Roles" -> roles,
    "Users" -> users
  )
}
