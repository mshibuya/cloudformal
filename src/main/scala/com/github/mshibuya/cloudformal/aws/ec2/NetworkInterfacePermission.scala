package com.github.mshibuya.cloudformal.aws.ec2

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinterfacepermission.html
 */

trait NetworkInterfacePermission extends Resource {
  val resourceTypeName = "AWS::EC2::NetworkInterfacePermission"

  def awsAccountId: String
  def networkInterfaceId: String
  def permission: String

  def resourceProperties: FormattableMap = Formattable.opt(
    "AwsAccountId" -> Some(Formattable(awsAccountId)),
    "NetworkInterfaceId" -> Some(Formattable(networkInterfaceId)),
    "Permission" -> Some(Formattable(permission))
  )
}
