package com.github.mshibuya.cloudformal.aws.cloudfront

import com.github.mshibuya.cloudformal.model._
import com.github.mshibuya.cloudformal.model.policy._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-distribution.html
 */

trait Distribution extends Resource with Resource.WithDeletionPolicy {
  val resourceTypeName = "AWS::CloudFront::Distribution"

  object attributes {
    val domainName: Expression[String] = Fn.GetAtt(logicalId, "DomainName")
  }

  def distributionConfig: NonEmptyProperty[DistributionConfig]
  def tags: Property[Seq[Tag]] = Empty

  def resourceProperties: FormattableMap = Formattable.withProperties(
    "DistributionConfig" -> distributionConfig,
    "Tags" -> tags
  )
}
