package com.github.mshibuya.cloudformal.aws.autoscaling

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-as-scheduledaction.html
 */

trait ScheduledAction extends Resource {
  val resourceTypeName = "AWS::AutoScaling::ScheduledAction"

  def autoScalingGroupName: String
  def desiredCapacity: Option[Int] = None
  def endTime: Option[String] = None
  def maxSize: Option[Int] = None
  def minSize: Option[Int] = None
  def recurrence: Option[String] = None
  def startTime: Option[String] = None

  def resourceProperties: FormattableMap = Formattable.opt(
    "AutoScalingGroupName" -> Some(Formattable(autoScalingGroupName)),
    "DesiredCapacity" -> desiredCapacity.map(Formattable(_)),
    "EndTime" -> endTime.map(Formattable(_)),
    "MaxSize" -> maxSize.map(Formattable(_)),
    "MinSize" -> minSize.map(Formattable(_)),
    "Recurrence" -> recurrence.map(Formattable(_)),
    "StartTime" -> startTime.map(Formattable(_))
  )
}
