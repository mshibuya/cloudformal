package com.github.mshibuya.cloudformal.aws.codedeploy

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-autorollbackconfiguration.html
 */

case class AutoRollbackConfiguration(
    enabled: Option[Boolean] = None,
    events: Option[Seq[String]] = None) extends Renderable {
  def render: Formattable = Formattable.opt(
    "Enabled" -> enabled.map(Formattable(_)),
    "Events" -> events.map(Formattable(_))
  )
}
