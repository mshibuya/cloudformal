package com.github.mshibuya.cloudformal.aws.batch

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-retrystrategy.html
 */

case class RetryStrategy(
    attempts: Property[Int] = Empty) extends Expression[RetryStrategy] {
  def render: Formattable = Value(
    "Attempts" -> attempts
  )
}
