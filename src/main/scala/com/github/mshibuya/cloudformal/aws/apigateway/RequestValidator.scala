package com.github.mshibuya.cloudformal.aws.apigateway

import com.github.mshibuya.cloudformal.model
import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-requestvalidator.html
 */

trait RequestValidator extends model.Resource {
  val resourceTypeName = "AWS::ApiGateway::RequestValidator"

  def name: Property[String] = Empty
  def restApiId: NonEmptyProperty[String]
  def validateRequestBody: Property[Boolean] = Empty
  def validateRequestParameters: Property[Boolean] = Empty

  def resourceProperties: FormattableMap = Formattable.withProperties(
    "Name" -> name,
    "RestApiId" -> restApiId,
    "ValidateRequestBody" -> validateRequestBody,
    "ValidateRequestParameters" -> validateRequestParameters
  )
}
