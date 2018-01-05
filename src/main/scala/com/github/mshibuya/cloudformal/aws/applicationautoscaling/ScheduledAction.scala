package com.github.mshibuya.cloudformal.aws.applicationautoscaling

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalabletarget-scheduledaction.html
 */

case class ScheduledAction(
    endTime: Option[java.time.ZonedDateTime] = None,
    scalableTargetAction: Option[ScalableTargetAction] = None,
    schedule: String,
    scheduledActionName: String,
    startTime: Option[java.time.ZonedDateTime] = None) extends Renderable {
  def render: Formattable = Formattable.opt(
    "EndTime" -> endTime.map(Formattable(_)),
    "ScalableTargetAction" -> scalableTargetAction.map(Formattable(_)),
    "Schedule" -> Some(Formattable(schedule)),
    "ScheduledActionName" -> Some(Formattable(scheduledActionName)),
    "StartTime" -> startTime.map(Formattable(_))
  )
}
