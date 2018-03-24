package com.github.mshibuya.cloudformal.aws.cloudfront

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-origin.html
 */

case class Origin(
    originCustomHeaders: Property[Seq[OriginCustomHeader]] = Empty,
    domainName: NonEmptyProperty[String],
    s3OriginConfig: Property[S3OriginConfig] = Empty,
    originPath: Property[String] = Empty,
    id: NonEmptyProperty[String],
    customOriginConfig: Property[CustomOriginConfig] = Empty) extends Expression[Origin] {
  def render: Formattable = Value(
    "OriginCustomHeaders" -> originCustomHeaders,
    "DomainName" -> domainName,
    "S3OriginConfig" -> s3OriginConfig,
    "OriginPath" -> originPath,
    "Id" -> id,
    "CustomOriginConfig" -> customOriginConfig
  )
}
