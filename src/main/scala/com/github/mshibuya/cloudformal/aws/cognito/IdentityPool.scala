package com.github.mshibuya.cloudformal.aws.cognito

import argonaut.Json
import com.github.mshibuya.cloudformal.model._
import com.github.mshibuya.cloudformal.model.policy._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-identitypool.html
 */

trait IdentityPool extends Resource with Resource.WithDeletionPolicy {
  val resourceTypeName = "AWS::Cognito::IdentityPool"

  def nameAttribute: Expression[String] = Fn.GetAtt(logicalId, "Name")

  def pushSync: Property[PushSync] = Empty
  def cognitoIdentityProviders: Property[Seq[CognitoIdentityProvider]] = Empty
  def cognitoEvents: Property[Json] = Empty
  def developerProviderName: Property[String] = Empty
  def cognitoStreams: Property[CognitoStreams] = Empty
  def identityPoolName: Property[String] = Empty
  def allowUnauthenticatedIdentities: NonEmptyProperty[Boolean]
  def supportedLoginProviders: Property[Json] = Empty
  def samlProviderARNs: Property[Seq[String]] = Empty
  def openIdConnectProviderARNs: Property[Seq[String]] = Empty

  def resourceProperties: FormattableMap = Formattable.withProperties(
    "PushSync" -> pushSync,
    "CognitoIdentityProviders" -> cognitoIdentityProviders,
    "CognitoEvents" -> cognitoEvents,
    "DeveloperProviderName" -> developerProviderName,
    "CognitoStreams" -> cognitoStreams,
    "IdentityPoolName" -> identityPoolName,
    "AllowUnauthenticatedIdentities" -> allowUnauthenticatedIdentities,
    "SupportedLoginProviders" -> supportedLoginProviders,
    "SamlProviderARNs" -> samlProviderARNs,
    "OpenIdConnectProviderARNs" -> openIdConnectProviderARNs
  )
}
