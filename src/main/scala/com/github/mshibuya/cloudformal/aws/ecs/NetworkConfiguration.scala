package com.github.mshibuya.cloudformal.aws.ecs

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-networkconfiguration.html
 */

case class NetworkConfiguration(
    awsvpcConfiguration: Option[AwsVpcConfiguration] = None) extends Renderable {
  def render: Formattable = Formattable.opt(
    "AwsvpcConfiguration" -> awsvpcConfiguration.map(Formattable(_))
  )
}
