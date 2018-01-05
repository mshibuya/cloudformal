package com.github.mshibuya.cloudformal.aws.cloudfront

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-distributionconfig.html
 */

case class DistributionConfig(
    logging: Option[Logging] = None,
    comment: Option[String] = None,
    defaultRootObject: Option[String] = None,
    origins: Option[Seq[Origin]] = None,
    viewerCertificate: Option[ViewerCertificate] = None,
    priceClass: Option[String] = None,
    defaultCacheBehavior: Option[DefaultCacheBehavior] = None,
    customErrorResponses: Option[Seq[CustomErrorResponse]] = None,
    enabled: Boolean,
    aliases: Option[Seq[String]] = None,
    iPV6Enabled: Option[Boolean] = None,
    webACLId: Option[String] = None,
    httpVersion: Option[String] = None,
    restrictions: Option[Restrictions] = None,
    cacheBehaviors: Option[Seq[CacheBehavior]] = None) extends Renderable {
  def render: Formattable = Formattable.opt(
    "Logging" -> logging.map(Formattable(_)),
    "Comment" -> comment.map(Formattable(_)),
    "DefaultRootObject" -> defaultRootObject.map(Formattable(_)),
    "Origins" -> origins.map(Formattable(_)),
    "ViewerCertificate" -> viewerCertificate.map(Formattable(_)),
    "PriceClass" -> priceClass.map(Formattable(_)),
    "DefaultCacheBehavior" -> defaultCacheBehavior.map(Formattable(_)),
    "CustomErrorResponses" -> customErrorResponses.map(Formattable(_)),
    "Enabled" -> Some(Formattable(enabled)),
    "Aliases" -> aliases.map(Formattable(_)),
    "IPV6Enabled" -> iPV6Enabled.map(Formattable(_)),
    "WebACLId" -> webACLId.map(Formattable(_)),
    "HttpVersion" -> httpVersion.map(Formattable(_)),
    "Restrictions" -> restrictions.map(Formattable(_)),
    "CacheBehaviors" -> cacheBehaviors.map(Formattable(_))
  )
}
