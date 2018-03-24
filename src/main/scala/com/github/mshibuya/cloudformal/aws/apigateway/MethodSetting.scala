package com.github.mshibuya.cloudformal.aws.apigateway

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apitgateway-stage-methodsetting.html
 */

case class MethodSetting(
    cacheDataEncrypted: Property[Boolean] = Empty,
    cacheTtlInSeconds: Property[Int] = Empty,
    cachingEnabled: Property[Boolean] = Empty,
    dataTraceEnabled: Property[Boolean] = Empty,
    httpMethod: Property[String] = Empty,
    loggingLevel: Property[String] = Empty,
    metricsEnabled: Property[Boolean] = Empty,
    resourcePath: Property[String] = Empty,
    throttlingBurstLimit: Property[Int] = Empty,
    throttlingRateLimit: Property[Double] = Empty) extends Expression[MethodSetting] {
  def render: Formattable = Value(
    "CacheDataEncrypted" -> cacheDataEncrypted,
    "CacheTtlInSeconds" -> cacheTtlInSeconds,
    "CachingEnabled" -> cachingEnabled,
    "DataTraceEnabled" -> dataTraceEnabled,
    "HttpMethod" -> httpMethod,
    "LoggingLevel" -> loggingLevel,
    "MetricsEnabled" -> metricsEnabled,
    "ResourcePath" -> resourcePath,
    "ThrottlingBurstLimit" -> throttlingBurstLimit,
    "ThrottlingRateLimit" -> throttlingRateLimit
  )
}
