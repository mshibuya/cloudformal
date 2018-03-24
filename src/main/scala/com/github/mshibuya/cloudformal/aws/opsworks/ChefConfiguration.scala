package com.github.mshibuya.cloudformal.aws.opsworks

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-stack-chefconfiguration.html
 */

case class ChefConfiguration(
    berkshelfVersion: Property[String] = Empty,
    manageBerkshelf: Property[Boolean] = Empty) extends Expression[ChefConfiguration] {
  def render: Formattable = Value(
    "BerkshelfVersion" -> berkshelfVersion,
    "ManageBerkshelf" -> manageBerkshelf
  )
}
