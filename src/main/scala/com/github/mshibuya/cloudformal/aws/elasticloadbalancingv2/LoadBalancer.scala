package com.github.mshibuya.cloudformal.aws.elasticloadbalancingv2

import com.github.mshibuya.cloudformal.model._
import com.github.mshibuya.cloudformal.model.policy._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-loadbalancer.html
 */

trait LoadBalancer extends Resource with Resource.WithDeletionPolicy {
  val resourceTypeName = "AWS::ElasticLoadBalancingV2::LoadBalancer"

  def canonicalHostedZoneIDAttribute: Expression[String] = Fn.GetAtt(logicalId, "CanonicalHostedZoneID")
  def dNSNameAttribute: Expression[String] = Fn.GetAtt(logicalId, "DNSName")
  def loadBalancerFullNameAttribute: Expression[String] = Fn.GetAtt(logicalId, "LoadBalancerFullName")
  def loadBalancerNameAttribute: Expression[String] = Fn.GetAtt(logicalId, "LoadBalancerName")
  def securityGroupsAttribute: Expression[Seq[String]] = Fn.GetAtt(logicalId, "SecurityGroups")

  def ipAddressType: Property[String] = Empty
  def loadBalancerAttributes: Property[Seq[LoadBalancerAttribute]] = Empty
  def name: Property[String] = Empty
  def scheme: Property[String] = Empty
  def securityGroups: Property[Seq[String]] = Empty
  def subnetMappings: Property[Seq[SubnetMapping]] = Empty
  def subnets: Property[Seq[String]] = Empty
  def tags: Property[Seq[Tag]] = Empty
  def `type`: Property[String] = Empty

  def resourceProperties: FormattableMap = Formattable.withProperties(
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
