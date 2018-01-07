package com.github.mshibuya.cloudformal.aws.ec2

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpn-gateway.html
 */

trait VPNGateway extends Resource {
  val resourceTypeName = "AWS::EC2::VPNGateway"

  def amazonSideAsn: Property[Long] = Empty
  def tags: Property[Seq[Tag]] = Empty
  def `type`: NonEmptyProperty[String]

  def resourceProperties: FormattableMap = Formattable.withProperties(
    "AmazonSideAsn" -> amazonSideAsn,
    "Tags" -> tags,
    "Type" -> `type`
  )
}
