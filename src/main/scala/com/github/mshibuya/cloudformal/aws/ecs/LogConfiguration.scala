package com.github.mshibuya.cloudformal.aws.ecs

import com.github.mshibuya.cloudformal.model._

import scala.collection.immutable.ListMap

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions-logconfiguration.html
 */

case class LogConfiguration(
    logDriver: String,
    options: Option[ListMap[String, String]] = None) extends Renderable {
  def render: Formattable = Formattable.opt(
    "LogDriver" -> Some(Formattable(logDriver)),
    "Options" -> options.map(Formattable(_))
  )
}
