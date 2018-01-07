package com.github.mshibuya.cloudformal.aws.batch

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-ulimit.html
 */

case class Ulimit(
    softLimit: NonEmptyProperty[Int],
    hardLimit: NonEmptyProperty[Int],
    name: NonEmptyProperty[String]) extends Renderable {
  def render: Formattable = Formattable.withProperties(
    "SoftLimit" -> softLimit,
    "HardLimit" -> hardLimit,
    "Name" -> name
  )
}
