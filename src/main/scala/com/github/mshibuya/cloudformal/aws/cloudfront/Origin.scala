package com.github.mshibuya.cloudformal.aws.cloudfront

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-origin.html
 */

case class Origin(
    originCustomHeaders: Option[Seq[OriginCustomHeader]] = None,
    domainName: String,
    s3OriginConfig: Option[S3OriginConfig] = None,
    originPath: Option[String] = None,
    id: String,
    customOriginConfig: Option[CustomOriginConfig] = None) extends Renderable {
  def render: Formattable = Formattable.opt(
    "OriginCustomHeaders" -> originCustomHeaders.map(Formattable(_)),
    "DomainName" -> Some(Formattable(domainName)),
    "S3OriginConfig" -> s3OriginConfig.map(Formattable(_)),
    "OriginPath" -> originPath.map(Formattable(_)),
    "Id" -> Some(Formattable(id)),
    "CustomOriginConfig" -> customOriginConfig.map(Formattable(_))
  )
}
