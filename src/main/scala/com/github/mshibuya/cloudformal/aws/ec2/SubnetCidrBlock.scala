package com.github.mshibuya.cloudformal.aws.ec2

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-subnetcidrblock.html
 */

trait SubnetCidrBlock extends Resource {
  val resourceTypeName = "AWS::EC2::SubnetCidrBlock"

  def ipv6CidrBlock: String
  def subnetId: String

  def resourceProperties: FormattableMap = Formattable.opt(
    "Ipv6CidrBlock" -> Some(Formattable(ipv6CidrBlock)),
    "SubnetId" -> Some(Formattable(subnetId))
  )
}
