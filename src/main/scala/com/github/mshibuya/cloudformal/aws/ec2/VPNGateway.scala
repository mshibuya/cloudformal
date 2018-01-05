package com.github.mshibuya.cloudformal.aws.ec2

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpn-gateway.html
 */

trait VPNGateway extends Resource {
  val resourceTypeName = "AWS::EC2::VPNGateway"

  def amazonSideAsn: Option[Long] = None
  def tags: Option[Seq[Tag]] = None
  def `type`: String

  def resourceProperties: FormattableMap = Formattable.opt(
    "AmazonSideAsn" -> amazonSideAsn.map(Formattable(_)),
    "Tags" -> tags.map(Formattable(_)),
    "Type" -> Some(Formattable(`type`))
  )
}
