package com.github.mshibuya.cloudformal.aws.apigateway

import com.github.mshibuya.cloudformal.model
import com.github.mshibuya.cloudformal.model._

import scala.collection.immutable.ListMap

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-gatewayresponse.html
 */

trait GatewayResponse extends model.Resource {
  val resourceTypeName = "AWS::ApiGateway::GatewayResponse"

  def responseParameters: Option[ListMap[String, String]] = None
  def responseTemplates: Option[ListMap[String, String]] = None
  def responseType: String
  def restApiId: String
  def statusCode: Option[String] = None

  def resourceProperties: FormattableMap = Formattable.opt(
    "ResponseParameters" -> responseParameters.map(Formattable(_)),
    "ResponseTemplates" -> responseTemplates.map(Formattable(_)),
    "ResponseType" -> Some(Formattable(responseType)),
    "RestApiId" -> Some(Formattable(restApiId)),
    "StatusCode" -> statusCode.map(Formattable(_))
  )
}
