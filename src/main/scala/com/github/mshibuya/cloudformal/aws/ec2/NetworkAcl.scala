package com.github.mshibuya.cloudformal.aws.ec2

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-network-acl.html
 */

trait NetworkAcl extends Resource {
  val resourceTypeName = "AWS::EC2::NetworkAcl"

  def tags: Option[Seq[Tag]] = None
  def vpcId: String

  def resourceProperties: FormattableMap = Formattable.opt(
    "Tags" -> tags.map(Formattable(_)),
    "VpcId" -> Some(Formattable(vpcId))
  )
}
