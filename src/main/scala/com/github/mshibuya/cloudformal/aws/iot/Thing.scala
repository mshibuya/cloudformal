package com.github.mshibuya.cloudformal.aws.iot

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-thing.html
 */

trait Thing extends Resource {
  val resourceTypeName = "AWS::IoT::Thing"

  def attributePayload: Option[AttributePayload] = None
  def thingName: Option[String] = None

  def resourceProperties: FormattableMap = Formattable.opt(
    "AttributePayload" -> attributePayload.map(Formattable(_)),
    "ThingName" -> thingName.map(Formattable(_))
  )
}
