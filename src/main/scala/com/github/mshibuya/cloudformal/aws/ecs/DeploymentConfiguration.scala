package com.github.mshibuya.cloudformal.aws.ecs

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-deploymentconfiguration.html
 */

case class DeploymentConfiguration(
    maximumPercent: Option[Int] = None,
    minimumHealthyPercent: Option[Int] = None) extends Renderable {
  def render: Formattable = Formattable.opt(
    "MaximumPercent" -> maximumPercent.map(Formattable(_)),
    "MinimumHealthyPercent" -> minimumHealthyPercent.map(Formattable(_))
  )
}
