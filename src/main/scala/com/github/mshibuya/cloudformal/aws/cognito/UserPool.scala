package com.github.mshibuya.cloudformal.aws.cognito

import argonaut.Json
import com.github.mshibuya.cloudformal.model._
import com.github.mshibuya.cloudformal.model.policy._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html
 */

trait UserPool extends Resource[UserPool] with Resource.WithDeletionPolicy {
  val resourceTypeName = "AWS::Cognito::UserPool"

  object attributes {
    val providerName: Expression[String] = Fn.GetAtt(logicalId, "ProviderName")
    val providerURL: Expression[String] = Fn.GetAtt(logicalId, "ProviderURL")
    val arn: Expression[String] = Fn.GetAtt(logicalId, "Arn")
  }

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
  def usernameAttributes: Property[Seq[String]] = Empty
  def autoVerifiedAttributes: Property[Seq[String]] = Empty
  def deviceConfiguration: Property[DeviceConfiguration] = Empty
  def emailVerificationMessage: Property[String] = Empty

  def render(): MapValue[_] = Value(
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
    "UsernameAttributes" -> usernameAttributes,
    "AutoVerifiedAttributes" -> autoVerifiedAttributes,
    "DeviceConfiguration" -> deviceConfiguration,
    "EmailVerificationMessage" -> emailVerificationMessage
  )
}
