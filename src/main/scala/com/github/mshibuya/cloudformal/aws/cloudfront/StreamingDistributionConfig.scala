package com.github.mshibuya.cloudformal.aws.cloudfront

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-streamingdistribution-streamingdistributionconfig.html
 */

case class StreamingDistributionConfig(
    logging: Property[Logging] = Empty,
    comment: NonEmptyProperty[String],
    priceClass: Property[String] = Empty,
    s3Origin: NonEmptyProperty[S3Origin],
    enabled: NonEmptyProperty[Boolean],
    aliases: Property[Seq[String]] = Empty,
    trustedSigners: NonEmptyProperty[TrustedSigners]) extends Renderable {
  def render: Formattable = Formattable.withProperties(
    "Logging" -> logging,
    "Comment" -> comment,
    "PriceClass" -> priceClass,
    "S3Origin" -> s3Origin,
    "Enabled" -> enabled,
    "Aliases" -> aliases,
    "TrustedSigners" -> trustedSigners
  )
}
