package com.github.mshibuya.cloudformal.aws.ssm

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-target.html
 */

case class Target(
    values: Option[Seq[String]] = None,
    key: String) extends Renderable {
  def render: Formattable = Formattable.opt(
    "Values" -> values.map(Formattable(_)),
    "Key" -> Some(Formattable(key))
  )
}
