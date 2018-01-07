package com.github.mshibuya.cloudformal.aws.ecs

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-awsvpcconfiguration.html
 */

case class AwsVpcConfiguration(
    assignPublicIp: Property[String] = Empty,
    securityGroups: Property[Seq[String]] = Empty,
    subnets: NonEmptyProperty[Seq[String]]) extends Renderable {
  def render: Formattable = Formattable.withProperties(
    "AssignPublicIp" -> assignPublicIp,
    "SecurityGroups" -> securityGroups,
    "Subnets" -> subnets
  )
}
