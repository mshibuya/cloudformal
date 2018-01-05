package com.github.mshibuya.cloudformal.aws.servicediscovery

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-servicediscovery-service-healthcheckconfig.html
 */

case class HealthCheckConfig(
    `type`: String,
    resourcePath: Option[String] = None,
    failureThreshold: Option[Double] = None) extends Renderable {
  def render: Formattable = Formattable.opt(
    "Type" -> Some(Formattable(`type`)),
    "ResourcePath" -> resourcePath.map(Formattable(_)),
    "FailureThreshold" -> failureThreshold.map(Formattable(_))
  )
}
