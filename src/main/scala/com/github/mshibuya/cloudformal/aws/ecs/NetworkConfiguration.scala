package com.github.mshibuya.cloudformal.aws.ecs

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-networkconfiguration.html
 */

case class NetworkConfiguration(
    awsvpcConfiguration: Property[AwsVpcConfiguration] = Empty) extends Renderable {
  def render: Formattable = Formattable.withProperties(
    "AwsvpcConfiguration" -> awsvpcConfiguration
  )
}
