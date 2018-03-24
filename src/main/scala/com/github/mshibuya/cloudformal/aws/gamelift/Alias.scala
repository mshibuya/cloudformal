package com.github.mshibuya.cloudformal.aws.gamelift

import com.github.mshibuya.cloudformal.model._
import com.github.mshibuya.cloudformal.model.policy._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-alias.html
 */

trait Alias extends Resource[Alias] with Resource.WithDeletionPolicy {
  val resourceTypeName = "AWS::GameLift::Alias"

  def description: Property[String] = Empty
  def name: NonEmptyProperty[String]
  def routingStrategy: NonEmptyProperty[RoutingStrategy]

  def render(): MapValue[_] = Value(
    "Description" -> description,
    "Name" -> name,
    "RoutingStrategy" -> routingStrategy
  )
}
