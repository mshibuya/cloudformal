package com.github.mshibuya.cloudformal.aws.ec2

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-flowlog.html
 */

trait FlowLog extends Resource {
  val resourceTypeName = "AWS::EC2::FlowLog"

  def deliverLogsPermissionArn: String
  def logGroupName: String
  def resourceId: String
  def resourceType: String
  def trafficType: String

  def resourceProperties: FormattableMap = Formattable.opt(
    "DeliverLogsPermissionArn" -> Some(Formattable(deliverLogsPermissionArn)),
    "LogGroupName" -> Some(Formattable(logGroupName)),
    "ResourceId" -> Some(Formattable(resourceId)),
    "ResourceType" -> Some(Formattable(resourceType)),
    "TrafficType" -> Some(Formattable(trafficType))
  )
}
