package com.github.mshibuya.cloudformal.aws.cloudfront

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-cloudfrontoriginaccessidentity-cloudfrontoriginaccessidentityconfig.html
 */

case class CloudFrontOriginAccessIdentityConfig(
    comment: NonEmptyProperty[String]) extends Expression[CloudFrontOriginAccessIdentityConfig] {
  def render: Formattable = Value(
    "Comment" -> comment
  )
}
