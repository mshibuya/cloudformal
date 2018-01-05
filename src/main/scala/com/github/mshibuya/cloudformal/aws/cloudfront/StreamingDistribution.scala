package com.github.mshibuya.cloudformal.aws.cloudfront

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-streamingdistribution.html
 */

trait StreamingDistribution extends Resource {
  val resourceTypeName = "AWS::CloudFront::StreamingDistribution"

  def streamingDistributionConfig: StreamingDistributionConfig
  def tags: Seq[Tag]

  def resourceProperties: FormattableMap = Formattable.opt(
    "StreamingDistributionConfig" -> Some(Formattable(streamingDistributionConfig)),
    "Tags" -> Some(Formattable(tags))
  )
}
