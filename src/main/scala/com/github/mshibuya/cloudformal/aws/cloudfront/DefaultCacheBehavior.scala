package com.github.mshibuya.cloudformal.aws.cloudfront

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-defaultcachebehavior.html
 */

case class DefaultCacheBehavior(
    compress: Option[Boolean] = None,
    allowedMethods: Option[Seq[String]] = None,
    cachedMethods: Option[Seq[String]] = None,
    lambdaFunctionAssociations: Option[Seq[LambdaFunctionAssociation]] = None,
    smoothStreaming: Option[Boolean] = None,
    targetOriginId: String,
    viewerProtocolPolicy: String,
    forwardedValues: ForwardedValues,
    minTTL: Option[Double] = None,
    maxTTL: Option[Double] = None,
    trustedSigners: Option[Seq[String]] = None,
    defaultTTL: Option[Double] = None) extends Renderable {
  def render: Formattable = Formattable.opt(
    "Compress" -> compress.map(Formattable(_)),
    "AllowedMethods" -> allowedMethods.map(Formattable(_)),
    "CachedMethods" -> cachedMethods.map(Formattable(_)),
    "LambdaFunctionAssociations" -> lambdaFunctionAssociations.map(Formattable(_)),
    "SmoothStreaming" -> smoothStreaming.map(Formattable(_)),
    "TargetOriginId" -> Some(Formattable(targetOriginId)),
    "ViewerProtocolPolicy" -> Some(Formattable(viewerProtocolPolicy)),
    "ForwardedValues" -> Some(Formattable(forwardedValues)),
    "MinTTL" -> minTTL.map(Formattable(_)),
    "MaxTTL" -> maxTTL.map(Formattable(_)),
    "TrustedSigners" -> trustedSigners.map(Formattable(_)),
    "DefaultTTL" -> defaultTTL.map(Formattable(_))
  )
}
