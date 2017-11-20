package com.github.mshibuya.cloudformal.aws.ec2

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-eip.html
 */

trait EIP extends Resource {
  val resourceType = "AWS::EC2::EIP"

  def instanceId: Option[String] = None
  def domain: Option[String] = None

  def properties: FormattableMap = Formattable.opt(
    "InstanceId" -> instanceId.map(Formattable(_)),
    "Domain" -> domain.map(Formattable(_))
  )
}
