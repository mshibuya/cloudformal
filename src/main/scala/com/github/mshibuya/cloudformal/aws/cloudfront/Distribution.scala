package com.github.mshibuya.cloudformal.aws.cloudfront

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-distribution.html
 */

trait Distribution extends Resource {
  val resourceTypeName = "AWS::CloudFront::Distribution"

  def distributionConfig: DistributionConfig
  def tags: Option[Seq[Tag]] = None

  def resourceProperties: FormattableMap = Formattable.opt(
    "DistributionConfig" -> Some(Formattable(distributionConfig)),
    "Tags" -> tags.map(Formattable(_))
  )
}
