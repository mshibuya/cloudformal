package com.github.mshibuya.cloudformal.aws.elasticbeanstalk

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-beanstalk-environment-tier.html
 */

case class Tier(
    name: Option[String] = None,
    `type`: Option[String] = None,
    version: Option[String] = None) extends Renderable {
  def render: Formattable = Formattable.opt(
    "Name" -> name.map(Formattable(_)),
    "Type" -> `type`.map(Formattable(_)),
    "Version" -> version.map(Formattable(_))
  )
}
