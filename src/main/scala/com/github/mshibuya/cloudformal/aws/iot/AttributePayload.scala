package com.github.mshibuya.cloudformal.aws.iot

import com.github.mshibuya.cloudformal.model._

import scala.collection.immutable.ListMap

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-thing-attributepayload.html
 */

case class AttributePayload(
    attributes: Property[ListMap[String, String]] = Empty) extends Renderable {
  def render: Formattable = Formattable.withProperties(
    "Attributes" -> attributes
  )
}
