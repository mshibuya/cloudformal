package com.github.mshibuya.cloudformal.aws.iam

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-group.html
 */

trait Group extends Resource {
  val resourceTypeName = "AWS::IAM::Group"

  def groupName: Option[String] = None
  def managedPolicyArns: Option[Seq[String]] = None
  def path: Option[String] = None
  def policies: Option[Seq[Policy]] = None

  def resourceProperties: FormattableMap = Formattable.opt(
    "GroupName" -> groupName.map(Formattable(_)),
    "ManagedPolicyArns" -> managedPolicyArns.map(Formattable(_)),
    "Path" -> path.map(Formattable(_)),
    "Policies" -> policies.map(Formattable(_))
  )
}
