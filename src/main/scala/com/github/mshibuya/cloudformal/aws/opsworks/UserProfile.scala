package com.github.mshibuya.cloudformal.aws.opsworks

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-userprofile.html
 */

trait UserProfile extends Resource {
  val resourceTypeName = "AWS::OpsWorks::UserProfile"

  def allowSelfManagement: Option[Boolean] = None
  def iamUserArn: String
  def sshPublicKey: Option[String] = None
  def sshUsername: Option[String] = None

  def resourceProperties: FormattableMap = Formattable.opt(
    "AllowSelfManagement" -> allowSelfManagement.map(Formattable(_)),
    "IamUserArn" -> Some(Formattable(iamUserArn)),
    "SshPublicKey" -> sshPublicKey.map(Formattable(_)),
    "SshUsername" -> sshUsername.map(Formattable(_))
  )
}
