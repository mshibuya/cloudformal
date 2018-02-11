package com.github.mshibuya.cloudformal.aws.cloudfront

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-distributionconfig.html
 */

case class DistributionConfig(
    logging: Property[Logging] = Empty,
    comment: Property[String] = Empty,
    defaultRootObject: Property[String] = Empty,
    origins: Property[Seq[Origin]] = Empty,
    viewerCertificate: Property[ViewerCertificate] = Empty,
    priceClass: Property[String] = Empty,
    defaultCacheBehavior: Property[DefaultCacheBehavior] = Empty,
    customErrorResponses: Property[Seq[CustomErrorResponse]] = Empty,
    enabled: NonEmptyProperty[Boolean],
    aliases: Property[Seq[String]] = Empty,
    ipV6Enabled: Property[Boolean] = Empty,
    webACLId: Property[String] = Empty,
    httpVersion: Property[String] = Empty,
    restrictions: Property[Restrictions] = Empty,
    cacheBehaviors: Property[Seq[CacheBehavior]] = Empty) extends Renderable {
  def render: Formattable = Formattable.withProperties(
    "Logging" -> logging,
    "Comment" -> comment,
    "DefaultRootObject" -> defaultRootObject,
    "Origins" -> origins,
    "ViewerCertificate" -> viewerCertificate,
    "PriceClass" -> priceClass,
    "DefaultCacheBehavior" -> defaultCacheBehavior,
    "CustomErrorResponses" -> customErrorResponses,
    "Enabled" -> enabled,
    "Aliases" -> aliases,
    "IPV6Enabled" -> ipV6Enabled,
    "WebACLId" -> webACLId,
    "HttpVersion" -> httpVersion,
    "Restrictions" -> restrictions,
    "CacheBehaviors" -> cacheBehaviors
  )
}
