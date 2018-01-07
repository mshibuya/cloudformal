package com.github.mshibuya.cloudformal.aws.apigateway

import com.github.mshibuya.cloudformal.model._

import scala.collection.immutable.ListMap

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apitgateway-method-methodresponse.html
 */

case class MethodResponse(
    responseModels: Property[ListMap[String, String]] = Empty,
    responseParameters: Property[ListMap[String, Boolean]] = Empty,
    statusCode: NonEmptyProperty[String]) extends Renderable {
  def render: Formattable = Formattable.withProperties(
    "ResponseModels" -> responseModels,
    "ResponseParameters" -> responseParameters,
    "StatusCode" -> statusCode
  )
}
