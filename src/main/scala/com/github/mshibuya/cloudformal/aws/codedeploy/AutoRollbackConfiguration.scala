package com.github.mshibuya.cloudformal.aws.codedeploy

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-autorollbackconfiguration.html
 */

case class AutoRollbackConfiguration(
    enabled: Property[Boolean] = Empty,
    events: Property[Seq[String]] = Empty) extends Expression[AutoRollbackConfiguration] {
  def render: Formattable = Value(
    "Enabled" -> enabled,
    "Events" -> events
  )
}
