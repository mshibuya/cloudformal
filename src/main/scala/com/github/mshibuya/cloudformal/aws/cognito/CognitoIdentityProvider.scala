package com.github.mshibuya.cloudformal.aws.cognito

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-identitypool-cognitoidentityprovider.html
 */

case class CognitoIdentityProvider(
    serverSideTokenCheck: Option[Boolean] = None,
    providerName: Option[String] = None,
    clientId: Option[String] = None) extends Renderable {
  def render: Formattable = Formattable.opt(
    "ServerSideTokenCheck" -> serverSideTokenCheck.map(Formattable(_)),
    "ProviderName" -> providerName.map(Formattable(_)),
    "ClientId" -> clientId.map(Formattable(_))
  )
}
