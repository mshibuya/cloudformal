package com.github.mshibuya.cloudformal.aws.cloudfront

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-streamingdistribution-streamingdistributionconfig.html
 */

case class StreamingDistributionConfig(
    logging: Option[Logging] = None,
    comment: String,
    priceClass: Option[String] = None,
    s3Origin: S3Origin,
    enabled: Boolean,
    aliases: Option[Seq[String]] = None,
    trustedSigners: TrustedSigners) extends Renderable {
  def render: Formattable = Formattable.opt(
    "Logging" -> logging.map(Formattable(_)),
    "Comment" -> Some(Formattable(comment)),
    "PriceClass" -> priceClass.map(Formattable(_)),
    "S3Origin" -> Some(Formattable(s3Origin)),
    "Enabled" -> Some(Formattable(enabled)),
    "Aliases" -> aliases.map(Formattable(_)),
    "TrustedSigners" -> Some(Formattable(trustedSigners))
  )
}
