package com.github.mshibuya.cloudformal.aws.batch

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobqueue-computeenvironmentorder.html
 */

case class ComputeEnvironmentOrder(
    computeEnvironment: NonEmptyProperty[String],
    order: NonEmptyProperty[Int]) extends Expression[ComputeEnvironmentOrder] {
  def render: Formattable = Value(
    "ComputeEnvironment" -> computeEnvironment,
    "Order" -> order
  )
}
