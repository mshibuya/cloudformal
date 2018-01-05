package com.github.mshibuya.cloudformal.aws.ec2

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-customer-gateway.html
 */

trait CustomerGateway extends Resource {
  val resourceTypeName = "AWS::EC2::CustomerGateway"

  def bgpAsn: Int
  def ipAddress: String
  def tags: Option[Seq[Tag]] = None
  def `type`: String

  def resourceProperties: FormattableMap = Formattable.opt(
    "BgpAsn" -> Some(Formattable(bgpAsn)),
    "IpAddress" -> Some(Formattable(ipAddress)),
    "Tags" -> tags.map(Formattable(_)),
    "Type" -> Some(Formattable(`type`))
  )
}
