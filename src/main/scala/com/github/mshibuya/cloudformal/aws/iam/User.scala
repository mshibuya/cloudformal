package com.github.mshibuya.cloudformal.aws.iam

import com.github.mshibuya.cloudformal.model._
import com.github.mshibuya.cloudformal.model.policy._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-user.html
 */

trait User extends Resource with Resource.WithDeletionPolicy {
  val resourceTypeName = "AWS::IAM::User"

  def arnAttribute: Expression[String] = Fn.GetAtt(logicalId, "Arn")

  def groups: Property[Seq[String]] = Empty
  def loginProfile: Property[LoginProfile] = Empty
  def managedPolicyArns: Property[Seq[String]] = Empty
  def path: Property[String] = Empty
  def policies: Property[Seq[Policy]] = Empty
  def userName: Property[String] = Empty

  def resourceProperties: FormattableMap = Formattable.withProperties(
    "Groups" -> groups,
    "LoginProfile" -> loginProfile,
    "ManagedPolicyArns" -> managedPolicyArns,
    "Path" -> path,
    "Policies" -> policies,
    "UserName" -> userName
  )
}
