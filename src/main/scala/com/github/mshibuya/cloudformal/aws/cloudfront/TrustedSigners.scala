package com.github.mshibuya.cloudformal.aws.cloudfront

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-streamingdistribution-trustedsigners.html
 */

case class TrustedSigners(
    enabled: Boolean,
    awsAccountNumbers: Option[Seq[String]] = None) extends Renderable {
  def render: Formattable = Formattable.opt(
    "Enabled" -> Some(Formattable(enabled)),
    "AwsAccountNumbers" -> awsAccountNumbers.map(Formattable(_))
  )
}
