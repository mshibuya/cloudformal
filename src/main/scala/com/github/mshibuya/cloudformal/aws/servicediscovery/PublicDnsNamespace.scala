package com.github.mshibuya.cloudformal.aws.servicediscovery

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicediscovery-publicdnsnamespace.html
 */

trait PublicDnsNamespace extends Resource {
  val resourceTypeName = "AWS::ServiceDiscovery::PublicDnsNamespace"

  def description: Option[String] = None
  def name: String

  def resourceProperties: FormattableMap = Formattable.opt(
    "Description" -> description.map(Formattable(_)),
    "Name" -> Some(Formattable(name))
  )
}
