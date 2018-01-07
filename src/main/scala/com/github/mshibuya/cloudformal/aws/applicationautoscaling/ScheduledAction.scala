package com.github.mshibuya.cloudformal.aws.applicationautoscaling

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalabletarget-scheduledaction.html
 */

case class ScheduledAction(
    endTime: Property[java.time.ZonedDateTime] = Empty,
    scalableTargetAction: Property[ScalableTargetAction] = Empty,
    schedule: NonEmptyProperty[String],
    scheduledActionName: NonEmptyProperty[String],
    startTime: Property[java.time.ZonedDateTime] = Empty) extends Renderable {
  def render: Formattable = Formattable.withProperties(
    "EndTime" -> endTime,
    "ScalableTargetAction" -> scalableTargetAction,
    "Schedule" -> schedule,
    "ScheduledActionName" -> scheduledActionName,
    "StartTime" -> startTime
  )
}
