package com.github.mshibuya.cloudformal.aws.iam

import argonaut.Json
import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-role.html
 */

trait Role extends Resource {
  val resourceTypeName = "AWS::IAM::Role"

  def assumeRolePolicyDocument: Json
  def managedPolicyArns: Option[Seq[String]] = None
  def path: Option[String] = None
  def policies: Option[Seq[Policy]] = None
  def roleName: Option[String] = None

  def resourceProperties: FormattableMap = Formattable.opt(
    "AssumeRolePolicyDocument" -> Some(Formattable(assumeRolePolicyDocument)),
    "ManagedPolicyArns" -> managedPolicyArns.map(Formattable(_)),
    "Path" -> path.map(Formattable(_)),
    "Policies" -> policies.map(Formattable(_)),
    "RoleName" -> roleName.map(Formattable(_))
  )
}
