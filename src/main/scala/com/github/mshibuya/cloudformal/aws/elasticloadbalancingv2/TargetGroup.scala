package com.github.mshibuya.cloudformal.aws.elasticloadbalancingv2

import com.github.mshibuya.cloudformal.model._
import com.github.mshibuya.cloudformal.model.policy._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-targetgroup.html
 */

trait TargetGroup extends Resource with Resource.WithDeletionPolicy {
  val resourceTypeName = "AWS::ElasticLoadBalancingV2::TargetGroup"

  object attributes {
    val loadBalancerArns: Expression[Seq[String]] = Fn.GetAtt(logicalId, "LoadBalancerArns")
    val targetGroupFullName: Expression[String] = Fn.GetAtt(logicalId, "TargetGroupFullName")
    val targetGroupName: Expression[String] = Fn.GetAtt(logicalId, "TargetGroupName")
  }

  def healthCheckIntervalSeconds: Property[Int] = Empty
  def healthCheckPath: Property[String] = Empty
  def healthCheckPort: Property[String] = Empty
  def healthCheckProtocol: Property[String] = Empty
  def healthCheckTimeoutSeconds: Property[Int] = Empty
  def healthyThresholdCount: Property[Int] = Empty
  def matcher: Property[Matcher] = Empty
  def name: Property[String] = Empty
  def port: NonEmptyProperty[Int]
  def protocol: NonEmptyProperty[String]
  def tags: Property[Seq[Tag]] = Empty
  def targetGroupAttributes: Property[Seq[TargetGroupAttribute]] = Empty
  def targetType: Property[String] = Empty
  def targets: Property[Seq[TargetDescription]] = Empty
  def unhealthyThresholdCount: Property[Int] = Empty
  def vpcId: NonEmptyProperty[String]

  def resourceProperties: FormattableMap = Formattable.withProperties(
    "HealthCheckIntervalSeconds" -> healthCheckIntervalSeconds,
    "HealthCheckPath" -> healthCheckPath,
    "HealthCheckPort" -> healthCheckPort,
    "HealthCheckProtocol" -> healthCheckProtocol,
    "HealthCheckTimeoutSeconds" -> healthCheckTimeoutSeconds,
    "HealthyThresholdCount" -> healthyThresholdCount,
    "Matcher" -> matcher,
    "Name" -> name,
    "Port" -> port,
    "Protocol" -> protocol,
    "Tags" -> tags,
    "TargetGroupAttributes" -> targetGroupAttributes,
    "TargetType" -> targetType,
    "Targets" -> targets,
    "UnhealthyThresholdCount" -> unhealthyThresholdCount,
    "VpcId" -> vpcId
  )
}
