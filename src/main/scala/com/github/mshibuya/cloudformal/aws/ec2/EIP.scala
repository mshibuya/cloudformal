package com.github.mshibuya.cloudformal.aws.ec2

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-eip.html
 */

trait EIP extends Resource {
  val resourceTypeName = "AWS::EC2::EIP"

  def allocationIdAttribute: Expression[String] = Fn.GetAtt(logicalId, "AllocationId")

  def domain: Property[String] = Empty
  def instanceId: Property[String] = Empty

  def resourceProperties: FormattableMap = Formattable.withProperties(
    "Domain" -> domain,
    "InstanceId" -> instanceId
  )
}
