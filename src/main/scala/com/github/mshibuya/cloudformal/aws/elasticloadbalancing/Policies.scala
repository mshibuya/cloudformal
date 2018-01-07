package com.github.mshibuya.cloudformal.aws.elasticloadbalancing

import argonaut.Json
import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb-policy.html
 */

case class Policies(
    attributes: NonEmptyProperty[Seq[Json]],
    instancePorts: Property[Seq[String]] = Empty,
    loadBalancerPorts: Property[Seq[String]] = Empty,
    policyName: NonEmptyProperty[String],
    policyType: NonEmptyProperty[String]) extends Renderable {
  def render: Formattable = Formattable.withProperties(
    "Attributes" -> attributes,
    "InstancePorts" -> instancePorts,
    "LoadBalancerPorts" -> loadBalancerPorts,
    "PolicyName" -> policyName,
    "PolicyType" -> policyType
  )
}
