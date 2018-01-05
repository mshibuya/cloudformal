package com.github.mshibuya.cloudformal.aws.elasticloadbalancingv2

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-loadbalancer.html
 */

trait LoadBalancer extends Resource {
  val resourceTypeName = "AWS::ElasticLoadBalancingV2::LoadBalancer"

  def ipAddressType: Option[String] = None
  def loadBalancerAttributes: Option[Seq[LoadBalancerAttribute]] = None
  def name: Option[String] = None
  def scheme: Option[String] = None
  def securityGroups: Option[Seq[String]] = None
  def subnetMappings: Option[Seq[SubnetMapping]] = None
  def subnets: Option[Seq[String]] = None
  def tags: Option[Seq[Tag]] = None
  def `type`: Option[String] = None

  def resourceProperties: FormattableMap = Formattable.opt(
    "IpAddressType" -> ipAddressType.map(Formattable(_)),
    "LoadBalancerAttributes" -> loadBalancerAttributes.map(Formattable(_)),
    "Name" -> name.map(Formattable(_)),
    "Scheme" -> scheme.map(Formattable(_)),
    "SecurityGroups" -> securityGroups.map(Formattable(_)),
    "SubnetMappings" -> subnetMappings.map(Formattable(_)),
    "Subnets" -> subnets.map(Formattable(_)),
    "Tags" -> tags.map(Formattable(_)),
    "Type" -> `type`.map(Formattable(_))
  )
}
