package com.github.mshibuya.cloudformal.aws.ec2

import com.github.mshibuya.cloudformal.model._
import com.github.mshibuya.cloudformal.model.policy._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinterfacepermission.html
 */

trait NetworkInterfacePermission extends Resource with Resource.WithDeletionPolicy {
  val resourceTypeName = "AWS::EC2::NetworkInterfacePermission"

  def awsAccountId: NonEmptyProperty[String]
  def networkInterfaceId: NonEmptyProperty[String]
  def permission: NonEmptyProperty[String]

  def resourceProperties: FormattableMap = Formattable.withProperties(
    "AwsAccountId" -> awsAccountId,
    "NetworkInterfaceId" -> networkInterfaceId,
    "Permission" -> permission
  )
}
