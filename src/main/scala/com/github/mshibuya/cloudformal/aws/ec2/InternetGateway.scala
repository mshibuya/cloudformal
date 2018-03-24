package com.github.mshibuya.cloudformal.aws.ec2

import com.github.mshibuya.cloudformal.model._
import com.github.mshibuya.cloudformal.model.policy._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-internetgateway.html
 */

trait InternetGateway extends Resource[InternetGateway] with Resource.WithDeletionPolicy {
  val resourceTypeName = "AWS::EC2::InternetGateway"

  def tags: Property[Seq[Tag]] = Empty

  def render(): MapValue[_] = Value(
    "Tags" -> tags
  )
}
