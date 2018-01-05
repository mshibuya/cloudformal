package com.github.mshibuya.cloudformal.aws.cloudfront

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-customoriginconfig.html
 */

case class CustomOriginConfig(
    originReadTimeout: Option[Int] = None,
    hTTPSPort: Option[Int] = None,
    originKeepaliveTimeout: Option[Int] = None,
    originSSLProtocols: Option[Seq[String]] = None,
    hTTPPort: Option[Int] = None,
    originProtocolPolicy: String) extends Renderable {
  def render: Formattable = Formattable.opt(
    "OriginReadTimeout" -> originReadTimeout.map(Formattable(_)),
    "HTTPSPort" -> hTTPSPort.map(Formattable(_)),
    "OriginKeepaliveTimeout" -> originKeepaliveTimeout.map(Formattable(_)),
    "OriginSSLProtocols" -> originSSLProtocols.map(Formattable(_)),
    "HTTPPort" -> hTTPPort.map(Formattable(_)),
    "OriginProtocolPolicy" -> Some(Formattable(originProtocolPolicy))
  )
}
