package com.github.mshibuya.cloudformal.aws.cognito

import com.github.mshibuya.cloudformal.model._
import com.github.mshibuya.cloudformal.model.policy._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolusertogroupattachment.html
 */

trait UserPoolUserToGroupAttachment extends Resource with Resource.WithDeletionPolicy {
  val resourceTypeName = "AWS::Cognito::UserPoolUserToGroupAttachment"

  def groupName: NonEmptyProperty[String]
  def userPoolId: NonEmptyProperty[String]
  def username: NonEmptyProperty[String]

  def resourceProperties: FormattableMap = Formattable.withProperties(
    "GroupName" -> groupName,
    "UserPoolId" -> userPoolId,
    "Username" -> username
  )
}
