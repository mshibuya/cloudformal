package com.github.mshibuya.cloudformal.aws.iam

import argonaut.Json
import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-policy.html
 */

trait Policy extends Resource {
  val resourceTypeName = "AWS::IAM::Policy"

  def groups: Option[Seq[String]] = None
  def policyDocument: Json
  def policyName: String
  def roles: Option[Seq[String]] = None
  def users: Option[Seq[String]] = None

  def resourceProperties: FormattableMap = Formattable.opt(
    "Groups" -> groups.map(Formattable(_)),
    "PolicyDocument" -> Some(Formattable(policyDocument)),
    "PolicyName" -> Some(Formattable(policyName)),
    "Roles" -> roles.map(Formattable(_)),
    "Users" -> users.map(Formattable(_))
  )
}
