package com.github.mshibuya.cloudformal.aws.cloudfront

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-customoriginconfig.html
 */

case class CustomOriginConfig(
    originReadTimeout: Property[Int] = Empty,
    hTTPSPort: Property[Int] = Empty,
    originKeepaliveTimeout: Property[Int] = Empty,
    originSSLProtocols: Property[Seq[String]] = Empty,
    hTTPPort: Property[Int] = Empty,
    originProtocolPolicy: NonEmptyProperty[String]) extends Renderable {
  def render: Formattable = Formattable.withProperties(
    "OriginReadTimeout" -> originReadTimeout,
    "HTTPSPort" -> hTTPSPort,
    "OriginKeepaliveTimeout" -> originKeepaliveTimeout,
    "OriginSSLProtocols" -> originSSLProtocols,
    "HTTPPort" -> hTTPPort,
    "OriginProtocolPolicy" -> originProtocolPolicy
  )
}
