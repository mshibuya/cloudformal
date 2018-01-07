package com.github.mshibuya.cloudformal.aws.cloudfront

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-streamingdistribution.html
 */

trait StreamingDistribution extends Resource {
  val resourceTypeName = "AWS::CloudFront::StreamingDistribution"

  def domainNameAttribute: Expression[String] = Fn.GetAtt(logicalId, "DomainName")

  def streamingDistributionConfig: NonEmptyProperty[StreamingDistributionConfig]
  def tags: NonEmptyProperty[Seq[Tag]]

  def resourceProperties: FormattableMap = Formattable.withProperties(
    "StreamingDistributionConfig" -> streamingDistributionConfig,
    "Tags" -> tags
  )
}
