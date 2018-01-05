package com.github.mshibuya.cloudformal.aws.cloudtrail

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudtrail-trail-dataresource.html
 */

case class DataResource(
    `type`: String,
    values: Option[Seq[String]] = None) extends Renderable {
  def render: Formattable = Formattable.opt(
    "Type" -> Some(Formattable(`type`)),
    "Values" -> values.map(Formattable(_))
  )
}
