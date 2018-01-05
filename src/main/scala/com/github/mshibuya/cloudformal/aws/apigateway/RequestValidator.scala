package com.github.mshibuya.cloudformal.aws.apigateway

import com.github.mshibuya.cloudformal.model
import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-requestvalidator.html
 */

trait RequestValidator extends model.Resource {
  val resourceTypeName = "AWS::ApiGateway::RequestValidator"

  def name: Option[String] = None
  def restApiId: String
  def validateRequestBody: Option[Boolean] = None
  def validateRequestParameters: Option[Boolean] = None

  def resourceProperties: FormattableMap = Formattable.opt(
    "Name" -> name.map(Formattable(_)),
    "RestApiId" -> Some(Formattable(restApiId)),
    "ValidateRequestBody" -> validateRequestBody.map(Formattable(_)),
    "ValidateRequestParameters" -> validateRequestParameters.map(Formattable(_))
  )
}
