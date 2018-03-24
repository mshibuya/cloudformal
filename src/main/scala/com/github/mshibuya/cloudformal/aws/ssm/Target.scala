package com.github.mshibuya.cloudformal.aws.ssm

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-target.html
 */

case class Target(
    values: Property[Seq[String]] = Empty,
    key: NonEmptyProperty[String]) extends Expression[Target] {
  def render: Formattable = Value(
    "Values" -> values,
    "Key" -> key
  )
}
