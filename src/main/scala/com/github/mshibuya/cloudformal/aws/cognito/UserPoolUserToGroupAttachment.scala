package com.github.mshibuya.cloudformal.aws.cognito

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolusertogroupattachment.html
 */

trait UserPoolUserToGroupAttachment extends Resource {
  val resourceTypeName = "AWS::Cognito::UserPoolUserToGroupAttachment"

  def groupName: String
  def userPoolId: String
  def username: String

  def resourceProperties: FormattableMap = Formattable.opt(
    "GroupName" -> Some(Formattable(groupName)),
    "UserPoolId" -> Some(Formattable(userPoolId)),
    "Username" -> Some(Formattable(username))
  )
}
