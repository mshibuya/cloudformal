package com.github.mshibuya.cloudformal.aws.cloudfront

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-s3originconfig.html
 */

case class S3OriginConfig(
    originAccessIdentity: Property[String] = Empty) extends Expression[S3OriginConfig] {
  def render: Formattable = Value(
    "OriginAccessIdentity" -> originAccessIdentity
  )
}
