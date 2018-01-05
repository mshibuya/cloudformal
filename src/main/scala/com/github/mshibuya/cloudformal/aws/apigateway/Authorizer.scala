package com.github.mshibuya.cloudformal.aws.apigateway

import com.github.mshibuya.cloudformal.model
import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-authorizer.html
 */

trait Authorizer extends model.Resource {
  val resourceTypeName = "AWS::ApiGateway::Authorizer"

  def authType: Option[String] = None
  def authorizerCredentials: Option[String] = None
  def authorizerResultTtlInSeconds: Option[Int] = None
  def authorizerUri: Option[String] = None
  def identitySource: Option[String] = None
  def identityValidationExpression: Option[String] = None
  def name: Option[String] = None
  def providerARNs: Option[Seq[String]] = None
  def restApiId: String
  def `type`: Option[String] = None

  def resourceProperties: FormattableMap = Formattable.opt(
    "AuthType" -> authType.map(Formattable(_)),
    "AuthorizerCredentials" -> authorizerCredentials.map(Formattable(_)),
    "AuthorizerResultTtlInSeconds" -> authorizerResultTtlInSeconds.map(Formattable(_)),
    "AuthorizerUri" -> authorizerUri.map(Formattable(_)),
    "IdentitySource" -> identitySource.map(Formattable(_)),
    "IdentityValidationExpression" -> identityValidationExpression.map(Formattable(_)),
    "Name" -> name.map(Formattable(_)),
    "ProviderARNs" -> providerARNs.map(Formattable(_)),
    "RestApiId" -> Some(Formattable(restApiId)),
    "Type" -> `type`.map(Formattable(_))
  )
}
