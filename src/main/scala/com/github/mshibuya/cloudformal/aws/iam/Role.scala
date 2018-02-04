package com.github.mshibuya.cloudformal.aws.iam

import argonaut.Json
import com.github.mshibuya.cloudformal.model._
import com.github.mshibuya.cloudformal.model.policy._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-role.html
 */

trait Role extends Resource with Resource.WithDeletionPolicy {
  val resourceTypeName = "AWS::IAM::Role"

  object attributes {
    val arn: Expression[String] = Fn.GetAtt(logicalId, "Arn")
  }

  def assumeRolePolicyDocument: NonEmptyProperty[Json]
  def managedPolicyArns: Property[Seq[String]] = Empty
  def path: Property[String] = Empty
  def policies: Property[Seq[Policy]] = Empty
  def roleName: Property[String] = Empty

  def resourceProperties: FormattableMap = Formattable.withProperties(
    "AssumeRolePolicyDocument" -> assumeRolePolicyDocument,
    "ManagedPolicyArns" -> managedPolicyArns,
    "Path" -> path,
    "Policies" -> policies,
    "RoleName" -> roleName
  )
}
