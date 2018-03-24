package com.github.mshibuya.cloudformal.aws.iot

import com.github.mshibuya.cloudformal.model._
import com.github.mshibuya.cloudformal.model.policy._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-thing.html
 */

trait Thing extends Resource[Thing] with Resource.WithDeletionPolicy {
  val resourceTypeName = "AWS::IoT::Thing"

  def attributePayload: Property[AttributePayload] = Empty
  def thingName: Property[String] = Empty

  def render(): MapValue[_] = Value(
    "AttributePayload" -> attributePayload,
    "ThingName" -> thingName
  )
}
