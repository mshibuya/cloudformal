package com.github.mshibuya.cloudformal.aws.apigateway

import com.github.mshibuya.cloudformal.model._

import scala.collection.immutable.ListMap

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apitgateway-method-integration.html
 */

case class Integration(
    cacheKeyParameters: Property[Seq[String]] = Empty,
    cacheNamespace: Property[String] = Empty,
    contentHandling: Property[String] = Empty,
    credentials: Property[String] = Empty,
    integrationHttpMethod: Property[String] = Empty,
    integrationResponses: Property[Seq[IntegrationResponse]] = Empty,
    passthroughBehavior: Property[String] = Empty,
    requestParameters: Property[ListMap[String, String]] = Empty,
    requestTemplates: Property[ListMap[String, String]] = Empty,
    `type`: Property[String] = Empty,
    uri: Property[String] = Empty) extends Expression[Integration] {
  def render: Formattable = Value(
    "CacheKeyParameters" -> cacheKeyParameters,
    "CacheNamespace" -> cacheNamespace,
    "ContentHandling" -> contentHandling,
    "Credentials" -> credentials,
    "IntegrationHttpMethod" -> integrationHttpMethod,
    "IntegrationResponses" -> integrationResponses,
    "PassthroughBehavior" -> passthroughBehavior,
    "RequestParameters" -> requestParameters,
    "RequestTemplates" -> requestTemplates,
    "Type" -> `type`,
    "Uri" -> uri
  )
}
