package com.github.mshibuya.cloudformal.aws.opsworks

import com.github.mshibuya.cloudformal.model._
import com.github.mshibuya.cloudformal.model.policy._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-userprofile.html
 */

trait UserProfile extends Resource[UserProfile] with Resource.WithDeletionPolicy {
  val resourceTypeName = "AWS::OpsWorks::UserProfile"

  object attributes {
    val sshUsername: Expression[String] = Fn.GetAtt(logicalId, "SshUsername")
  }

  def allowSelfManagement: Property[Boolean] = Empty
  def iamUserArn: NonEmptyProperty[String]
  def sshPublicKey: Property[String] = Empty
  def sshUsername: Property[String] = Empty

  def render(): MapValue[_] = Value(
    "AllowSelfManagement" -> allowSelfManagement,
    "IamUserArn" -> iamUserArn,
    "SshPublicKey" -> sshPublicKey,
    "SshUsername" -> sshUsername
  )
}
