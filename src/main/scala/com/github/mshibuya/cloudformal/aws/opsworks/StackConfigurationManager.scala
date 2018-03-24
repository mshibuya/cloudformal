package com.github.mshibuya.cloudformal.aws.opsworks

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-stack-stackconfigmanager.html
 */

case class StackConfigurationManager(
    name: Property[String] = Empty,
    version: Property[String] = Empty) extends Expression[StackConfigurationManager] {
  def render: Formattable = Value(
    "Name" -> name,
    "Version" -> version
  )
}
