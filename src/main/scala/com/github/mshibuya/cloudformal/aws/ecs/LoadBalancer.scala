package com.github.mshibuya.cloudformal.aws.ecs

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-loadbalancers.html
 */

case class LoadBalancer(
    containerName: Option[String] = None,
    containerPort: Int,
    loadBalancerName: Option[String] = None,
    targetGroupArn: Option[String] = None) extends Renderable {
  def render: Formattable = Formattable.opt(
    "ContainerName" -> containerName.map(Formattable(_)),
    "ContainerPort" -> Some(Formattable(containerPort)),
    "LoadBalancerName" -> loadBalancerName.map(Formattable(_)),
    "TargetGroupArn" -> targetGroupArn.map(Formattable(_))
  )
}
