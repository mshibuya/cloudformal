package com.github.mshibuya.cloudformal.aws.waf

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-waf-webacl-action.html
 */

case class WafAction(
    `type`: String) extends Renderable {
  def render: Formattable = Formattable.opt(
    "Type" -> Some(Formattable(`type`))
  )
}
