package com.github.mshibuya.cloudformal.aws.opsworks

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-recipes.html
 */

case class Recipes(
    configure: Option[Seq[String]] = None,
    deploy: Option[Seq[String]] = None,
    setup: Option[Seq[String]] = None,
    shutdown: Option[Seq[String]] = None,
    undeploy: Option[Seq[String]] = None) extends Renderable {
  def render: Formattable = Formattable.opt(
    "Configure" -> configure.map(Formattable(_)),
    "Deploy" -> deploy.map(Formattable(_)),
    "Setup" -> setup.map(Formattable(_)),
    "Shutdown" -> shutdown.map(Formattable(_)),
    "Undeploy" -> undeploy.map(Formattable(_))
  )
}
