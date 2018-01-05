package com.github.mshibuya.cloudformal.aws.apigateway

import com.github.mshibuya.cloudformal.model._

import scala.collection.immutable.ListMap

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apitgateway-method-integration.html
 */

case class Integration(
    cacheKeyParameters: Option[Seq[String]] = None,
    cacheNamespace: Option[String] = None,
    contentHandling: Option[String] = None,
    credentials: Option[String] = None,
    integrationHttpMethod: Option[String] = None,
    integrationResponses: Option[Seq[IntegrationResponse]] = None,
    passthroughBehavior: Option[String] = None,
    requestParameters: Option[ListMap[String, String]] = None,
    requestTemplates: Option[ListMap[String, String]] = None,
    `type`: Option[String] = None,
    uri: Option[String] = None) extends Renderable {
  def render: Formattable = Formattable.opt(
    "CacheKeyParameters" -> cacheKeyParameters.map(Formattable(_)),
    "CacheNamespace" -> cacheNamespace.map(Formattable(_)),
    "ContentHandling" -> contentHandling.map(Formattable(_)),
    "Credentials" -> credentials.map(Formattable(_)),
    "IntegrationHttpMethod" -> integrationHttpMethod.map(Formattable(_)),
    "IntegrationResponses" -> integrationResponses.map(Formattable(_)),
    "PassthroughBehavior" -> passthroughBehavior.map(Formattable(_)),
    "RequestParameters" -> requestParameters.map(Formattable(_)),
    "RequestTemplates" -> requestTemplates.map(Formattable(_)),
    "Type" -> `type`.map(Formattable(_)),
    "Uri" -> uri.map(Formattable(_))
  )
}
