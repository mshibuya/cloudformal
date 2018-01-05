package com.github.mshibuya.cloudformal.aws.opsworks

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-stack-chefconfiguration.html
 */

case class ChefConfiguration(
    berkshelfVersion: Option[String] = None,
    manageBerkshelf: Option[Boolean] = None) extends Renderable {
  def render: Formattable = Formattable.opt(
    "BerkshelfVersion" -> berkshelfVersion.map(Formattable(_)),
    "ManageBerkshelf" -> manageBerkshelf.map(Formattable(_))
  )
}
