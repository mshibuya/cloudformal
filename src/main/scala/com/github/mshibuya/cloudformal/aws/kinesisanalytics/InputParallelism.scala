package com.github.mshibuya.cloudformal.aws.kinesisanalytics

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-application-inputparallelism.html
 */

case class InputParallelism(
    count: Property[Int] = Empty) extends Expression[InputParallelism] {
  def render: Formattable = Value(
    "Count" -> count
  )
}
