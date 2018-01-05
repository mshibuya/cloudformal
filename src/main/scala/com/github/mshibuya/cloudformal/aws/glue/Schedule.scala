package com.github.mshibuya.cloudformal.aws.glue

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-crawler-schedule.html
 */

case class Schedule(
    scheduleExpression: Option[String] = None) extends Renderable {
  def render: Formattable = Formattable.opt(
    "ScheduleExpression" -> scheduleExpression.map(Formattable(_))
  )
}
