package com.github.mshibuya.cloudformal.aws.gamelift

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-alias.html
 */

trait Alias extends Resource {
  val resourceTypeName = "AWS::GameLift::Alias"

  def description: Option[String] = None
  def name: String
  def routingStrategy: RoutingStrategy

  def resourceProperties: FormattableMap = Formattable.opt(
    "Description" -> description.map(Formattable(_)),
    "Name" -> Some(Formattable(name)),
    "RoutingStrategy" -> Some(Formattable(routingStrategy))
  )
}
