package com.github.mshibuya.cloudformal.aws.opsworks

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-stack-elasticip.html
 */

case class ElasticIp(
    ip: String,
    name: Option[String] = None) extends Renderable {
  def render: Formattable = Formattable.opt(
    "Ip" -> Some(Formattable(ip)),
    "Name" -> name.map(Formattable(_))
  )
}
