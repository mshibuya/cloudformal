package com.github.mshibuya.cloudformal.aws.opsworks

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-stack-elasticip.html
 */

case class ElasticIp(
    ip: NonEmptyProperty[String],
    name: Property[String] = Empty) extends Expression[ElasticIp] {
  def render: Formattable = Value(
    "Ip" -> ip,
    "Name" -> name
  )
}
