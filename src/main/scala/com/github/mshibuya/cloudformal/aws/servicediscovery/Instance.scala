package com.github.mshibuya.cloudformal.aws.servicediscovery

import argonaut.Json
import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicediscovery-instance.html
 */

trait Instance extends Resource {
  val resourceTypeName = "AWS::ServiceDiscovery::Instance"

  def instanceAttributes: Json
  def instanceId: Option[String] = None
  def serviceId: String

  def resourceProperties: FormattableMap = Formattable.opt(
    "InstanceAttributes" -> Some(Formattable(instanceAttributes)),
    "InstanceId" -> instanceId.map(Formattable(_)),
    "ServiceId" -> Some(Formattable(serviceId))
  )
}
