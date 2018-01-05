package com.github.mshibuya.cloudformal.aws.cognito

import argonaut.Json
import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-identitypool.html
 */

trait IdentityPool extends Resource {
  val resourceTypeName = "AWS::Cognito::IdentityPool"

  def pushSync: Option[PushSync] = None
  def cognitoIdentityProviders: Option[Seq[CognitoIdentityProvider]] = None
  def cognitoEvents: Option[Json] = None
  def developerProviderName: Option[String] = None
  def cognitoStreams: Option[CognitoStreams] = None
  def identityPoolName: Option[String] = None
  def allowUnauthenticatedIdentities: Boolean
  def supportedLoginProviders: Option[Json] = None
  def samlProviderARNs: Option[Seq[String]] = None
  def openIdConnectProviderARNs: Option[Seq[String]] = None

  def resourceProperties: FormattableMap = Formattable.opt(
    "PushSync" -> pushSync.map(Formattable(_)),
    "CognitoIdentityProviders" -> cognitoIdentityProviders.map(Formattable(_)),
    "CognitoEvents" -> cognitoEvents.map(Formattable(_)),
    "DeveloperProviderName" -> developerProviderName.map(Formattable(_)),
    "CognitoStreams" -> cognitoStreams.map(Formattable(_)),
    "IdentityPoolName" -> identityPoolName.map(Formattable(_)),
    "AllowUnauthenticatedIdentities" -> Some(Formattable(allowUnauthenticatedIdentities)),
    "SupportedLoginProviders" -> supportedLoginProviders.map(Formattable(_)),
    "SamlProviderARNs" -> samlProviderARNs.map(Formattable(_)),
    "OpenIdConnectProviderARNs" -> openIdConnectProviderARNs.map(Formattable(_))
  )
}
