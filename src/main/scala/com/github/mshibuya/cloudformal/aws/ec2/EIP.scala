package com.github.mshibuya.cloudformal.aws.ec2

import com.github.mshibuya.cloudformal.model._
import com.github.mshibuya.cloudformal.model.policy._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-eip.html
 */

trait EIP extends Resource[EIP] with Resource.WithDeletionPolicy {
  val resourceTypeName = "AWS::EC2::EIP"

  object attributes {
    val allocationId: Expression[String] = Fn.GetAtt(logicalId, "AllocationId")
  }

  def domain: Property[String] = Empty
  def instanceId: Property[String] = Empty

  def render(): MapValue[_] = Value(
    "Domain" -> domain,
    "InstanceId" -> instanceId
  )
}
