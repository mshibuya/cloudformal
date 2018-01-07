package com.github.mshibuya.cloudformal.aws.cognito

import argonaut.Json
import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html
 */

trait UserPool extends Resource {
  val resourceTypeName = "AWS::Cognito::UserPool"

  def providerNameAttribute: Expression[String] = Fn.GetAtt(logicalId, "ProviderName")
  def providerURLAttribute: Expression[String] = Fn.GetAtt(logicalId, "ProviderURL")
  def arnAttribute: Expression[String] = Fn.GetAtt(logicalId, "Arn")

  def userPoolTags: Property[Json] = Empty
  def policies: Property[Policies] = Empty
  def mfaConfiguration: Property[String] = Empty
  def schema: Property[Seq[SchemaAttribute]] = Empty
  def adminCreateUserConfig: Property[AdminCreateUserConfig] = Empty
  def smsAuthenticationMessage: Property[String] = Empty
  def userPoolName: Property[String] = Empty
  def smsVerificationMessage: Property[String] = Empty
  def emailConfiguration: Property[EmailConfiguration] = Empty
  def smsConfiguration: Property[SmsConfiguration] = Empty
  def aliasAttributes: Property[Seq[String]] = Empty
  def emailVerificationSubject: Property[String] = Empty
  def lambdaConfig: Property[LambdaConfig] = Empty
  def autoVerifiedAttributes: Property[Seq[String]] = Empty
  def deviceConfiguration: Property[DeviceConfiguration] = Empty
  def emailVerificationMessage: Property[String] = Empty

  def resourceProperties: FormattableMap = Formattable.withProperties(
    "UserPoolTags" -> userPoolTags,
    "Policies" -> policies,
    "MfaConfiguration" -> mfaConfiguration,
    "Schema" -> schema,
    "AdminCreateUserConfig" -> adminCreateUserConfig,
    "SmsAuthenticationMessage" -> smsAuthenticationMessage,
    "UserPoolName" -> userPoolName,
    "SmsVerificationMessage" -> smsVerificationMessage,
    "EmailConfiguration" -> emailConfiguration,
    "SmsConfiguration" -> smsConfiguration,
    "AliasAttributes" -> aliasAttributes,
    "EmailVerificationSubject" -> emailVerificationSubject,
    "LambdaConfig" -> lambdaConfig,
    "AutoVerifiedAttributes" -> autoVerifiedAttributes,
    "DeviceConfiguration" -> deviceConfiguration,
    "EmailVerificationMessage" -> emailVerificationMessage
  )
}
