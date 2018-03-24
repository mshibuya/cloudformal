package com.github.mshibuya.cloudformal.aws.events

import com.github.mshibuya.cloudformal.model._

import scala.collection.immutable.ListMap

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-inputtransformer.html
 */

case class InputTransformer(
    inputPathsMap: Property[ListMap[String, String]] = Empty,
    inputTemplate: NonEmptyProperty[String]) extends Expression[InputTransformer] {
  def render: Formattable = Value(
    "InputPathsMap" -> inputPathsMap,
    "InputTemplate" -> inputTemplate
  )
}
