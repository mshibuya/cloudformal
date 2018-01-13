package com.github.mshibuya.cloudformal.aws.gamelift

import com.github.mshibuya.cloudformal.model._
import com.github.mshibuya.cloudformal.model.policy._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html
 */

trait Fleet extends Resource with Resource.WithDeletionPolicy {
  val resourceTypeName = "AWS::GameLift::Fleet"

  def buildId: NonEmptyProperty[String]
  def description: Property[String] = Empty
  def desiredEC2Instances: NonEmptyProperty[Int]
  def eC2InboundPermissions: Property[Seq[IpPermission]] = Empty
  def eC2InstanceType: NonEmptyProperty[String]
  def logPaths: Property[Seq[String]] = Empty
  def maxSize: Property[Int] = Empty
  def minSize: Property[Int] = Empty
  def name: NonEmptyProperty[String]
  def serverLaunchParameters: Property[String] = Empty
  def serverLaunchPath: NonEmptyProperty[String]

  def resourceProperties: FormattableMap = Formattable.withProperties(
    "BuildId" -> buildId,
    "Description" -> description,
    "DesiredEC2Instances" -> desiredEC2Instances,
    "EC2InboundPermissions" -> eC2InboundPermissions,
    "EC2InstanceType" -> eC2InstanceType,
    "LogPaths" -> logPaths,
    "MaxSize" -> maxSize,
    "MinSize" -> minSize,
    "Name" -> name,
    "ServerLaunchParameters" -> serverLaunchParameters,
    "ServerLaunchPath" -> serverLaunchPath
  )
}
