package com.github.mshibuya.cloudformal.aws.waf

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-waf-bytematchset-bytematchtuples-fieldtomatch.html
 */

case class FieldToMatch(
    data: Option[String] = None,
    `type`: String) extends Renderable {
  def render: Formattable = Formattable.opt(
    "Data" -> data.map(Formattable(_)),
    "Type" -> Some(Formattable(`type`))
  )
}
