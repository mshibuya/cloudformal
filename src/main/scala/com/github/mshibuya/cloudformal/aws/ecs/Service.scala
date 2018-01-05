package com.github.mshibuya.cloudformal.aws.ecs

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html
 */

trait Service extends Resource {
  val resourceTypeName = "AWS::ECS::Service"

  def cluster: Option[String] = None
  def deploymentConfiguration: Option[DeploymentConfiguration] = None
  def desiredCount: Option[Int] = None
  def launchType: Option[String] = None
  def loadBalancers: Option[Seq[LoadBalancer]] = None
  def networkConfiguration: Option[NetworkConfiguration] = None
  def placementConstraints: Option[Seq[PlacementConstraint]] = None
  def placementStrategies: Option[Seq[PlacementStrategy]] = None
  def platformVersion: Option[String] = None
  def role: Option[String] = None
  def serviceName: Option[String] = None
  def taskDefinition: String

  def resourceProperties: FormattableMap = Formattable.opt(
    "Cluster" -> cluster.map(Formattable(_)),
    "DeploymentConfiguration" -> deploymentConfiguration.map(Formattable(_)),
    "DesiredCount" -> desiredCount.map(Formattable(_)),
    "LaunchType" -> launchType.map(Formattable(_)),
    "LoadBalancers" -> loadBalancers.map(Formattable(_)),
    "NetworkConfiguration" -> networkConfiguration.map(Formattable(_)),
    "PlacementConstraints" -> placementConstraints.map(Formattable(_)),
    "PlacementStrategies" -> placementStrategies.map(Formattable(_)),
    "PlatformVersion" -> platformVersion.map(Formattable(_)),
    "Role" -> role.map(Formattable(_)),
    "ServiceName" -> serviceName.map(Formattable(_)),
    "TaskDefinition" -> Some(Formattable(taskDefinition))
  )
}
