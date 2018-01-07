package com.github.mshibuya.cloudformal.aws.opsworks

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-recipes.html
 */

case class Recipes(
    configure: Property[Seq[String]] = Empty,
    deploy: Property[Seq[String]] = Empty,
    setup: Property[Seq[String]] = Empty,
    shutdown: Property[Seq[String]] = Empty,
    undeploy: Property[Seq[String]] = Empty) extends Renderable {
  def render: Formattable = Formattable.withProperties(
    "Configure" -> configure,
    "Deploy" -> deploy,
    "Setup" -> setup,
    "Shutdown" -> shutdown,
    "Undeploy" -> undeploy
  )
}
