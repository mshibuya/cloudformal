package com.github.mshibuya.cloudformal.aws.cloudfront

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-defaultcachebehavior.html
 */

case class DefaultCacheBehavior(
    compress: Property[Boolean] = Empty,
    allowedMethods: Property[Seq[String]] = Empty,
    cachedMethods: Property[Seq[String]] = Empty,
    lambdaFunctionAssociations: Property[Seq[LambdaFunctionAssociation]] = Empty,
    smoothStreaming: Property[Boolean] = Empty,
    targetOriginId: NonEmptyProperty[String],
    viewerProtocolPolicy: NonEmptyProperty[String],
    forwardedValues: NonEmptyProperty[ForwardedValues],
    minTTL: Property[Double] = Empty,
    maxTTL: Property[Double] = Empty,
    trustedSigners: Property[Seq[String]] = Empty,
    defaultTTL: Property[Double] = Empty) extends Renderable {
  def render: Formattable = Formattable.withProperties(
    "Compress" -> compress,
    "AllowedMethods" -> allowedMethods,
    "CachedMethods" -> cachedMethods,
    "LambdaFunctionAssociations" -> lambdaFunctionAssociations,
    "SmoothStreaming" -> smoothStreaming,
    "TargetOriginId" -> targetOriginId,
    "ViewerProtocolPolicy" -> viewerProtocolPolicy,
    "ForwardedValues" -> forwardedValues,
    "MinTTL" -> minTTL,
    "MaxTTL" -> maxTTL,
    "TrustedSigners" -> trustedSigners,
    "DefaultTTL" -> defaultTTL
  )
}
