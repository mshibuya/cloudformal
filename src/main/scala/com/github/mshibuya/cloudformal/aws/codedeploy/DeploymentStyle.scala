package com.github.mshibuya.cloudformal.aws.codedeploy

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-deploymentstyle.html
 */

case class DeploymentStyle(
    deploymentOption: Property[String] = Empty,
    deploymentType: Property[String] = Empty) extends Expression[DeploymentStyle] {
  def render: Formattable = Value(
    "DeploymentOption" -> deploymentOption,
    "DeploymentType" -> deploymentType
  )
}
