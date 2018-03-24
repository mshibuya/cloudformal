package com.github.mshibuya.cloudformal.aws.ecs

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-networkconfiguration.html
 */

case class NetworkConfiguration(
    awsvpcConfiguration: Property[AwsVpcConfiguration] = Empty) extends Expression[NetworkConfiguration] {
  def render: Formattable = Value(
    "AwsvpcConfiguration" -> awsvpcConfiguration
  )
}
