package com.github.mshibuya.cloudformal.aws.iot

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-thingprincipalattachment.html
 */

trait ThingPrincipalAttachment extends Resource {
  val resourceTypeName = "AWS::IoT::ThingPrincipalAttachment"

  def principal: NonEmptyProperty[String]
  def thingName: NonEmptyProperty[String]

  def resourceProperties: FormattableMap = Formattable.withProperties(
    "Principal" -> principal,
    "ThingName" -> thingName
  )
}
