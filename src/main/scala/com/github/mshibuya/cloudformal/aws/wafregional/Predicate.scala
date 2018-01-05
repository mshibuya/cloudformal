package com.github.mshibuya.cloudformal.aws.wafregional

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafregional-rule-predicate.html
 */

case class Predicate(
    `type`: String,
    dataId: String,
    negated: Boolean) extends Renderable {
  def render: Formattable = Formattable.opt(
    "Type" -> Some(Formattable(`type`)),
    "DataId" -> Some(Formattable(dataId)),
    "Negated" -> Some(Formattable(negated))
  )
}
