package com.github.mshibuya.cloudformal.aws.ssm

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-patchbaseline-patchsource.html
 */

case class PatchSource(
    products: Property[Seq[String]] = Empty,
    configuration: Property[String] = Empty,
    name: Property[String] = Empty) extends Expression[PatchSource] {
  def render: Formattable = Value(
    "Products" -> products,
    "Configuration" -> configuration,
    "Name" -> name
  )
}
