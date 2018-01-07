package com.github.mshibuya.cloudformal.aws.cognito

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpooluser.html
 */

trait UserPoolUser extends Resource {
  val resourceTypeName = "AWS::Cognito::UserPoolUser"

  def validationData: Property[Seq[AttributeType]] = Empty
  def userPoolId: NonEmptyProperty[String]
  def username: Property[String] = Empty
  def messageAction: Property[String] = Empty
  def desiredDeliveryMediums: Property[Seq[String]] = Empty
  def forceAliasCreation: Property[Boolean] = Empty
  def userAttributes: Property[Seq[AttributeType]] = Empty

  def resourceProperties: FormattableMap = Formattable.withProperties(
    "ValidationData" -> validationData,
    "UserPoolId" -> userPoolId,
    "Username" -> username,
    "MessageAction" -> messageAction,
    "DesiredDeliveryMediums" -> desiredDeliveryMediums,
    "ForceAliasCreation" -> forceAliasCreation,
    "UserAttributes" -> userAttributes
  )
}
