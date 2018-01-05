package com.github.mshibuya.cloudformal.aws.apigateway

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apitgateway-stage-methodsetting.html
 */

case class MethodSetting(
    cacheDataEncrypted: Option[Boolean] = None,
    cacheTtlInSeconds: Option[Int] = None,
    cachingEnabled: Option[Boolean] = None,
    dataTraceEnabled: Option[Boolean] = None,
    httpMethod: Option[String] = None,
    loggingLevel: Option[String] = None,
    metricsEnabled: Option[Boolean] = None,
    resourcePath: Option[String] = None,
    throttlingBurstLimit: Option[Int] = None,
    throttlingRateLimit: Option[Double] = None) extends Renderable {
  def render: Formattable = Formattable.opt(
    "CacheDataEncrypted" -> cacheDataEncrypted.map(Formattable(_)),
    "CacheTtlInSeconds" -> cacheTtlInSeconds.map(Formattable(_)),
    "CachingEnabled" -> cachingEnabled.map(Formattable(_)),
    "DataTraceEnabled" -> dataTraceEnabled.map(Formattable(_)),
    "HttpMethod" -> httpMethod.map(Formattable(_)),
    "LoggingLevel" -> loggingLevel.map(Formattable(_)),
    "MetricsEnabled" -> metricsEnabled.map(Formattable(_)),
    "ResourcePath" -> resourcePath.map(Formattable(_)),
    "ThrottlingBurstLimit" -> throttlingBurstLimit.map(Formattable(_)),
    "ThrottlingRateLimit" -> throttlingRateLimit.map(Formattable(_))
  )
}
