package com.github.mshibuya.cloudformal.aws.apigateway

import com.github.mshibuya.cloudformal.model
import com.github.mshibuya.cloudformal.model._

import scala.collection.immutable.ListMap

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-method.html
 */

trait Method extends model.Resource {
  val resourceTypeName = "AWS::ApiGateway::Method"

  def apiKeyRequired: Option[Boolean] = None
  def authorizationType: Option[String] = None
  def authorizerId: Option[String] = None
  def httpMethod: String
  def integration: Option[Integration] = None
  def methodResponses: Option[Seq[MethodResponse]] = None
  def operationName: Option[String] = None
  def requestModels: Option[ListMap[String, String]] = None
  def requestParameters: Option[ListMap[String, Boolean]] = None
  def requestValidatorId: Option[String] = None
  def resourceId: String
  def restApiId: String

  def resourceProperties: FormattableMap = Formattable.opt(
    "ApiKeyRequired" -> apiKeyRequired.map(Formattable(_)),
    "AuthorizationType" -> authorizationType.map(Formattable(_)),
    "AuthorizerId" -> authorizerId.map(Formattable(_)),
    "HttpMethod" -> Some(Formattable(httpMethod)),
    "Integration" -> integration.map(Formattable(_)),
    "MethodResponses" -> methodResponses.map(Formattable(_)),
    "OperationName" -> operationName.map(Formattable(_)),
    "RequestModels" -> requestModels.map(Formattable(_)),
    "RequestParameters" -> requestParameters.map(Formattable(_)),
    "RequestValidatorId" -> requestValidatorId.map(Formattable(_)),
    "ResourceId" -> Some(Formattable(resourceId)),
    "RestApiId" -> Some(Formattable(restApiId))
  )
}
