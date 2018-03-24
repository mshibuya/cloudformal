package com.github.mshibuya.cloudformal.aws.autoscaling

import com.github.mshibuya.cloudformal.model._
import com.github.mshibuya.cloudformal.model.policy._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-as-scheduledaction.html
 */

trait ScheduledAction extends Resource[ScheduledAction] with Resource.WithDeletionPolicy {
  val resourceTypeName = "AWS::AutoScaling::ScheduledAction"

  def autoScalingGroupName: NonEmptyProperty[String]
  def desiredCapacity: Property[Int] = Empty
  def endTime: Property[String] = Empty
  def maxSize: Property[Int] = Empty
  def minSize: Property[Int] = Empty
  def recurrence: Property[String] = Empty
  def startTime: Property[String] = Empty

  def render(): MapValue[_] = Value(
    "AutoScalingGroupName" -> autoScalingGroupName,
    "DesiredCapacity" -> desiredCapacity,
    "EndTime" -> endTime,
    "MaxSize" -> maxSize,
    "MinSize" -> minSize,
    "Recurrence" -> recurrence,
    "StartTime" -> startTime
  )
}
