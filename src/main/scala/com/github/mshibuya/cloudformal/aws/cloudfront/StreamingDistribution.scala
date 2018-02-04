package com.github.mshibuya.cloudformal.aws.cloudfront

import com.github.mshibuya.cloudformal.model._
import com.github.mshibuya.cloudformal.model.policy._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-streamingdistribution.html
 */

trait StreamingDistribution extends Resource with Resource.WithDeletionPolicy {
  val resourceTypeName = "AWS::CloudFront::StreamingDistribution"

  object attributes {
    val domainName: Expression[String] = Fn.GetAtt(logicalId, "DomainName")
  }

  def streamingDistributionConfig: NonEmptyProperty[StreamingDistributionConfig]
  def tags: NonEmptyProperty[Seq[Tag]]

  def resourceProperties: FormattableMap = Formattable.withProperties(
    "StreamingDistributionConfig" -> streamingDistributionConfig,
    "Tags" -> tags
  )
}
