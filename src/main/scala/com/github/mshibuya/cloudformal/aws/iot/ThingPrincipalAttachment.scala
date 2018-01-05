package com.github.mshibuya.cloudformal.aws.iot

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-thingprincipalattachment.html
 */

trait ThingPrincipalAttachment extends Resource {
  val resourceTypeName = "AWS::IoT::ThingPrincipalAttachment"

  def principal: String
  def thingName: String

  def resourceProperties: FormattableMap = Formattable.opt(
    "Principal" -> Some(Formattable(principal)),
    "ThingName" -> Some(Formattable(thingName))
  )
}
