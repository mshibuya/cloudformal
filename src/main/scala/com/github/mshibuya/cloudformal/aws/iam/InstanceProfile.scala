package com.github.mshibuya.cloudformal.aws.iam

import com.github.mshibuya.cloudformal.model._
import com.github.mshibuya.cloudformal.model.policy._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-instanceprofile.html
 */

trait InstanceProfile extends Resource[InstanceProfile] with Resource.WithDeletionPolicy {
  val resourceTypeName = "AWS::IAM::InstanceProfile"

  object attributes {
    val arn: Expression[String] = Fn.GetAtt(logicalId, "Arn")
  }

  def instanceProfileName: Property[String] = Empty
  def path: Property[String] = Empty
  def roles: NonEmptyProperty[Seq[String]]

  def render(): MapValue[_] = Value(
    "InstanceProfileName" -> instanceProfileName,
    "Path" -> path,
    "Roles" -> roles
  )
}
