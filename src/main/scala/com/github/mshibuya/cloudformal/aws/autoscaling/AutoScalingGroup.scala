package com.github.mshibuya.cloudformal.aws.autoscaling

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-group.html
 */

trait AutoScalingGroup extends Resource {
  val resourceTypeName = "AWS::AutoScaling::AutoScalingGroup"

  def availabilityZones: Option[Seq[String]] = None
  def cooldown: Option[String] = None
  def desiredCapacity: Option[String] = None
  def healthCheckGracePeriod: Option[Int] = None
  def healthCheckType: Option[String] = None
  def instanceId: Option[String] = None
  def launchConfigurationName: Option[String] = None
  def lifecycleHookSpecificationList: Option[Seq[LifecycleHookSpecification]] = None
  def loadBalancerNames: Option[Seq[String]] = None
  def maxSize: String
  def metricsCollection: Option[Seq[MetricsCollection]] = None
  def minSize: String
  def notificationConfigurations: Option[Seq[NotificationConfiguration]] = None
  def placementGroup: Option[String] = None
  def tags: Option[Seq[TagProperty]] = None
  def targetGroupARNs: Option[Seq[String]] = None
  def terminationPolicies: Option[Seq[String]] = None
  def vPCZoneIdentifier: Option[Seq[String]] = None

  def resourceProperties: FormattableMap = Formattable.opt(
    "AvailabilityZones" -> availabilityZones.map(Formattable(_)),
    "Cooldown" -> cooldown.map(Formattable(_)),
    "DesiredCapacity" -> desiredCapacity.map(Formattable(_)),
    "HealthCheckGracePeriod" -> healthCheckGracePeriod.map(Formattable(_)),
    "HealthCheckType" -> healthCheckType.map(Formattable(_)),
    "InstanceId" -> instanceId.map(Formattable(_)),
    "LaunchConfigurationName" -> launchConfigurationName.map(Formattable(_)),
    "LifecycleHookSpecificationList" -> lifecycleHookSpecificationList.map(Formattable(_)),
    "LoadBalancerNames" -> loadBalancerNames.map(Formattable(_)),
    "MaxSize" -> Some(Formattable(maxSize)),
    "MetricsCollection" -> metricsCollection.map(Formattable(_)),
    "MinSize" -> Some(Formattable(minSize)),
    "NotificationConfigurations" -> notificationConfigurations.map(Formattable(_)),
    "PlacementGroup" -> placementGroup.map(Formattable(_)),
    "Tags" -> tags.map(Formattable(_)),
    "TargetGroupARNs" -> targetGroupARNs.map(Formattable(_)),
    "TerminationPolicies" -> terminationPolicies.map(Formattable(_)),
    "VPCZoneIdentifier" -> vPCZoneIdentifier.map(Formattable(_))
  )
}
