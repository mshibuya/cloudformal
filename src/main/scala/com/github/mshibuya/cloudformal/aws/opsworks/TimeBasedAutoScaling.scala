package com.github.mshibuya.cloudformal.aws.opsworks

import com.github.mshibuya.cloudformal.model._

import scala.collection.immutable.ListMap

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-instance-timebasedautoscaling.html
 */

case class TimeBasedAutoScaling(
    friday: Option[ListMap[String, String]] = None,
    monday: Option[ListMap[String, String]] = None,
    saturday: Option[ListMap[String, String]] = None,
    sunday: Option[ListMap[String, String]] = None,
    thursday: Option[ListMap[String, String]] = None,
    tuesday: Option[ListMap[String, String]] = None,
    wednesday: Option[ListMap[String, String]] = None) extends Renderable {
  def render: Formattable = Formattable.opt(
    "Friday" -> friday.map(Formattable(_)),
    "Monday" -> monday.map(Formattable(_)),
    "Saturday" -> saturday.map(Formattable(_)),
    "Sunday" -> sunday.map(Formattable(_)),
    "Thursday" -> thursday.map(Formattable(_)),
    "Tuesday" -> tuesday.map(Formattable(_)),
    "Wednesday" -> wednesday.map(Formattable(_))
  )
}
