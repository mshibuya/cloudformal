package com.github.mshibuya.cloudformal.aws.cloudfront

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-s3originconfig.html
 */

case class S3OriginConfig(
    originAccessIdentity: Option[String] = None) extends Renderable {
  def render: Formattable = Formattable.opt(
    "OriginAccessIdentity" -> originAccessIdentity.map(Formattable(_))
  )
}
