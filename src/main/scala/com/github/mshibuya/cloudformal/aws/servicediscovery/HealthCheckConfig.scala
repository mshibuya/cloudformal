package com.github.mshibuya.cloudformal.aws.servicediscovery

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-servicediscovery-service-healthcheckconfig.html
 */

case class HealthCheckConfig(
    `type`: NonEmptyProperty[String],
    resourcePath: Property[String] = Empty,
    failureThreshold: Property[Double] = Empty) extends Renderable {
  def render: Formattable = Formattable.withProperties(
    "Type" -> `type`,
    "ResourcePath" -> resourcePath,
    "FailureThreshold" -> failureThreshold
  )
}
