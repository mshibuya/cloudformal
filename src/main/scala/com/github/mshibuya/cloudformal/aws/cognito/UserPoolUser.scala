package com.github.mshibuya.cloudformal.aws.cognito

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpooluser.html
 */

trait UserPoolUser extends Resource {
  val resourceTypeName = "AWS::Cognito::UserPoolUser"

  def validationData: Option[Seq[AttributeType]] = None
  def userPoolId: String
  def username: Option[String] = None
  def messageAction: Option[String] = None
  def desiredDeliveryMediums: Option[Seq[String]] = None
  def forceAliasCreation: Option[Boolean] = None
  def userAttributes: Option[Seq[AttributeType]] = None

  def resourceProperties: FormattableMap = Formattable.opt(
    "ValidationData" -> validationData.map(Formattable(_)),
    "UserPoolId" -> Some(Formattable(userPoolId)),
    "Username" -> username.map(Formattable(_)),
    "MessageAction" -> messageAction.map(Formattable(_)),
    "DesiredDeliveryMediums" -> desiredDeliveryMediums.map(Formattable(_)),
    "ForceAliasCreation" -> forceAliasCreation.map(Formattable(_)),
    "UserAttributes" -> userAttributes.map(Formattable(_))
  )
}
