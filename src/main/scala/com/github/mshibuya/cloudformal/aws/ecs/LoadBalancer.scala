package com.github.mshibuya.cloudformal.aws.ecs

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-loadbalancers.html
 */

case class LoadBalancer(
    containerName: Property[String] = Empty,
    containerPort: NonEmptyProperty[Int],
    loadBalancerName: Property[String] = Empty,
    targetGroupArn: Property[String] = Empty) extends Expression[LoadBalancer] {
  def render: Formattable = Value(
    "ContainerName" -> containerName,
    "ContainerPort" -> containerPort,
    "LoadBalancerName" -> loadBalancerName,
    "TargetGroupArn" -> targetGroupArn
  )
}
