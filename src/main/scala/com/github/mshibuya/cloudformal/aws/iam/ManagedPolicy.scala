package com.github.mshibuya.cloudformal.aws.iam

import argonaut.Json
import com.github.mshibuya.cloudformal.model._
import com.github.mshibuya.cloudformal.model.policy._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-managedpolicy.html
 */

trait ManagedPolicy extends Resource[ManagedPolicy] with Resource.WithDeletionPolicy {
  val resourceTypeName = "AWS::IAM::ManagedPolicy"

  def description: Property[String] = Empty
  def groups: Property[Seq[String]] = Empty
  def managedPolicyName: Property[String] = Empty
  def path: Property[String] = Empty
  def policyDocument: NonEmptyProperty[Json]
  def roles: Property[Seq[String]] = Empty
  def users: Property[Seq[String]] = Empty

  def render(): MapValue[_] = Value(
    "Description" -> description,
    "Groups" -> groups,
    "ManagedPolicyName" -> managedPolicyName,
    "Path" -> path,
    "PolicyDocument" -> policyDocument,
    "Roles" -> roles,
    "Users" -> users
  )
}
