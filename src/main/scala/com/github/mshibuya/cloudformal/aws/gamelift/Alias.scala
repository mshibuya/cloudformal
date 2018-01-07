package com.github.mshibuya.cloudformal.aws.gamelift

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-alias.html
 */

trait Alias extends Resource {
  val resourceTypeName = "AWS::GameLift::Alias"

  def description: Property[String] = Empty
  def name: NonEmptyProperty[String]
  def routingStrategy: NonEmptyProperty[RoutingStrategy]

  def resourceProperties: FormattableMap = Formattable.withProperties(
    "Description" -> description,
    "Name" -> name,
    "RoutingStrategy" -> routingStrategy
  )
}
