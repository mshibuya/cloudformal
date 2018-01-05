package com.github.mshibuya.cloudformal.aws.codecommit

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codecommit-repository-repositorytrigger.html
 */

case class RepositoryTrigger(
    events: Option[Seq[String]] = None,
    branches: Option[Seq[String]] = None,
    customData: Option[String] = None,
    destinationArn: Option[String] = None,
    name: Option[String] = None) extends Renderable {
  def render: Formattable = Formattable.opt(
    "Events" -> events.map(Formattable(_)),
    "Branches" -> branches.map(Formattable(_)),
    "CustomData" -> customData.map(Formattable(_)),
    "DestinationArn" -> destinationArn.map(Formattable(_)),
    "Name" -> name.map(Formattable(_))
  )
}
