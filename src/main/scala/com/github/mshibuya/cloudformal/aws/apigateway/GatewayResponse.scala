package com.github.mshibuya.cloudformal.aws.apigateway

import com.github.mshibuya.cloudformal.model
import com.github.mshibuya.cloudformal.model._

import scala.collection.immutable.ListMap

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-gatewayresponse.html
 */

trait GatewayResponse extends model.Resource {
  val resourceTypeName = "AWS::ApiGateway::GatewayResponse"

  def responseParameters: Property[ListMap[String, String]] = Empty
  def responseTemplates: Property[ListMap[String, String]] = Empty
  def responseType: NonEmptyProperty[String]
  def restApiId: NonEmptyProperty[String]
  def statusCode: Property[String] = Empty

  def resourceProperties: FormattableMap = Formattable.withProperties(
    "ResponseParameters" -> responseParameters,
    "ResponseTemplates" -> responseTemplates,
    "ResponseType" -> responseType,
    "RestApiId" -> restApiId,
    "StatusCode" -> statusCode
  )
}
