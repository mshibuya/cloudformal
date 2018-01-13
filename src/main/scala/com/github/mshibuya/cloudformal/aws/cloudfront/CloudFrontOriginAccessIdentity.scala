package com.github.mshibuya.cloudformal.aws.cloudfront

import com.github.mshibuya.cloudformal.model._
import com.github.mshibuya.cloudformal.model.policy._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-cloudfrontoriginaccessidentity.html
 */

trait CloudFrontOriginAccessIdentity extends Resource with Resource.WithDeletionPolicy {
  val resourceTypeName = "AWS::CloudFront::CloudFrontOriginAccessIdentity"

  def s3CanonicalUserIdAttribute: Expression[String] = Fn.GetAtt(logicalId, "S3CanonicalUserId")

  def cloudFrontOriginAccessIdentityConfig: NonEmptyProperty[CloudFrontOriginAccessIdentityConfig]

  def resourceProperties: FormattableMap = Formattable.withProperties(
    "CloudFrontOriginAccessIdentityConfig" -> cloudFrontOriginAccessIdentityConfig
  )
}
