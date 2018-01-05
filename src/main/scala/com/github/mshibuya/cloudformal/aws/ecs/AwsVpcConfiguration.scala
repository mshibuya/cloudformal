package com.github.mshibuya.cloudformal.aws.ecs

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-awsvpcconfiguration.html
 */

case class AwsVpcConfiguration(
    assignPublicIp: Option[String] = None,
    securityGroups: Option[Seq[String]] = None,
    subnets: Seq[String]) extends Renderable {
  def render: Formattable = Formattable.opt(
    "AssignPublicIp" -> assignPublicIp.map(Formattable(_)),
    "SecurityGroups" -> securityGroups.map(Formattable(_)),
    "Subnets" -> Some(Formattable(subnets))
  )
}
