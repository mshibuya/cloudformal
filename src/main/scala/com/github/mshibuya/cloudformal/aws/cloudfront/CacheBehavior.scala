package com.github.mshibuya.cloudformal.aws.cloudfront

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-cachebehavior.html
 */

case class CacheBehavior(
    compress: Property[Boolean] = Empty,
    lambdaFunctionAssociations: Property[Seq[LambdaFunctionAssociation]] = Empty,
    targetOriginId: NonEmptyProperty[String],
    viewerProtocolPolicy: NonEmptyProperty[String],
    trustedSigners: Property[Seq[String]] = Empty,
    defaultTTL: Property[Double] = Empty,
    allowedMethods: Property[Seq[String]] = Empty,
    pathPattern: NonEmptyProperty[String],
    cachedMethods: Property[Seq[String]] = Empty,
    smoothStreaming: Property[Boolean] = Empty,
    forwardedValues: NonEmptyProperty[ForwardedValues],
    minTTL: Property[Double] = Empty,
    maxTTL: Property[Double] = Empty) extends Expression[CacheBehavior] {
  def render: Formattable = Value(
    "Compress" -> compress,
    "LambdaFunctionAssociations" -> lambdaFunctionAssociations,
    "TargetOriginId" -> targetOriginId,
    "ViewerProtocolPolicy" -> viewerProtocolPolicy,
    "TrustedSigners" -> trustedSigners,
    "DefaultTTL" -> defaultTTL,
    "AllowedMethods" -> allowedMethods,
    "PathPattern" -> pathPattern,
    "CachedMethods" -> cachedMethods,
    "SmoothStreaming" -> smoothStreaming,
    "ForwardedValues" -> forwardedValues,
    "MinTTL" -> minTTL,
    "MaxTTL" -> maxTTL
  )
}
