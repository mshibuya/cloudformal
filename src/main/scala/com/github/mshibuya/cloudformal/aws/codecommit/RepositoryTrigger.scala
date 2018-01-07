package com.github.mshibuya.cloudformal.aws.codecommit

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codecommit-repository-repositorytrigger.html
 */

case class RepositoryTrigger(
    events: Property[Seq[String]] = Empty,
    branches: Property[Seq[String]] = Empty,
    customData: Property[String] = Empty,
    destinationArn: Property[String] = Empty,
    name: Property[String] = Empty) extends Renderable {
  def render: Formattable = Formattable.withProperties(
    "Events" -> events,
    "Branches" -> branches,
    "CustomData" -> customData,
    "DestinationArn" -> destinationArn,
    "Name" -> name
  )
}
