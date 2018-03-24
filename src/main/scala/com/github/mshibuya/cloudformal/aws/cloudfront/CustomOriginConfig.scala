package com.github.mshibuya.cloudformal.aws.cloudfront

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-customoriginconfig.html
 */

case class CustomOriginConfig(
    originReadTimeout: Property[Int] = Empty,
    httpsPort: Property[Int] = Empty,
    originKeepaliveTimeout: Property[Int] = Empty,
    originSSLProtocols: Property[Seq[String]] = Empty,
    httpPort: Property[Int] = Empty,
    originProtocolPolicy: NonEmptyProperty[String]) extends Expression[CustomOriginConfig] {
  def render: Formattable = Value(
    "OriginReadTimeout" -> originReadTimeout,
    "HTTPSPort" -> httpsPort,
    "OriginKeepaliveTimeout" -> originKeepaliveTimeout,
    "OriginSSLProtocols" -> originSSLProtocols,
    "HTTPPort" -> httpPort,
    "OriginProtocolPolicy" -> originProtocolPolicy
  )
}
