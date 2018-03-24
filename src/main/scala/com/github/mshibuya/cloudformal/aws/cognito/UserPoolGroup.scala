package com.github.mshibuya.cloudformal.aws.cognito

import com.github.mshibuya.cloudformal.model._
import com.github.mshibuya.cloudformal.model.policy._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolgroup.html
 */

trait UserPoolGroup extends Resource[UserPoolGroup] with Resource.WithDeletionPolicy {
  val resourceTypeName = "AWS::Cognito::UserPoolGroup"

  def groupName: Property[String] = Empty
  def description: Property[String] = Empty
  def userPoolId: NonEmptyProperty[String]
  def precedence: Property[Double] = Empty
  def roleArn: Property[String] = Empty

  def render(): MapValue[_] = Value(
    "GroupName" -> groupName,
    "Description" -> description,
    "UserPoolId" -> userPoolId,
    "Precedence" -> precedence,
    "RoleArn" -> roleArn
  )
}
