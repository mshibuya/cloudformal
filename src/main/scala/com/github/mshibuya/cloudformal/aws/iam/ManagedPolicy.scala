package com.github.mshibuya.cloudformal.aws.iam

import argonaut.Json
import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-managedpolicy.html
 */

trait ManagedPolicy extends Resource {
  val resourceTypeName = "AWS::IAM::ManagedPolicy"

  def description: Property[String] = Empty
  def groups: Property[Seq[String]] = Empty
  def managedPolicyName: Property[String] = Empty
  def path: Property[String] = Empty
  def policyDocument: NonEmptyProperty[Json]
  def roles: Property[Seq[String]] = Empty
  def users: Property[Seq[String]] = Empty

  def resourceProperties: FormattableMap = Formattable.withProperties(
    "Description" -> description,
    "Groups" -> groups,
    "ManagedPolicyName" -> managedPolicyName,
    "Path" -> path,
    "PolicyDocument" -> policyDocument,
    "Roles" -> roles,
    "Users" -> users
  )
}
