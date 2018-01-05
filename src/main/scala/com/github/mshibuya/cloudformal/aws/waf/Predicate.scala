package com.github.mshibuya.cloudformal.aws.waf

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-waf-rule-predicates.html
 */

case class Predicate(
    dataId: String,
    negated: Boolean,
    `type`: String) extends Renderable {
  def render: Formattable = Formattable.opt(
    "DataId" -> Some(Formattable(dataId)),
    "Negated" -> Some(Formattable(negated)),
    "Type" -> Some(Formattable(`type`))
  )
}
