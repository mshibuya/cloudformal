package com.github.mshibuya.cloudformal.aws.elasticloadbalancing

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb.html
 */

trait LoadBalancer extends Resource {
  val resourceTypeName = "AWS::ElasticLoadBalancing::LoadBalancer"

  def canonicalHostedZoneNameAttribute: Expression[String] = Fn.GetAtt(logicalId, "CanonicalHostedZoneName")
  def canonicalHostedZoneNameIDAttribute: Expression[String] = Fn.GetAtt(logicalId, "CanonicalHostedZoneNameID")
  def dNSNameAttribute: Expression[String] = Fn.GetAtt(logicalId, "DNSName")
  def sourceSecurityGroupGroupNameAttribute: Expression[String] = Fn.GetAtt(logicalId, "SourceSecurityGroup.GroupName")
  def sourceSecurityGroupOwnerAliasAttribute: Expression[String] = Fn.GetAtt(logicalId, "SourceSecurityGroup.OwnerAlias")

  def accessLoggingPolicy: Property[AccessLoggingPolicy] = Empty
  def appCookieStickinessPolicy: Property[Seq[AppCookieStickinessPolicy]] = Empty
  def availabilityZones: Property[Seq[String]] = Empty
  def connectionDrainingPolicy: Property[ConnectionDrainingPolicy] = Empty
  def connectionSettings: Property[ConnectionSettings] = Empty
  def crossZone: Property[Boolean] = Empty
  def healthCheck: Property[HealthCheck] = Empty
  def instances: Property[Seq[String]] = Empty
  def lBCookieStickinessPolicy: Property[Seq[LBCookieStickinessPolicy]] = Empty
  def listeners: NonEmptyProperty[Seq[Listeners]]
  def loadBalancerName: Property[String] = Empty
  def policies: Property[Seq[Policies]] = Empty
  def scheme: Property[String] = Empty
  def securityGroups: Property[Seq[String]] = Empty
  def subnets: Property[Seq[String]] = Empty
  def tags: Property[Seq[Tag]] = Empty

  def resourceProperties: FormattableMap = Formattable.withProperties(
    "AccessLoggingPolicy" -> accessLoggingPolicy,
    "AppCookieStickinessPolicy" -> appCookieStickinessPolicy,
    "AvailabilityZones" -> availabilityZones,
    "ConnectionDrainingPolicy" -> connectionDrainingPolicy,
    "ConnectionSettings" -> connectionSettings,
    "CrossZone" -> crossZone,
    "HealthCheck" -> healthCheck,
    "Instances" -> instances,
    "LBCookieStickinessPolicy" -> lBCookieStickinessPolicy,
    "Listeners" -> listeners,
    "LoadBalancerName" -> loadBalancerName,
    "Policies" -> policies,
    "Scheme" -> scheme,
    "SecurityGroups" -> securityGroups,
    "Subnets" -> subnets,
    "Tags" -> tags
  )
}
