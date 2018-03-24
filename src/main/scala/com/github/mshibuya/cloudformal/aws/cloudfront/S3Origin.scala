package com.github.mshibuya.cloudformal.aws.cloudfront

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-streamingdistribution-s3origin.html
 */

case class S3Origin(
    domainName: NonEmptyProperty[String],
    originAccessIdentity: NonEmptyProperty[String]) extends Expression[S3Origin] {
  def render: Formattable = Value(
    "DomainName" -> domainName,
    "OriginAccessIdentity" -> originAccessIdentity
  )
}
