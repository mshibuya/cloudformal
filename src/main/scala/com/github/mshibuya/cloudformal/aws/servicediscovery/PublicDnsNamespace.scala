package com.github.mshibuya.cloudformal.aws.servicediscovery

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicediscovery-publicdnsnamespace.html
 */

trait PublicDnsNamespace extends Resource {
  val resourceTypeName = "AWS::ServiceDiscovery::PublicDnsNamespace"

  def idAttribute: Expression[String] = Fn.GetAtt(logicalId, "Id")
  def arnAttribute: Expression[String] = Fn.GetAtt(logicalId, "Arn")

  def description: Property[String] = Empty
  def name: NonEmptyProperty[String]

  def resourceProperties: FormattableMap = Formattable.withProperties(
    "Description" -> description,
    "Name" -> name
  )
}
