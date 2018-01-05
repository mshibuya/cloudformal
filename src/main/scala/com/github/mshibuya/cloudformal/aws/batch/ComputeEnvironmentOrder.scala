package com.github.mshibuya.cloudformal.aws.batch

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobqueue-computeenvironmentorder.html
 */

case class ComputeEnvironmentOrder(
    computeEnvironment: String,
    order: Int) extends Renderable {
  def render: Formattable = Formattable.opt(
    "ComputeEnvironment" -> Some(Formattable(computeEnvironment)),
    "Order" -> Some(Formattable(order))
  )
}
