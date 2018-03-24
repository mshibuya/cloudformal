package com.github.mshibuya.cloudformal.aws.iam

import com.github.mshibuya.cloudformal.model._
import com.github.mshibuya.cloudformal.model.policy._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-group.html
 */

trait Group extends Resource[Group] with Resource.WithDeletionPolicy {
  val resourceTypeName = "AWS::IAM::Group"

  object attributes {
    val arn: Expression[String] = Fn.GetAtt(logicalId, "Arn")
  }

  def groupName: Property[String] = Empty
  def managedPolicyArns: Property[Seq[String]] = Empty
  def path: Property[String] = Empty
  def policies: Property[Seq[Policy]] = Empty

  def render(): MapValue[_] = Value(
    "GroupName" -> groupName,
    "ManagedPolicyArns" -> managedPolicyArns,
    "Path" -> path,
    "Policies" -> policies
  )
}
