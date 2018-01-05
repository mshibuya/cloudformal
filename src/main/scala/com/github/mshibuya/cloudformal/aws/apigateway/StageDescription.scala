package com.github.mshibuya.cloudformal.aws.apigateway

import com.github.mshibuya.cloudformal.model._

import scala.collection.immutable.ListMap

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription.html
 */

case class StageDescription(
    cacheClusterEnabled: Option[Boolean] = None,
    cacheClusterSize: Option[String] = None,
    cacheDataEncrypted: Option[Boolean] = None,
    cacheTtlInSeconds: Option[Int] = None,
    cachingEnabled: Option[Boolean] = None,
    clientCertificateId: Option[String] = None,
    dataTraceEnabled: Option[Boolean] = None,
    description: Option[String] = None,
    documentationVersion: Option[String] = None,
    loggingLevel: Option[String] = None,
    methodSettings: Option[Seq[MethodSetting]] = None,
    metricsEnabled: Option[Boolean] = None,
    throttlingBurstLimit: Option[Int] = None,
    throttlingRateLimit: Option[Double] = None,
    variables: Option[ListMap[String, String]] = None) extends Renderable {
  def render: Formattable = Formattable.opt(
    "CacheClusterEnabled" -> cacheClusterEnabled.map(Formattable(_)),
    "CacheClusterSize" -> cacheClusterSize.map(Formattable(_)),
    "CacheDataEncrypted" -> cacheDataEncrypted.map(Formattable(_)),
    "CacheTtlInSeconds" -> cacheTtlInSeconds.map(Formattable(_)),
    "CachingEnabled" -> cachingEnabled.map(Formattable(_)),
    "ClientCertificateId" -> clientCertificateId.map(Formattable(_)),
    "DataTraceEnabled" -> dataTraceEnabled.map(Formattable(_)),
    "Description" -> description.map(Formattable(_)),
    "DocumentationVersion" -> documentationVersion.map(Formattable(_)),
    "LoggingLevel" -> loggingLevel.map(Formattable(_)),
    "MethodSettings" -> methodSettings.map(Formattable(_)),
    "MetricsEnabled" -> metricsEnabled.map(Formattable(_)),
    "ThrottlingBurstLimit" -> throttlingBurstLimit.map(Formattable(_)),
    "ThrottlingRateLimit" -> throttlingRateLimit.map(Formattable(_)),
    "Variables" -> variables.map(Formattable(_))
  )
}
