package com.github.mshibuya.cloudformal.aws.servicediscovery

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicediscovery-privatednsnamespace.html
 */

trait PrivateDnsNamespace extends Resource {
  val resourceTypeName = "AWS::ServiceDiscovery::PrivateDnsNamespace"

  def idAttribute: Expression[String] = Fn.GetAtt(logicalId, "Id")
  def arnAttribute: Expression[String] = Fn.GetAtt(logicalId, "Arn")

  def description: Property[String] = Empty
  def vpc: NonEmptyProperty[String]
  def name: NonEmptyProperty[String]

  def resourceProperties: FormattableMap = Formattable.withProperties(
    "Description" -> description,
    "Vpc" -> vpc,
    "Name" -> name
  )
}
