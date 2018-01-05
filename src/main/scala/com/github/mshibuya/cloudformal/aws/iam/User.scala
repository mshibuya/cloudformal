package com.github.mshibuya.cloudformal.aws.iam

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-user.html
 */

trait User extends Resource {
  val resourceTypeName = "AWS::IAM::User"

  def groups: Option[Seq[String]] = None
  def loginProfile: Option[LoginProfile] = None
  def managedPolicyArns: Option[Seq[String]] = None
  def path: Option[String] = None
  def policies: Option[Seq[Policy]] = None
  def userName: Option[String] = None

  def resourceProperties: FormattableMap = Formattable.opt(
    "Groups" -> groups.map(Formattable(_)),
    "LoginProfile" -> loginProfile.map(Formattable(_)),
    "ManagedPolicyArns" -> managedPolicyArns.map(Formattable(_)),
    "Path" -> path.map(Formattable(_)),
    "Policies" -> policies.map(Formattable(_)),
    "UserName" -> userName.map(Formattable(_))
  )
}
