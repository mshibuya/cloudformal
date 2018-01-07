package com.github.mshibuya.cloudformal.aws.servicediscovery

import argonaut.Json
import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicediscovery-instance.html
 */

trait Instance extends Resource {
  val resourceTypeName = "AWS::ServiceDiscovery::Instance"

  def instanceAttributes: NonEmptyProperty[Json]
  def instanceId: Property[String] = Empty
  def serviceId: NonEmptyProperty[String]

  def resourceProperties: FormattableMap = Formattable.withProperties(
    "InstanceAttributes" -> instanceAttributes,
    "InstanceId" -> instanceId,
    "ServiceId" -> serviceId
  )
}
