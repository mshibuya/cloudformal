package com.github.mshibuya.cloudformal.aws.ec2

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpc.html
 */

trait VPC extends Resource {
  val resourceTypeName = "AWS::EC2::VPC"

  def cidrBlock: String
  def enableDnsHostnames: Option[Boolean] = None
  def enableDnsSupport: Option[Boolean] = None
  def instanceTenancy: Option[String] = None
  def tags: Option[Seq[Tag]] = None

  def resourceProperties: FormattableMap = Formattable.opt(
    "CidrBlock" -> Some(Formattable(cidrBlock)),
    "EnableDnsHostnames" -> enableDnsHostnames.map(Formattable(_)),
    "EnableDnsSupport" -> enableDnsSupport.map(Formattable(_)),
    "InstanceTenancy" -> instanceTenancy.map(Formattable(_)),
    "Tags" -> tags.map(Formattable(_))
  )
}
