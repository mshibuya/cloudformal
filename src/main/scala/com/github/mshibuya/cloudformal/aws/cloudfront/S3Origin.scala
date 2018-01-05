package com.github.mshibuya.cloudformal.aws.cloudfront

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-streamingdistribution-s3origin.html
 */

case class S3Origin(
    domainName: String,
    originAccessIdentity: String) extends Renderable {
  def render: Formattable = Formattable.opt(
    "DomainName" -> Some(Formattable(domainName)),
    "OriginAccessIdentity" -> Some(Formattable(originAccessIdentity))
  )
}
