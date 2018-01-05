package com.github.mshibuya.cloudformal.aws.route53

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-hostedzone-hostedzoneconfig.html
 */

case class HostedZoneConfig(
    comment: Option[String] = None) extends Renderable {
  def render: Formattable = Formattable.opt(
    "Comment" -> comment.map(Formattable(_))
  )
}
