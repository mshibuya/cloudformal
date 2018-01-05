package com.github.mshibuya.cloudformal.aws.batch

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-ulimit.html
 */

case class Ulimit(
    softLimit: Int,
    hardLimit: Int,
    name: String) extends Renderable {
  def render: Formattable = Formattable.opt(
    "SoftLimit" -> Some(Formattable(softLimit)),
    "HardLimit" -> Some(Formattable(hardLimit)),
    "Name" -> Some(Formattable(name))
  )
}
