package com.github.mshibuya.cloudformal.aws.cognito

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolgroup.html
 */

trait UserPoolGroup extends Resource {
  val resourceTypeName = "AWS::Cognito::UserPoolGroup"

  def groupName: Option[String] = None
  def description: Option[String] = None
  def userPoolId: String
  def precedence: Option[Double] = None
  def roleArn: Option[String] = None

  def resourceProperties: FormattableMap = Formattable.opt(
    "GroupName" -> groupName.map(Formattable(_)),
    "Description" -> description.map(Formattable(_)),
    "UserPoolId" -> Some(Formattable(userPoolId)),
    "Precedence" -> precedence.map(Formattable(_)),
    "RoleArn" -> roleArn.map(Formattable(_))
  )
}
