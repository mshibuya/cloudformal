package com.github.mshibuya.cloudformal.aws.ecs

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-kernelcapabilities.html
 */

case class KernelCapabilities(
    add: Property[Seq[String]] = Empty,
    drop: Property[Seq[String]] = Empty) extends Expression[KernelCapabilities] {
  def render: Formattable = Value(
    "Add" -> add,
    "Drop" -> drop
  )
}
