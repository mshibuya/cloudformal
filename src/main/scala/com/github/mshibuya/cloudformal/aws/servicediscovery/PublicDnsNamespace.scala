package com.github.mshibuya.cloudformal.aws.servicediscovery

import com.github.mshibuya.cloudformal.model._
import com.github.mshibuya.cloudformal.model.policy._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicediscovery-publicdnsnamespace.html
 */

trait PublicDnsNamespace extends Resource with Resource.WithDeletionPolicy {
  val resourceTypeName = "AWS::ServiceDiscovery::PublicDnsNamespace"

  object attributes {
    val id: Expression[String] = Fn.GetAtt(logicalId, "Id")
    val arn: Expression[String] = Fn.GetAtt(logicalId, "Arn")
  }

  def description: Property[String] = Empty
  def name: NonEmptyProperty[String]

  def resourceProperties: FormattableMap = Formattable.withProperties(
    "Description" -> description,
    "Name" -> name
  )
}
