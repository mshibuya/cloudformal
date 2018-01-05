package com.github.mshibuya.cloudformal.aws.cognito

import argonaut.Json
import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html
 */

trait UserPool extends Resource {
  val resourceTypeName = "AWS::Cognito::UserPool"

  def userPoolTags: Option[Json] = None
  def policies: Option[Policies] = None
  def mfaConfiguration: Option[String] = None
  def schema: Option[Seq[SchemaAttribute]] = None
  def adminCreateUserConfig: Option[AdminCreateUserConfig] = None
  def smsAuthenticationMessage: Option[String] = None
  def userPoolName: Option[String] = None
  def smsVerificationMessage: Option[String] = None
  def emailConfiguration: Option[EmailConfiguration] = None
  def smsConfiguration: Option[SmsConfiguration] = None
  def aliasAttributes: Option[Seq[String]] = None
  def emailVerificationSubject: Option[String] = None
  def lambdaConfig: Option[LambdaConfig] = None
  def autoVerifiedAttributes: Option[Seq[String]] = None
  def deviceConfiguration: Option[DeviceConfiguration] = None
  def emailVerificationMessage: Option[String] = None

  def resourceProperties: FormattableMap = Formattable.opt(
    "UserPoolTags" -> userPoolTags.map(Formattable(_)),
    "Policies" -> policies.map(Formattable(_)),
    "MfaConfiguration" -> mfaConfiguration.map(Formattable(_)),
    "Schema" -> schema.map(Formattable(_)),
    "AdminCreateUserConfig" -> adminCreateUserConfig.map(Formattable(_)),
    "SmsAuthenticationMessage" -> smsAuthenticationMessage.map(Formattable(_)),
    "UserPoolName" -> userPoolName.map(Formattable(_)),
    "SmsVerificationMessage" -> smsVerificationMessage.map(Formattable(_)),
    "EmailConfiguration" -> emailConfiguration.map(Formattable(_)),
    "SmsConfiguration" -> smsConfiguration.map(Formattable(_)),
    "AliasAttributes" -> aliasAttributes.map(Formattable(_)),
    "EmailVerificationSubject" -> emailVerificationSubject.map(Formattable(_)),
    "LambdaConfig" -> lambdaConfig.map(Formattable(_)),
    "AutoVerifiedAttributes" -> autoVerifiedAttributes.map(Formattable(_)),
    "DeviceConfiguration" -> deviceConfiguration.map(Formattable(_)),
    "EmailVerificationMessage" -> emailVerificationMessage.map(Formattable(_))
  )
}
