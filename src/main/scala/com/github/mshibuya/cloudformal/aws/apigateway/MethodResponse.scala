package com.github.mshibuya.cloudformal.aws.apigateway

import com.github.mshibuya.cloudformal.model._

import scala.collection.immutable.ListMap

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apitgateway-method-methodresponse.html
 */

case class MethodResponse(
    responseModels: Option[ListMap[String, String]] = None,
    responseParameters: Option[ListMap[String, Boolean]] = None,
    statusCode: String) extends Renderable {
  def render: Formattable = Formattable.opt(
    "ResponseModels" -> responseModels.map(Formattable(_)),
    "ResponseParameters" -> responseParameters.map(Formattable(_)),
    "StatusCode" -> Some(Formattable(statusCode))
  )
}
