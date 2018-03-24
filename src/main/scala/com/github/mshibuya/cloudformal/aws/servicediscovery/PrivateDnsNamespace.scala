package com.github.mshibuya.cloudformal.aws.servicediscovery

import com.github.mshibuya.cloudformal.model._
import com.github.mshibuya.cloudformal.model.policy._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicediscovery-privatednsnamespace.html
 */

trait PrivateDnsNamespace extends Resource[PrivateDnsNamespace] with Resource.WithDeletionPolicy {
  val resourceTypeName = "AWS::ServiceDiscovery::PrivateDnsNamespace"

  object attributes {
    val id: Expression[String] = Fn.GetAtt(logicalId, "Id")
    val arn: Expression[String] = Fn.GetAtt(logicalId, "Arn")
  }

  def description: Property[String] = Empty
  def vpc: NonEmptyProperty[String]
  def name: NonEmptyProperty[String]

  def render(): MapValue[_] = Value(
    "Description" -> description,
    "Vpc" -> vpc,
    "Name" -> name
  )
}
