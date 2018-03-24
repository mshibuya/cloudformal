package com.github.mshibuya.cloudformal.aws.ecs

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-deploymentconfiguration.html
 */

case class DeploymentConfiguration(
    maximumPercent: Property[Int] = Empty,
    minimumHealthyPercent: Property[Int] = Empty) extends Expression[DeploymentConfiguration] {
  def render: Formattable = Value(
    "MaximumPercent" -> maximumPercent,
    "MinimumHealthyPercent" -> minimumHealthyPercent
  )
}
