package com.github.mshibuya.cloudformal.aws.cloudfront

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-cachebehavior.html
 */

case class CacheBehavior(
    compress: Option[Boolean] = None,
    lambdaFunctionAssociations: Option[Seq[LambdaFunctionAssociation]] = None,
    targetOriginId: String,
    viewerProtocolPolicy: String,
    trustedSigners: Option[Seq[String]] = None,
    defaultTTL: Option[Double] = None,
    allowedMethods: Option[Seq[String]] = None,
    pathPattern: String,
    cachedMethods: Option[Seq[String]] = None,
    smoothStreaming: Option[Boolean] = None,
    forwardedValues: ForwardedValues,
    minTTL: Option[Double] = None,
    maxTTL: Option[Double] = None) extends Renderable {
  def render: Formattable = Formattable.opt(
    "Compress" -> compress.map(Formattable(_)),
    "LambdaFunctionAssociations" -> lambdaFunctionAssociations.map(Formattable(_)),
    "TargetOriginId" -> Some(Formattable(targetOriginId)),
    "ViewerProtocolPolicy" -> Some(Formattable(viewerProtocolPolicy)),
    "TrustedSigners" -> trustedSigners.map(Formattable(_)),
    "DefaultTTL" -> defaultTTL.map(Formattable(_)),
    "AllowedMethods" -> allowedMethods.map(Formattable(_)),
    "PathPattern" -> Some(Formattable(pathPattern)),
    "CachedMethods" -> cachedMethods.map(Formattable(_)),
    "SmoothStreaming" -> smoothStreaming.map(Formattable(_)),
    "ForwardedValues" -> Some(Formattable(forwardedValues)),
    "MinTTL" -> minTTL.map(Formattable(_)),
    "MaxTTL" -> maxTTL.map(Formattable(_))
  )
}
