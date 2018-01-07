package com.github.mshibuya.cloudformal.aws.apigateway

import com.github.mshibuya.cloudformal.model._

import scala.collection.immutable.ListMap

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apitgateway-method-integration-integrationresponse.html
 */

case class IntegrationResponse(
    contentHandling: Property[String] = Empty,
    responseParameters: Property[ListMap[String, String]] = Empty,
    responseTemplates: Property[ListMap[String, String]] = Empty,
    selectionPattern: Property[String] = Empty,
    statusCode: NonEmptyProperty[String]) extends Renderable {
  def render: Formattable = Formattable.withProperties(
    "ContentHandling" -> contentHandling,
    "ResponseParameters" -> responseParameters,
    "ResponseTemplates" -> responseTemplates,
    "SelectionPattern" -> selectionPattern,
    "StatusCode" -> statusCode
  )
}
