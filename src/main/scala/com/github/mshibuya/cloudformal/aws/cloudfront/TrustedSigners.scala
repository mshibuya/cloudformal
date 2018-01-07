package com.github.mshibuya.cloudformal.aws.cloudfront

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-streamingdistribution-trustedsigners.html
 */

case class TrustedSigners(
    enabled: NonEmptyProperty[Boolean],
    awsAccountNumbers: Property[Seq[String]] = Empty) extends Renderable {
  def render: Formattable = Formattable.withProperties(
    "Enabled" -> enabled,
    "AwsAccountNumbers" -> awsAccountNumbers
  )
}
