package com.github.mshibuya.cloudformal.aws.ec2

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-egressonlyinternetgateway.html
 */

trait EgressOnlyInternetGateway extends Resource {
  val resourceTypeName = "AWS::EC2::EgressOnlyInternetGateway"

  def vpcId: NonEmptyProperty[String]

  def resourceProperties: FormattableMap = Formattable.withProperties(
    "VpcId" -> vpcId
  )
}
