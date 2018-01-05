package com.github.mshibuya.cloudformal.aws.elasticloadbalancingv2

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-targetgroup.html
 */

trait TargetGroup extends Resource {
  val resourceTypeName = "AWS::ElasticLoadBalancingV2::TargetGroup"

  def healthCheckIntervalSeconds: Option[Int] = None
  def healthCheckPath: Option[String] = None
  def healthCheckPort: Option[String] = None
  def healthCheckProtocol: Option[String] = None
  def healthCheckTimeoutSeconds: Option[Int] = None
  def healthyThresholdCount: Option[Int] = None
  def matcher: Option[Matcher] = None
  def name: Option[String] = None
  def port: Int
  def protocol: String
  def tags: Option[Seq[Tag]] = None
  def targetGroupAttributes: Option[Seq[TargetGroupAttribute]] = None
  def targetType: Option[String] = None
  def targets: Option[Seq[TargetDescription]] = None
  def unhealthyThresholdCount: Option[Int] = None
  def vpcId: String

  def resourceProperties: FormattableMap = Formattable.opt(
    "HealthCheckIntervalSeconds" -> healthCheckIntervalSeconds.map(Formattable(_)),
    "HealthCheckPath" -> healthCheckPath.map(Formattable(_)),
    "HealthCheckPort" -> healthCheckPort.map(Formattable(_)),
    "HealthCheckProtocol" -> healthCheckProtocol.map(Formattable(_)),
    "HealthCheckTimeoutSeconds" -> healthCheckTimeoutSeconds.map(Formattable(_)),
    "HealthyThresholdCount" -> healthyThresholdCount.map(Formattable(_)),
    "Matcher" -> matcher.map(Formattable(_)),
    "Name" -> name.map(Formattable(_)),
    "Port" -> Some(Formattable(port)),
    "Protocol" -> Some(Formattable(protocol)),
    "Tags" -> tags.map(Formattable(_)),
    "TargetGroupAttributes" -> targetGroupAttributes.map(Formattable(_)),
    "TargetType" -> targetType.map(Formattable(_)),
    "Targets" -> targets.map(Formattable(_)),
    "UnhealthyThresholdCount" -> unhealthyThresholdCount.map(Formattable(_)),
    "VpcId" -> Some(Formattable(vpcId))
  )
}
