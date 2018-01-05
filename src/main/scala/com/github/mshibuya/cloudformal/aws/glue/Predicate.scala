package com.github.mshibuya.cloudformal.aws.glue

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-trigger-predicate.html
 */

case class Predicate(
    logical: Option[String] = None,
    conditions: Option[Seq[Condition]] = None) extends Renderable {
  def render: Formattable = Formattable.opt(
    "Logical" -> logical.map(Formattable(_)),
    "Conditions" -> conditions.map(Formattable(_))
  )
}
