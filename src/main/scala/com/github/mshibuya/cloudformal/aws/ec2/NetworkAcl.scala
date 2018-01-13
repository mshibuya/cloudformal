package com.github.mshibuya.cloudformal.aws.ec2

import com.github.mshibuya.cloudformal.model._
import com.github.mshibuya.cloudformal.model.policy._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-network-acl.html
 */

trait NetworkAcl extends Resource with Resource.WithDeletionPolicy {
  val resourceTypeName = "AWS::EC2::NetworkAcl"

  def tags: Property[Seq[Tag]] = Empty
  def vpcId: NonEmptyProperty[String]

  def resourceProperties: FormattableMap = Formattable.withProperties(
    "Tags" -> tags,
    "VpcId" -> vpcId
  )
}
