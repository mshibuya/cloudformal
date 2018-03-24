package com.github.mshibuya.cloudformal.aws.elasticloadbalancingv2

import com.github.mshibuya.cloudformal.model._
import com.github.mshibuya.cloudformal.model.policy._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-loadbalancer.html
 */

trait LoadBalancer extends Resource[LoadBalancer] with Resource.WithDeletionPolicy {
  val resourceTypeName = "AWS::ElasticLoadBalancingV2::LoadBalancer"

  object attributes {
    val canonicalHostedZoneID: Expression[String] = Fn.GetAtt(logicalId, "CanonicalHostedZoneID")
    val dnsName: Expression[String] = Fn.GetAtt(logicalId, "DNSName")
    val loadBalancerFullName: Expression[String] = Fn.GetAtt(logicalId, "LoadBalancerFullName")
    val loadBalancerName: Expression[String] = Fn.GetAtt(logicalId, "LoadBalancerName")
    val securityGroups: Expression[Seq[String]] = Fn.GetAtt(logicalId, "SecurityGroups")
  }

  def ipAddressType: Property[String] = Empty
  def loadBalancerAttributes: Property[Seq[LoadBalancerAttribute]] = Empty
  def name: Property[String] = Empty
  def scheme: Property[String] = Empty
  def securityGroups: Property[Seq[String]] = Empty
  def subnetMappings: Property[Seq[SubnetMapping]] = Empty
  def subnets: Property[Seq[String]] = Empty
  def tags: Property[Seq[Tag]] = Empty
  def `type`: Property[String] = Empty

  def render(): MapValue[_] = Value(
    "IpAddressType" -> ipAddressType,
    "LoadBalancerAttributes" -> loadBalancerAttributes,
    "Name" -> name,
    "Scheme" -> scheme,
    "SecurityGroups" -> securityGroups,
    "SubnetMappings" -> subnetMappings,
    "Subnets" -> subnets,
    "Tags" -> tags,
    "Type" -> `type`
  )
}
