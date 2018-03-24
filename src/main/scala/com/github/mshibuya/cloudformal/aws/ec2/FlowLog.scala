package com.github.mshibuya.cloudformal.aws.ec2

import com.github.mshibuya.cloudformal.model._
import com.github.mshibuya.cloudformal.model.policy._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-flowlog.html
 */

trait FlowLog extends Resource[FlowLog] with Resource.WithDeletionPolicy {
  val resourceTypeName = "AWS::EC2::FlowLog"

  def deliverLogsPermissionArn: NonEmptyProperty[String]
  def logGroupName: NonEmptyProperty[String]
  def resourceId: NonEmptyProperty[String]
  def resourceType: NonEmptyProperty[String]
  def trafficType: NonEmptyProperty[String]

  def render(): MapValue[_] = Value(
    "DeliverLogsPermissionArn" -> deliverLogsPermissionArn,
    "LogGroupName" -> logGroupName,
    "ResourceId" -> resourceId,
    "ResourceType" -> resourceType,
    "TrafficType" -> trafficType
  )
}
