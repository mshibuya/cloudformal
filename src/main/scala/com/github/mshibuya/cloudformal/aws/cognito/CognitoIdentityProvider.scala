package com.github.mshibuya.cloudformal.aws.cognito

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-identitypool-cognitoidentityprovider.html
 */

case class CognitoIdentityProvider(
    serverSideTokenCheck: Property[Boolean] = Empty,
    providerName: Property[String] = Empty,
    clientId: Property[String] = Empty) extends Expression[CognitoIdentityProvider] {
  def render: Formattable = Value(
    "ServerSideTokenCheck" -> serverSideTokenCheck,
    "ProviderName" -> providerName,
    "ClientId" -> clientId
  )
}
