package com.github.mshibuya.cloudformal.aws.ec2

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-eip.html
 */

trait EIP extends Resource {
  val resourceTypeName = "AWS::EC2::EIP"

  def domain: Option[String] = None
  def instanceId: Option[String] = None

  def resourceProperties: FormattableMap = Formattable.opt(
    "Domain" -> domain.map(Formattable(_)),
    "InstanceId" -> instanceId.map(Formattable(_))
  )
}
