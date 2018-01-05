package com.github.mshibuya.cloudformal.aws.cloudfront

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-cloudfrontoriginaccessidentity.html
 */

trait CloudFrontOriginAccessIdentity extends Resource {
  val resourceTypeName = "AWS::CloudFront::CloudFrontOriginAccessIdentity"

  def cloudFrontOriginAccessIdentityConfig: CloudFrontOriginAccessIdentityConfig

  def resourceProperties: FormattableMap = Formattable.opt(
    "CloudFrontOriginAccessIdentityConfig" -> Some(Formattable(cloudFrontOriginAccessIdentityConfig))
  )
}
