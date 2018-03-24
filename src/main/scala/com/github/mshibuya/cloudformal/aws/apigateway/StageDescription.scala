package com.github.mshibuya.cloudformal.aws.apigateway

import com.github.mshibuya.cloudformal.model._

import scala.collection.immutable.ListMap

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription.html
 */

case class StageDescription(
    cacheClusterEnabled: Property[Boolean] = Empty,
    cacheClusterSize: Property[String] = Empty,
    cacheDataEncrypted: Property[Boolean] = Empty,
    cacheTtlInSeconds: Property[Int] = Empty,
    cachingEnabled: Property[Boolean] = Empty,
    clientCertificateId: Property[String] = Empty,
    dataTraceEnabled: Property[Boolean] = Empty,
    description: Property[String] = Empty,
    documentationVersion: Property[String] = Empty,
    loggingLevel: Property[String] = Empty,
    methodSettings: Property[Seq[MethodSetting]] = Empty,
    metricsEnabled: Property[Boolean] = Empty,
    throttlingBurstLimit: Property[Int] = Empty,
    throttlingRateLimit: Property[Double] = Empty,
    variables: Property[ListMap[String, String]] = Empty) extends Expression[StageDescription] {
  def render: Formattable = Value(
    "CacheClusterEnabled" -> cacheClusterEnabled,
    "CacheClusterSize" -> cacheClusterSize,
    "CacheDataEncrypted" -> cacheDataEncrypted,
    "CacheTtlInSeconds" -> cacheTtlInSeconds,
    "CachingEnabled" -> cachingEnabled,
    "ClientCertificateId" -> clientCertificateId,
    "DataTraceEnabled" -> dataTraceEnabled,
    "Description" -> description,
    "DocumentationVersion" -> documentationVersion,
    "LoggingLevel" -> loggingLevel,
    "MethodSettings" -> methodSettings,
    "MetricsEnabled" -> metricsEnabled,
    "ThrottlingBurstLimit" -> throttlingBurstLimit,
    "ThrottlingRateLimit" -> throttlingRateLimit,
    "Variables" -> variables
  )
}
