package com.github.mshibuya.cloudformal.aws.wafregional

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafregional-webacl-action.html
 */

case class Action(
    `type`: NonEmptyProperty[String]) extends Expression[Action] {
  def render: Formattable = Value(
    "Type" -> `type`
  )
}
