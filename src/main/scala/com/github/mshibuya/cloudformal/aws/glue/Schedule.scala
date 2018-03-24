package com.github.mshibuya.cloudformal.aws.glue

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-crawler-schedule.html
 */

case class Schedule(
    scheduleExpression: Property[String] = Empty) extends Expression[Schedule] {
  def render: Formattable = Value(
    "ScheduleExpression" -> scheduleExpression
  )
}
