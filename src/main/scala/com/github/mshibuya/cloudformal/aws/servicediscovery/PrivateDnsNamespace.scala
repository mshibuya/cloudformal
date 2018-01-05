package com.github.mshibuya.cloudformal.aws.servicediscovery

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicediscovery-privatednsnamespace.html
 */

trait PrivateDnsNamespace extends Resource {
  val resourceTypeName = "AWS::ServiceDiscovery::PrivateDnsNamespace"

  def description: Option[String] = None
  def vpc: String
  def name: String

  def resourceProperties: FormattableMap = Formattable.opt(
    "Description" -> description.map(Formattable(_)),
    "Vpc" -> Some(Formattable(vpc)),
    "Name" -> Some(Formattable(name))
  )
}
