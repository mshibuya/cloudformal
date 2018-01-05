package com.github.mshibuya.cloudformal.aws.events

import com.github.mshibuya.cloudformal.model._

import scala.collection.immutable.ListMap

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-inputtransformer.html
 */

case class InputTransformer(
    inputPathsMap: Option[ListMap[String, String]] = None,
    inputTemplate: String) extends Renderable {
  def render: Formattable = Formattable.opt(
    "InputPathsMap" -> inputPathsMap.map(Formattable(_)),
    "InputTemplate" -> Some(Formattable(inputTemplate))
  )
}
