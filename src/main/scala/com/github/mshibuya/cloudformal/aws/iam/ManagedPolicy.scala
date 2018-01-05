package com.github.mshibuya.cloudformal.aws.iam

import argonaut.Json
import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-managedpolicy.html
 */

trait ManagedPolicy extends Resource {
  val resourceTypeName = "AWS::IAM::ManagedPolicy"

  def description: Option[String] = None
  def groups: Option[Seq[String]] = None
  def managedPolicyName: Option[String] = None
  def path: Option[String] = None
  def policyDocument: Json
  def roles: Option[Seq[String]] = None
  def users: Option[Seq[String]] = None

  def resourceProperties: FormattableMap = Formattable.opt(
    "Description" -> description.map(Formattable(_)),
    "Groups" -> groups.map(Formattable(_)),
    "ManagedPolicyName" -> managedPolicyName.map(Formattable(_)),
    "Path" -> path.map(Formattable(_)),
    "PolicyDocument" -> Some(Formattable(policyDocument)),
    "Roles" -> roles.map(Formattable(_)),
    "Users" -> users.map(Formattable(_))
  )
}
