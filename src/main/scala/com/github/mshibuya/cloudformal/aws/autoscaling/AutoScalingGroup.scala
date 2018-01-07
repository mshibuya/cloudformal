package com.github.mshibuya.cloudformal.aws.autoscaling

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-group.html
 */

trait AutoScalingGroup extends Resource {
  val resourceTypeName = "AWS::AutoScaling::AutoScalingGroup"

  def availabilityZones: Property[Seq[String]] = Empty
  def cooldown: Property[String] = Empty
  def desiredCapacity: Property[String] = Empty
  def healthCheckGracePeriod: Property[Int] = Empty
  def healthCheckType: Property[String] = Empty
  def instanceId: Property[String] = Empty
  def launchConfigurationName: Property[String] = Empty
  def lifecycleHookSpecificationList: Property[Seq[LifecycleHookSpecification]] = Empty
  def loadBalancerNames: Property[Seq[String]] = Empty
  def maxSize: NonEmptyProperty[String]
  def metricsCollection: Property[Seq[MetricsCollection]] = Empty
  def minSize: NonEmptyProperty[String]
  def notificationConfigurations: Property[Seq[NotificationConfiguration]] = Empty
  def placementGroup: Property[String] = Empty
  def tags: Property[Seq[TagProperty]] = Empty
  def targetGroupARNs: Property[Seq[String]] = Empty
  def terminationPolicies: Property[Seq[String]] = Empty
  def vPCZoneIdentifier: Property[Seq[String]] = Empty

  def resourceProperties: FormattableMap = Formattable.withProperties(
    "AvailabilityZones" -> availabilityZones,
    "Cooldown" -> cooldown,
    "DesiredCapacity" -> desiredCapacity,
    "HealthCheckGracePeriod" -> healthCheckGracePeriod,
    "HealthCheckType" -> healthCheckType,
    "InstanceId" -> instanceId,
    "LaunchConfigurationName" -> launchConfigurationName,
    "LifecycleHookSpecificationList" -> lifecycleHookSpecificationList,
    "LoadBalancerNames" -> loadBalancerNames,
    "MaxSize" -> maxSize,
    "MetricsCollection" -> metricsCollection,
    "MinSize" -> minSize,
    "NotificationConfigurations" -> notificationConfigurations,
    "PlacementGroup" -> placementGroup,
    "Tags" -> tags,
    "TargetGroupARNs" -> targetGroupARNs,
    "TerminationPolicies" -> terminationPolicies,
    "VPCZoneIdentifier" -> vPCZoneIdentifier
  )
}
