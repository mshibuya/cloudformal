package com.github.mshibuya.cloudformal.aws.apigateway

import com.github.mshibuya.cloudformal.model
import com.github.mshibuya.cloudformal.model._

import scala.collection.immutable.ListMap

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-method.html
 */

trait Method extends model.Resource {
  val resourceTypeName = "AWS::ApiGateway::Method"

  def apiKeyRequired: Property[Boolean] = Empty
  def authorizationType: Property[String] = Empty
  def authorizerId: Property[String] = Empty
  def httpMethod: NonEmptyProperty[String]
  def integration: Property[Integration] = Empty
  def methodResponses: Property[Seq[MethodResponse]] = Empty
  def operationName: Property[String] = Empty
  def requestModels: Property[ListMap[String, String]] = Empty
  def requestParameters: Property[ListMap[String, Boolean]] = Empty
  def requestValidatorId: Property[String] = Empty
  def resourceId: NonEmptyProperty[String]
  def restApiId: NonEmptyProperty[String]

  def resourceProperties: FormattableMap = Formattable.withProperties(
    "ApiKeyRequired" -> apiKeyRequired,
    "AuthorizationType" -> authorizationType,
    "AuthorizerId" -> authorizerId,
    "HttpMethod" -> httpMethod,
    "Integration" -> integration,
    "MethodResponses" -> methodResponses,
    "OperationName" -> operationName,
    "RequestModels" -> requestModels,
    "RequestParameters" -> requestParameters,
    "RequestValidatorId" -> requestValidatorId,
    "ResourceId" -> resourceId,
    "RestApiId" -> restApiId
  )
}
