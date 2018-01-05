package com.github.mshibuya.cloudformal.aws.apigateway

import com.github.mshibuya.cloudformal.model._

import scala.collection.immutable.ListMap

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apitgateway-method-integration-integrationresponse.html
 */

case class IntegrationResponse(
    contentHandling: Option[String] = None,
    responseParameters: Option[ListMap[String, String]] = None,
    responseTemplates: Option[ListMap[String, String]] = None,
    selectionPattern: Option[String] = None,
    statusCode: String) extends Renderable {
  def render: Formattable = Formattable.opt(
    "ContentHandling" -> contentHandling.map(Formattable(_)),
    "ResponseParameters" -> responseParameters.map(Formattable(_)),
    "ResponseTemplates" -> responseTemplates.map(Formattable(_)),
    "SelectionPattern" -> selectionPattern.map(Formattable(_)),
    "StatusCode" -> Some(Formattable(statusCode))
  )
}
