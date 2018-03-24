package com.github.mshibuya.cloudformal.aws.glue

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-trigger-predicate.html
 */

case class Predicate(
    logical: Property[String] = Empty,
    conditions: Property[Seq[Condition]] = Empty) extends Expression[Predicate] {
  def render: Formattable = Value(
    "Logical" -> logical,
    "Conditions" -> conditions
  )
}
