package com.github.mshibuya.cloudformal.aws.ecs

import com.github.mshibuya.cloudformal.model._

import scala.collection.immutable.ListMap

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions-logconfiguration.html
 */

case class LogConfiguration(
    logDriver: NonEmptyProperty[String],
    options: Property[ListMap[String, String]] = Empty) extends Renderable {
  def render: Formattable = Formattable.withProperties(
    "LogDriver" -> logDriver,
    "Options" -> options
  )
}
