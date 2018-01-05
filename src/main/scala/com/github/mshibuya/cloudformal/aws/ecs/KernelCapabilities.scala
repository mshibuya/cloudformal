package com.github.mshibuya.cloudformal.aws.ecs

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-kernelcapabilities.html
 */

case class KernelCapabilities(
    add: Option[Seq[String]] = None,
    drop: Option[Seq[String]] = None) extends Renderable {
  def render: Formattable = Formattable.opt(
    "Add" -> add.map(Formattable(_)),
    "Drop" -> drop.map(Formattable(_))
  )
}
