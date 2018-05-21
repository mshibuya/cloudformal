package com.github.mshibuya.cloudformal.aws.ec2

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-elasticgpuspecification.html
 */

case class ElasticGpuSpecification(
    `type`: Property[String] = Empty) extends Expression[ElasticGpuSpecification] {
  def render: Formattable = Value(
    "Type" -> `type`
  )
}
