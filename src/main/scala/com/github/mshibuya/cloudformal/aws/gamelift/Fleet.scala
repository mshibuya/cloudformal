package com.github.mshibuya.cloudformal.aws.gamelift

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html
 */

trait Fleet extends Resource {
  val resourceTypeName = "AWS::GameLift::Fleet"

  def buildId: String
  def description: Option[String] = None
  def desiredEC2Instances: Int
  def eC2InboundPermissions: Option[Seq[IpPermission]] = None
  def eC2InstanceType: String
  def logPaths: Option[Seq[String]] = None
  def maxSize: Option[Int] = None
  def minSize: Option[Int] = None
  def name: String
  def serverLaunchParameters: Option[String] = None
  def serverLaunchPath: String

  def resourceProperties: FormattableMap = Formattable.opt(
    "BuildId" -> Some(Formattable(buildId)),
    "Description" -> description.map(Formattable(_)),
    "DesiredEC2Instances" -> Some(Formattable(desiredEC2Instances)),
    "EC2InboundPermissions" -> eC2InboundPermissions.map(Formattable(_)),
    "EC2InstanceType" -> Some(Formattable(eC2InstanceType)),
    "LogPaths" -> logPaths.map(Formattable(_)),
    "MaxSize" -> maxSize.map(Formattable(_)),
    "MinSize" -> minSize.map(Formattable(_)),
    "Name" -> Some(Formattable(name)),
    "ServerLaunchParameters" -> serverLaunchParameters.map(Formattable(_)),
    "ServerLaunchPath" -> Some(Formattable(serverLaunchPath))
  )
}
