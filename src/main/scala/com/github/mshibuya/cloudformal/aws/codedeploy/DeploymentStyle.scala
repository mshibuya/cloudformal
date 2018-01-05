package com.github.mshibuya.cloudformal.aws.codedeploy

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-deploymentstyle.html
 */

case class DeploymentStyle(
    deploymentOption: Option[String] = None,
    deploymentType: Option[String] = None) extends Renderable {
  def render: Formattable = Formattable.opt(
    "DeploymentOption" -> deploymentOption.map(Formattable(_)),
    "DeploymentType" -> deploymentType.map(Formattable(_))
  )
}
