package com.github.mshibuya.cloudformal.aws.ecs

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions-ulimit.html
 */

case class Ulimit(
    hardLimit: Int,
    name: String,
    softLimit: Int) extends Renderable {
  def render: Formattable = Formattable.opt(
    "HardLimit" -> Some(Formattable(hardLimit)),
    "Name" -> Some(Formattable(name)),
    "SoftLimit" -> Some(Formattable(softLimit))
  )
}
