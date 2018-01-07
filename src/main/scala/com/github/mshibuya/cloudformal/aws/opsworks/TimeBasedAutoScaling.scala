package com.github.mshibuya.cloudformal.aws.opsworks

import com.github.mshibuya.cloudformal.model._

import scala.collection.immutable.ListMap

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-instance-timebasedautoscaling.html
 */

case class TimeBasedAutoScaling(
    friday: Property[ListMap[String, String]] = Empty,
    monday: Property[ListMap[String, String]] = Empty,
    saturday: Property[ListMap[String, String]] = Empty,
    sunday: Property[ListMap[String, String]] = Empty,
    thursday: Property[ListMap[String, String]] = Empty,
    tuesday: Property[ListMap[String, String]] = Empty,
    wednesday: Property[ListMap[String, String]] = Empty) extends Renderable {
  def render: Formattable = Formattable.withProperties(
    "Friday" -> friday,
    "Monday" -> monday,
    "Saturday" -> saturday,
    "Sunday" -> sunday,
    "Thursday" -> thursday,
    "Tuesday" -> tuesday,
    "Wednesday" -> wednesday
  )
}
