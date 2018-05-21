package com.github.mshibuya.cloudformal.aws.appsync

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-graphqlapi-openidconnectconfig.html
 */

case class OpenIDConnectConfig(
    issuer: Property[String] = Empty,
    clientId: Property[String] = Empty,
    authTTL: Property[Double] = Empty,
    iatTTL: Property[Double] = Empty) extends Expression[OpenIDConnectConfig] {
  def render: Formattable = Value(
    "Issuer" -> issuer,
    "ClientId" -> clientId,
    "AuthTTL" -> authTTL,
    "IatTTL" -> iatTTL
  )
}
