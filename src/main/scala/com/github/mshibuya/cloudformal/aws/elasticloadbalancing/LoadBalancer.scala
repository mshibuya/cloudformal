package com.github.mshibuya.cloudformal.aws.elasticloadbalancing

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb.html
 */

trait LoadBalancer extends Resource {
  val resourceTypeName = "AWS::ElasticLoadBalancing::LoadBalancer"

  def accessLoggingPolicy: Option[AccessLoggingPolicy] = None
  def appCookieStickinessPolicy: Option[Seq[AppCookieStickinessPolicy]] = None
  def availabilityZones: Option[Seq[String]] = None
  def connectionDrainingPolicy: Option[ConnectionDrainingPolicy] = None
  def connectionSettings: Option[ConnectionSettings] = None
  def crossZone: Option[Boolean] = None
  def healthCheck: Option[HealthCheck] = None
  def instances: Option[Seq[String]] = None
  def lBCookieStickinessPolicy: Option[Seq[LBCookieStickinessPolicy]] = None
  def listeners: Seq[Listeners]
  def loadBalancerName: Option[String] = None
  def policies: Option[Seq[Policies]] = None
  def scheme: Option[String] = None
  def securityGroups: Option[Seq[String]] = None
  def subnets: Option[Seq[String]] = None
  def tags: Option[Seq[Tag]] = None

  def resourceProperties: FormattableMap = Formattable.opt(
    "AccessLoggingPolicy" -> accessLoggingPolicy.map(Formattable(_)),
    "AppCookieStickinessPolicy" -> appCookieStickinessPolicy.map(Formattable(_)),
    "AvailabilityZones" -> availabilityZones.map(Formattable(_)),
    "ConnectionDrainingPolicy" -> connectionDrainingPolicy.map(Formattable(_)),
    "ConnectionSettings" -> connectionSettings.map(Formattable(_)),
    "CrossZone" -> crossZone.map(Formattable(_)),
    "HealthCheck" -> healthCheck.map(Formattable(_)),
    "Instances" -> instances.map(Formattable(_)),
    "LBCookieStickinessPolicy" -> lBCookieStickinessPolicy.map(Formattable(_)),
    "Listeners" -> Some(Formattable(listeners)),
    "LoadBalancerName" -> loadBalancerName.map(Formattable(_)),
    "Policies" -> policies.map(Formattable(_)),
    "Scheme" -> scheme.map(Formattable(_)),
    "SecurityGroups" -> securityGroups.map(Formattable(_)),
    "Subnets" -> subnets.map(Formattable(_)),
    "Tags" -> tags.map(Formattable(_))
  )
}
