package com.github.mshibuya.cloudformal.aws.elasticloadbalancing

import argonaut.Json
import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb-policy.html
 */

case class Policies(
    attributes: Seq[Json],
    instancePorts: Option[Seq[String]] = None,
    loadBalancerPorts: Option[Seq[String]] = None,
    policyName: String,
    policyType: String) extends Renderable {
  def render: Formattable = Formattable.opt(
    "Attributes" -> Some(Formattable(attributes)),
    "InstancePorts" -> instancePorts.map(Formattable(_)),
    "LoadBalancerPorts" -> loadBalancerPorts.map(Formattable(_)),
    "PolicyName" -> Some(Formattable(policyName)),
    "PolicyType" -> Some(Formattable(policyType))
  )
}
