package com.github.mshibuya.cloudformal.aws.apigateway

import com.github.mshibuya.cloudformal.model
import com.github.mshibuya.cloudformal.model._
import com.github.mshibuya.cloudformal.model.policy._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-authorizer.html
 */

trait Authorizer extends model.Resource with model.Resource.WithDeletionPolicy {
  val resourceTypeName = "AWS::ApiGateway::Authorizer"

  def authType: Property[String] = Empty
  def authorizerCredentials: Property[String] = Empty
  def authorizerResultTtlInSeconds: Property[Int] = Empty
  def authorizerUri: Property[String] = Empty
  def identitySource: Property[String] = Empty
  def identityValidationExpression: Property[String] = Empty
  def name: Property[String] = Empty
  def providerARNs: Property[Seq[String]] = Empty
  def restApiId: NonEmptyProperty[String]
  def `type`: Property[String] = Empty

  def resourceProperties: FormattableMap = Formattable.withProperties(
    "AuthType" -> authType,
    "AuthorizerCredentials" -> authorizerCredentials,
    "AuthorizerResultTtlInSeconds" -> authorizerResultTtlInSeconds,
    "AuthorizerUri" -> authorizerUri,
    "IdentitySource" -> identitySource,
    "IdentityValidationExpression" -> identityValidationExpression,
    "Name" -> name,
    "ProviderARNs" -> providerARNs,
    "RestApiId" -> restApiId,
    "Type" -> `type`
  )
}
