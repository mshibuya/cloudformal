package com.github.mshibuya.cloudformal.aws.opsworks

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-userprofile.html
 */

trait UserProfile extends Resource {
  val resourceTypeName = "AWS::OpsWorks::UserProfile"

  def sshUsernameAttribute: Expression[String] = Fn.GetAtt(logicalId, "SshUsername")

  def allowSelfManagement: Property[Boolean] = Empty
  def iamUserArn: NonEmptyProperty[String]
  def sshPublicKey: Property[String] = Empty
  def sshUsername: Property[String] = Empty

  def resourceProperties: FormattableMap = Formattable.withProperties(
    "AllowSelfManagement" -> allowSelfManagement,
    "IamUserArn" -> iamUserArn,
    "SshPublicKey" -> sshPublicKey,
    "SshUsername" -> sshUsername
  )
}
